package com.gkk.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gongkuaikuai on 2017/4/13.
 */

/**
 * 测试@RestController=@Controller+@ResponseBody
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {
    @RequestMapping(value="/getjson",produces = {"application/json;charset=UTF-8"})
    public DemoObj getjson(DemoObj obj){
        return new DemoObj(obj.getId()+1,obj.getName()+"yy");
    }

    @RequestMapping(value="getxml",produces = {"application/xml;charset=UTF-8"})
    public DemoObj getxml(DemoObj obj){
        return new DemoObj(obj.getId()+1,obj.getName()+"yy");
    }
}
