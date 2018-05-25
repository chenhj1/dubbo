package com.chj.controller;

import com.chj.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenhaojie on 2018/05/25.
 */
@Controller("/consumer/main")
public class MainController {

    @Autowired
    SayHello sayHello;

    @RequestMapping("say")
    @ResponseBody
    public Object say(String name){
        return sayHello.sayHello("name");
    }

}
