package com.el.stp.fc.domian;

import com.el.cfg.domain.TProdin;
import com.el.sys.domain.PagingBean;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by xuzhe on 2016/8/1.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ProdInDomain extends TProdin {
    private String soNo;
    private String custName;
    private String prodCode;
    private String prodName;
    private String addrName;
    private Date docDate;
    private String getDocDateYmd(){
        return DateUtil.toYmd(getDocDate());
    }
}
