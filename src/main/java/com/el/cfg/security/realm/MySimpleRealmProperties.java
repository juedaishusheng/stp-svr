package com.el.cfg.security.realm;

import com.el.cfg.security.domain.MyAccountProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 16/7/24.
 *
 * @author panlw
 */
@Data
public class MySimpleRealmProperties {

    /**
     * 帐号配置一览
     */
    private List<MyAccountProperties> accounts = new ArrayList<>();
}
