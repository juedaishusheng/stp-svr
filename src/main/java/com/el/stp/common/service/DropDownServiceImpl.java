package com.el.stp.common.service;

import com.el.stp.common.domain.DropDownDomain;
import com.el.stp.common.domain.DropDownMetas;
import com.el.stp.common.mapper.DropDownMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * 预先输入框servcie impl
 * Created by xueyu on 2016/8/15.
 */
@Service
public class DropDownServiceImpl implements DropDownService {
    @Autowired
    private DropDownMapper dropDownMapper;

    @Override
    public List<DropDownDomain> findAllWaitingItem(DropDownMetas metas, String key) {
        if(metas!=null
            && !StringUtils.isEmpty(metas.getColumn())
            && !StringUtils.isEmpty(metas.getTable())
            && !StringUtils.isEmpty(key)){
                return dropDownMapper.findAllWaitingItem(metas,key);
        }else{
            return null;
        }
    }
}
