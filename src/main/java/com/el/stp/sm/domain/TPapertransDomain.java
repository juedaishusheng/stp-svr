package com.el.stp.sm.domain;

import com.el.cfg.domain.*;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)
public class TPapertransDomain extends TPapertrans{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
    private TSo so;
    private TCust cust;
    private TItem item;
    private TWh outWh;
    private TWh inWh;
    public  String getDocDateYmd() {
        return DateUtil.toYmd(getDocDate());
    }

}
