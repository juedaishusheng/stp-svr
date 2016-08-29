package com.el.stp.common.controller;

import com.el.cfg.domain.TCust;
import com.el.stp.common.domain.DropDownDomain;
import com.el.stp.common.domain.DropDownMetas;
import com.el.stp.common.domain.TSuppDomain;
import com.el.stp.common.mapper.DropDownMapper;
import com.el.stp.common.service.DropDownService;
import com.el.stp.common.service.SuppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 预先输入框Controller
 * Created by xueyu on 2016/8/15.
 */
@RestController
@RequestMapping("/api/common/dropdown")
public class DropDownQueryController {

    @Autowired
    private DropDownService dropDownService;
    @Autowired
    private DropDownMapper dropDownMapper;

    /**
     * 根据用户的输入值，过滤出 某表某字段 中符合输入值条件的所有值
     * @param inputValue DropDownMetas枚举（封装某表某字段）
     * @param key  用户输入值
     * @return 查询结果
     */
    @Deprecated
    @RequestMapping("/metas/{inputValue}")
    public List<DropDownDomain> findAllWaitingItem(@PathVariable("inputValue") String inputValue,
                                                   @RequestParam("key") String key) {
        DropDownMetas metas;
        try{
            metas = DropDownMetas.valueOf(inputValue);
        }catch (Exception e){
            return null;
        }
        return dropDownService.findAllWaitingItem(metas,key);
    }

    /**
     * 查询出符合条件的客户列表
     * @param param 查询条件
     * @return 通过code和name封装CUST_CODE和CUST_NAME
     */
    @RequestMapping("/cust")
    public List<DropDownDomain> queryCustByParam(DropDownDomain param){
        //TODO ouId可能通过系统获取，目前方法未知
        return dropDownMapper.queryCustByParam(param);
    }
    /**
     * 查询出符合条件的"销售订单产品"列表
     * @param param 查询条件
     * @return 通过code和name封装PROD_CODE和PROD_NAME
     */
    @RequestMapping("/prod")
    public List<DropDownDomain> queryProdByParam(DropDownDomain param){
        //TODO ouId可能通过系统获取，目前方法未知
        return dropDownMapper.queryProdByParam(param);
    }
    /**
     * 查询出符合条件的"报价单产品"列表
     * @param param 查询条件
     * @return 通过code和name封装PROD_CODE和PROD_NAME
     */
    @RequestMapping("/orgProd")
    public List<DropDownDomain> queryOrgProdByParam(DropDownDomain param){
        //TODO ouId可能通过系统获取，目前方法未知
        return dropDownMapper.queryOrgProdByParam(param);
    }
    /**
     * 查询出符合条件的公司列表
     * @param param 查询条件
     * @return 通过code和name封装OU_CODE和OU_NAME
     */
    @RequestMapping("/ou")
    public List<DropDownDomain> queryOuByParam(DropDownDomain param){
        return dropDownMapper.queryOuByParam(param);
    }

}
