package com.el.stp.sm.domain;

import com.el.cfg.domain.TDelinote;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 自定义发货通知单，继承系统自动生成的发货通知单
 * Created by xueyu on 2016/8/3.
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)
public class TDelinoteDomain extends TDelinote {
}
