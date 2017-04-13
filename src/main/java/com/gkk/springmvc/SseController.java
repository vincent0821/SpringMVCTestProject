package com.gkk.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by gongkuaikuai on 2017/4/13.
 */
@Controller
public class SseController {
    @RequestMapping(value="/push",produces = "text/event-stream")
    public
    @ResponseBody
    String push() {
        Random r = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Test 1,2,3" + r.nextInt() + "\n\n";
    }
}
