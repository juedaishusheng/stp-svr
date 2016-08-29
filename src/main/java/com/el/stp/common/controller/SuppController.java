package com.el.stp.common.controller;

import com.el.stp.common.domain.TSuppDomain;
import com.el.stp.common.service.SuppService;
import com.el.stp.sm.domain.TDelinoteDeliDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 供应商相关信息入口
 * Created by xueyu on 2016/8/10.
 */
@RestController
@RequestMapping("/api/common/supp")
public class SuppController {
    @Autowired
    private SuppService suppService;

    @RequestMapping("/list")
    public List<TSuppDomain> listSupp(TSuppDomain supp) {
        return suppService.querySuppByParam(supp);
    }

    @RequestMapping("/one/{addrNo}")
    public TSuppDomain suppOne(@PathVariable("addrNo") String addrNo) {
        return suppService.suppOne(addrNo);
    }


}
