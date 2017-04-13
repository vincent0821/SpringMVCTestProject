package com.gkk.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gongkuaikuai on 2017/4/13.
 */
@RestController
public class MyRestController {
    @Autowired
    DemoTestService demoTestService;

    @RequestMapping(value = "/testRest",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String testRest(){
        return demoTestService.saySomething();
    }
}
