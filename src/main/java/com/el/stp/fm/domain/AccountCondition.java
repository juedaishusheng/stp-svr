package com.el.stp.fm.domain;

import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Johnny on 2016/8/12.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountCondition extends PagingBean{

    private Integer ouId;

    private String ouName;

    private String custName;

    private String prodName;

    private String soNo;

    private String agentId;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date recvDateFrom;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date recvDateTo;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date invDateFrom;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date invDateTo;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date soDateFrom;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date soDateTo;




}
