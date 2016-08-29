package com.el.stp.om.service;

import com.el.stp.om.domain.SoProdCondition;
import com.el.stp.om.domain.SoProdDomain;
import com.el.stp.om.mapper.PrintSaleSoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuzhe on 2016/8/24.
 */
@Service
public class PrintSaleSoServiceImpl implements PrintSaleSoService {
    @Autowired
    private PrintSaleSoMapper printSaleSoMapper;

    @Override
    public List<SoProdDomain> selectPrintSaleSo(SoProdCondition soProd) {
        Integer rowCount = printSaleSoMapper.selectPrintSaleSoNum(soProd);
        soProd.setRowCount(rowCount);
        List<SoProdDomain> selectPrintSaleSo= printSaleSoMapper.selectPrintSaleSo(soProd);
        return rowCount>0?selectPrintSaleSo:null;
    }

    /**
     * 查看head
     * @param soProd
     * @return
     */
    @Override
    public List<SoProdDomain> selectHeadView(SoProdDomain soProd){
        List<SoProdDomain> selectHeadView = printSaleSoMapper.selectHeadView(soProd);
        return selectHeadView;
    }

    /**
     * 产品信息
     * @param soProd
     * @return
     */
    @Override
    public List<SoProdDomain> selectProductInfo(SoProdDomain soProd){
        List<SoProdDomain> selectProductInfo = printSaleSoMapper.selectProductInfo(soProd);
        return selectProductInfo;
    }
}
