package com.el.cfg;

import com.el.DataVersionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;

/**
 * Created on 16/4/8.
 *
 * @author panlw
 */
@ControllerAdvice(annotations = RestController.class)
@Order(1)
public class GlobalRestExceptionHandler {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    private void handleException(Exception e) {
        log.error("[APP-GEXH] Exception happened in rest-controller.", e);
    }

    @ExceptionHandler(DataVersionException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public void handleDataVersionException(DataVersionException e) {
        log.error("[APP-GEXH] " + e.getMessage());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handleConstraintViolationException(ConstraintViolationException e) {
        final String msgs = GlobalExceptionHandler.getValidationErrorMessages(e);
        log.error("[APP-GEXH] Validation exception happened in rest-controller: " + msgs);
    }
}
