package com.el.dev;

import com.el.dev.domain.DevSessionBean;
import org.springframework.context.annotation.Profile;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 16/4/12.
 *
 * @author panlw
 */
@Profile({"dev", "neo"})
@RestController
@RequestMapping("/dev/session")
public class DevSessionController {

    private DevSessionBean devSessionBean = new DevSessionBean();

    @RequestMapping("/inc")
    public void inc(Model model) {
        devSessionBean.increase();
        model.addAttribute("count", devSessionBean.getCount());
    }

}
