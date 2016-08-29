package com.el.dev.validation;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

import javax.validation.ConstraintViolationException;
import java.util.Locale;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

/**
 * Created on 16/4/14.
 *
 * @author panlw
 */
@ContextConfiguration(classes = {
    DevValidationServiceTest.Config.class,
    DevValidationService.class
})
@RunWith(SpringJUnit4ClassRunner.class)
public class DevValidationServiceTest {

    @BeforeClass
    public static void breforeAll() {
        Locale.setDefault(Locale.US);
    }

    @Configuration
    public static class Config {
        @Bean
        public MethodValidationPostProcessor methodValidationPostProcessor() {
            return new MethodValidationPostProcessor();
        }
    }

    @Autowired
    private DevValidationService devValidationService;

    @Test
    public void throws_violation_exception_when_all_arguments_invalid() {
        assertThatExceptionOfType(ConstraintViolationException.class)
            .isThrownBy(() -> devValidationService.createUser(null, null, null))
            .matches(e -> e.getConstraintViolations().size() == 3);
    }

    @Test
    public void throws_violation_exception_when_2_arguments_invalid() {
        assertThatExceptionOfType(ConstraintViolationException.class)
            .isThrownBy(() -> devValidationService.createUser(null, null, "valid"))
            .matches(e -> e.getConstraintViolations().size() == 2);
    }

    @Test
    public void throws_violation_exception_when_email_invalid_arguments_invalid() {
        assertThatExceptionOfType(ConstraintViolationException.class)
            .isThrownBy(() -> devValidationService.createUser("invalid_email", "valid", "valid"))
            .matches(e -> e.getConstraintViolations().size() == 1)
            .matches(e -> e.getConstraintViolations().stream()
                .allMatch(v -> v.getMessage().equals("not a well-formed email address")));
    }

    @Test
    public void throws_violation_exception_when_return_value_too_long() {
        assertThatExceptionOfType(ConstraintViolationException.class)
            .isThrownBy(() -> devValidationService.createUser("user@domain.com", "too_long_username", "valid"))
            .matches(e -> e.getConstraintViolations().size() == 1)
            .matches(e -> e.getConstraintViolations().stream()
                .allMatch(v -> v.getMessage().equals("length must be between 3 and 5")));
    }

    @Test
    public void creates_a_user() {
        devValidationService.createUser("user@domain.com", "valid", "valid");
    }
}
