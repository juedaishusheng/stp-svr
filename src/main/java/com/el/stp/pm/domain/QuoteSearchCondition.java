package com.el.stp.pm.domain;

import com.el.stp.common.util.StringUtils;
import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Title:
 * Description:
 * ll
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: li-jc
 * @version: 1.0.0
 * @time: 2016/8/23
 */
@ToString
@Data
public class QuoteSearchCondition extends PagingBean {
    private String mercherId;
    private String saleManagerId;
    private String custName;
    private String prodName;
    private String quoteNo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    private String quoteStatus;


    //封装报价单状态
    private List<String> quoteStatusList;

    public List<String> getQuoteStatusList() {
        String quotestatus = getQuoteStatus();
        List<String> quoteList = new ArrayList<>();
        if (!StringUtils.isEmpty(quotestatus) && quotestatus.contains(",")) {
            String[] quoteStatus = getQuoteStatus().split(",");
            for (String st : quoteStatus) {
                quoteList.add(st);
            }
        } else {
            quoteList.add(quotestatus);
        }

        return quoteList;
    }


}
