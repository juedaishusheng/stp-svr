package com.el.dev.validation;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * Created on 16/4/14.
 *
 * @author panlw
 */
@Validated
@Component
public class DevValidationService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Length(min = 3, max = 5)
    public String createUser(@NotBlank @Email String email,
                             @NotBlank String username,
                             @NotBlank String password) {
        log.debug(String.format("[SMS] validated: %s:%s@%s", username, password, email));
        return username;
    }

}
