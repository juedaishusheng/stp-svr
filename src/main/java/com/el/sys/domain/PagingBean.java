package com.el.sys.domain;

import com.el.util.Paging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 16/3/28.
 *
 * @author panlw
 */
public class PagingBean implements Paging {

    private final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 默认排序方式(缺省值).
     */
    public static final String DEF_ORDER = " ASC ";

    /**
     * 一页件数(缺省值).
     */
    public static final int DEF_PAGE_SIZE = 10;

    /**
     * 一页行数
     */
    private Integer pageSize = DEF_PAGE_SIZE;

    /**
     * 排序字段
     */
    private String field;

    /**
     * 排序方式
     */
    private String order = DEF_ORDER;

    /**
     * 总行数
     */
    private int rowCount = 0;

    /**
     * 总页数
     */
    private int pageCount = 0;

    /**
     * 当前页索引(0开始)
     */
    private int pageIndex = 0;

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * @return 总页数
     */
    public int getPageCount() {
        log.info("[sms] rowCount=" + rowCount + ", pageSize=" + pageSize);
        return rowCount < 1 ? 0 : rowCount < pageSize ? 1
            : ((rowCount + pageSize - 1) / pageSize);
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    @Override
    public int getRowIndex() {
        if (pageIndex < 0) pageIndex = 0;

        int pm = getPageCount() - 1;

        if (pageIndex >= pm) pageIndex = pm;

        return pageSize * pageIndex;
    }

    @Override
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PagingBean{" +
            "pageSize=" + pageSize +
            ", rowCount=" + rowCount +
            ", pageIndex=" + pageIndex +
            '}';
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
