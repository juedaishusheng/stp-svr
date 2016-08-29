package com.el.stp.pm.domain;

import com.el.stp.common.util.StringUtils;
import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Title:待处理（营业）
 * Description:
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: james.zhang
 * @version: 1.0.0
 * @time: 2016/8/24
 */
@ToString
@Data
public class OnHandCondition extends PagingBean {
    private String custName;
    private String prodName;
    private String quoteNo;
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
