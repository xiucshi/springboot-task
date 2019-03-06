package com.cong.springboot.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    AsyncService asyncService;

    @ResponseBody
    @RequestMapping("/async")
    public String asyncHello(){
        asyncService.asyncHello();
        return "async hello world.";
    }
}
