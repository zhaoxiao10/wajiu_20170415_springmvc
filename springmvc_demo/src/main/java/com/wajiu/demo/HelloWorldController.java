package com.wajiu.demo;

/**
 * Created by Administrator on 2017/4/15 0015.
 */

import com.wajiu.annotation.Controller;
import com.wajiu.annotation.Quatifier;
import com.wajiu.annotation.RequestMapping;
import org.springframework.context.annotation.Scope;

@Controller(value="hello")
@Scope("prototype")
public class HelloWorldController {

    @Quatifier(value="test")
    private TestService testService;

    //hello world例子
    @RequestMapping(value="/hello")
    public String hello(){
        System.out.println("spring mvc hello world!");
        testService.test();
        return "hello";
    }

}
