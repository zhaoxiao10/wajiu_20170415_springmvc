package com.wajiu.demo;

/**
 * Created by Administrator on 2017/4/15 0015.
 */

import com.wajiu.annotation.Controller;
import com.wajiu.annotation.RequestMapping;
import org.springframework.context.annotation.Scope;

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
