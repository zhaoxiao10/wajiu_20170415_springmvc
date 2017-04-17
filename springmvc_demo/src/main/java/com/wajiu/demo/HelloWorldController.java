package com.wajiu.demo;

/**
 * Created by Administrator on 2017/4/15 0015.
 */

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class HelloWorldController {

    //hello world例子
    @RequestMapping(value="/hello")
    public String hello(){
        System.out.println("spring mvc hello world!");
        return "hello";
    }

}
