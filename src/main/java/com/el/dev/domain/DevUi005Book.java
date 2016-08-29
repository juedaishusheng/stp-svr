package com.el.dev.domain;

import com.el.sys.domain.CodeName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created on 16/7/26.
 *
 * @author panlw
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DevUi005Book extends CodeName {
    private String color;
    private String isbn;
}
