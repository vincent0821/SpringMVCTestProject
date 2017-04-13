package com.gkk.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gongkuaikuai on 2017/4/13.
 */
@Controller
public class NormalController {
    @Autowired
    DemoTestService demoTestService;

    @RequestMapping("/normal")
    public String testPage(Model model){
        model.addAttribute("msg",demoTestService.saySomething());
        return "page";
    }
}
