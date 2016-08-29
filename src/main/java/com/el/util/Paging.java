package com.el.util;

/**
 * Created on 16/4/19.
 *
 * @author panlw
 */
public interface Paging {

    /**
     * @return 当前页的首行索引(0开始)
     */
    int getRowIndex();

    /**
     * @return 一页行数
     */
    int getPageSize();
}
