package com.el.stp.common.service;

import com.el.stp.common.mapper.SelectMapper;
import com.el.sys.domain.CodeName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 2016/8/3 19:48.
 *
 * @author Conway
 */
@Service
public class SelectServiceImpl implements SelectService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private SelectMapper selectMapper;

    @Override
    public List<CodeName> processTypeOuUdcCodeItems(String ouid){
        List<String> udcCodeList=selectMapper.processTypeOuUdcCode(ouid);
        return selectMapper.processTypeItems(udcCodeList);
    }

    //获取工序类型-生产工厂
    @Override
    public List<CodeName> processTypeFacUdcCodeItems(String facid){
        List<String> udcCodeList=selectMapper.processTypeFacUdcCode(facid);
        return selectMapper.processTypeItems(udcCodeList);
    }


}
