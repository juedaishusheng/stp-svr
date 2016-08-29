package com.el.stp.common.util;

import com.el.sys.domain.PagingBean;

import java.util.List;

/**
 * Created on 2016/8/8 13:40.
 * 分页帮助工具
 *
 * @author Conway
 */
public class PageUtil {
    public List<?> results ;
    public PagingBean paging;

    public PageUtil(){}
    private PageUtil(List<?> results, PagingBean paging){
        this.results=results;
        this.paging=paging;
    }

    //分页参数封装
    public static PageUtil pageBean(List<?> results, PagingBean paging){
        return new PageUtil(results,paging);
    }

    @Override
    public String toString() {
        return "PageUtil{" +
            "results=" + results +
            ", paging=" + paging +
            '}';
    }
}
