package com.el.cfg;

import com.el.DataVersionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

/**
 * Created on 16/4/8.
 *
 * @author panlw
 */
@ControllerAdvice(annotations = Controller.class)
@Order(2)
public class GlobalExceptionHandler {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private ModelAndView createModelAndView(String msg) {
        return new ModelAndView("error") {{
            addObject("error", msg);
        }};
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    private ModelAndView handleException(Exception e) {
        log.error("[APP-GEXH] Exception happened in controller.", e);
        return createModelAndView(log.isDebugEnabled() ? e.getLocalizedMessage() : "");
    }

    @ExceptionHandler(DataVersionException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ModelAndView handleDataVersionException(DataVersionException e) {
        log.error("[APP-GEXH] " + e.getMessage());
        return createModelAndView(log.isDebugEnabled() ? e.getLocalizedMessage() : "");
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ModelAndView handleConstraintViolationException(ConstraintViolationException e) {
        String msgs = "";
        if (log.isDebugEnabled()) {
            msgs = getValidationErrorMessages(e);
            log.debug("[APP-GEXH] Validation exception happened in controller: " + msgs);
        }
        return createModelAndView(msgs);
    }

    public static String getValidationErrorMessages(ConstraintViolationException e) {
        return e.getConstraintViolations()
            .stream().collect(Collectors.toSet())
            .stream().map(x -> x.getPropertyPath() + "=" + x.getMessage())
            .collect(Collectors.joining("|"));
    }
}
