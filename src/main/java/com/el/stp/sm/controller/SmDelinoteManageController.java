package com.el.stp.sm.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.sm.domain.SmDelinoteManageCondition;
import com.el.stp.sm.domain.TDelinoteDeliDomain;
import com.el.stp.sm.domain.TDelinoteProdDomain;
import com.el.stp.sm.mapper.SmDelinoteManageMapper;
import com.el.stp.sm.service.SmDelinoteManageService;
import com.el.sys.service.DbAuditService;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 发货通知单处理
 * Created by xueyu on 2016/8/3.
 */
@RestController
@RequestMapping("/api/sm/sm002")
public class SmDelinoteManageController {

    @Autowired
    private SmDelinoteManageMapper smDelinoteManageMapper;

    @Autowired
    private SmDelinoteManageService smDelinoteManageService;

    @Autowired
    private DbAuditService dbAuditService;

    /**
     * 查询发货通知单列表
     * @param condition 查询条件
     * @return 发货通知单列表
     */
    @RequestMapping("/page/list")
    public PageUtil list(SmDelinoteManageCondition condition) {
        if(condition!=null && !StringUtils.isEmpty(condition.getLineStatus())){
            String lineStatus = condition.getLineStatus();
            condition.setLineStatus(lineStatus(lineStatus));
        }
        Integer rowCount = smDelinoteManageMapper.countByParam(condition);
        if(condition!=null)condition.setRowCount(rowCount);
        List<TDelinoteProdDomain> list= rowCount>0?smDelinoteManageMapper.selectByParam(condition):null;

        return PageUtil.pageBean(list,condition);
    }
    private String lineStatus(String srcStatus){
        if(!StringUtils.isEmpty(srcStatus)){
            StringBuilder b = new StringBuilder("'");
            String[] selectedStatus = srcStatus.split(",");
            if (selectedStatus!=null && selectedStatus.length>0) {
                for (String s:selectedStatus){
                    b.append(s).append("','");
                }
                return b.substring(0,b.lastIndexOf(",'")).toString();
            }
        }
        return null;
    }

    /**
     * 查询发货通知单明细对应的物流信息
     * @param deli 查询条件
     * @return 物流信息
     */
    @RequestMapping("/showDeli")
    public List<TDelinoteDeliDomain> showDeli(TDelinoteDeliDomain deli) {
        return smDelinoteManageMapper.queryDeliByParam(deli);
    }

    /**
     * 新增/更新物流信息
     * @param model 默认
     * @param deli TDelinoteDeliDomain
     * @return 执行结果
     */
    @RequestMapping("/deliUpdate")
    public TDelinoteDeliDomain deliUpdate(Model model, TDelinoteDeliDomain deli) {
        return smDelinoteManageService.updateDeli(deli);
    }



    /**
     * 删除物流信息
     * @param model 默认
     * @param ids 多选的PK字符串
     * @return 执行结果
     */
    @RequestMapping("/deliDelete")
    public int deliDelete(Model model, String ids) {
        String[] idds = ids.split(",");
        Long[] idL = new Long[idds.length];
        for (int i = 0; i < idds.length; i++) {
            idL[i] = Long.valueOf(idds[i]);
        }
        return smDelinoteManageService.delDeli(idL);
    }


    /**
     * 批量更新发货通知单状态
     * @param param 参数
     * @return 操作结果数
     */
    @RequestMapping("/saveStatus")
    public int saveStatus(String param){
        JSONArray jsonArray=(JSONArray)JSONValue.parse(param);
        List<TDelinoteProdDomain> prodList = new ArrayList<>();
        for (int i = 0; jsonArray != null && i < jsonArray.size(); i++) {
            JSONObject obj2=(JSONObject)jsonArray.get(i);
            TDelinoteProdDomain prod = new TDelinoteProdDomain();
            Long id;
            try {
                id = Long.parseLong(obj2.get("id").toString());
            }catch (Exception e){
                return 0;
            }
            prod.setId(id);
            prod.setLineStatus(obj2.get("lineStatus").toString());
            prodList.add(prod);
        }
        return smDelinoteManageService.batchUpdatedelinoteProd(prodList);
    }

}
