package com.el.sys.controller;

import com.el.sys.domain.CodeName;
import com.el.sys.domain.UdcMetas;
import com.el.sys.mapper.UdcMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;

/**
 * Created on 16/7/29.
 *
 * @author panlw
 */
@RestController
@RequestMapping("/api/ui")
public class UdcController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private UdcMapper udcMapper;

    private void udcNameNotFound(HttpServletResponse response, IllegalArgumentException ex) {
        log.warn("[APP-WARN] " + ex.getMessage());
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    }

    @RequestMapping("/udc/{udcName}")
    public List<CodeName> udcItems(
        @PathVariable("udcName") String udcName,
        HttpServletResponse response) {
        try {
            return udcMapper.codeNames(UdcMetas.valueOf(udcName));
        } catch (IllegalArgumentException ex) {
            udcNameNotFound(response, ex);
            return Collections.emptyList();
        }
    }

    @RequestMapping("/udc/{udcName}/{udcCode}")
    public CodeName udcItem(
        @PathVariable("udcName") String udcName,
        @PathVariable("udcCode") String udcCode,
        HttpServletResponse response) {
        try {
            return udcMapper.codeName(UdcMetas.valueOf(udcName), udcCode);
        } catch (IllegalArgumentException ex) {
            udcNameNotFound(response, ex);
            return null;
        }
    }
}
