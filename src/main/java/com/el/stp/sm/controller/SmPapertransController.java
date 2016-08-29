package com.el.stp.sm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.el.cfg.domain.TCust;
import com.el.stp.common.util.PageUtil;
import com.el.stp.sm.domain.SmPapertransCondition;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.el.stp.sm.domain.TPapertransDomain;
import com.el.stp.sm.mapper.PapertransMapper;
import com.el.sys.domain.PagingBean;

/**
 * 纸张调拨单管理
 * @author xueyu
 *
 */
@RestController
@RequestMapping("/api/sm/sm005")
public class SmPapertransController {

	@Autowired
    private PapertransMapper tPapertransDomainMapper;

	@RequestMapping("/page/list")
    public PageUtil  list(Model model, SmPapertransCondition condition) {
        Integer rowCount = tPapertransDomainMapper.countByParam(condition);
        if(condition!=null)condition.setRowCount(rowCount);
        List<TPapertransDomain> list= rowCount>0?tPapertransDomainMapper.selectByParam(condition):null;
        return PageUtil.pageBean(list,condition);
    }
}
