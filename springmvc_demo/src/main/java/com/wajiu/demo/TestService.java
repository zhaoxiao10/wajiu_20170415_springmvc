package com.wajiu.demo;

import com.wajiu.annotation.Service;

/**
 * Created by Administrator on 2017/5/5 0005.
 */
@Service(value="test")
public class TestService {
    public void test(){
     System.out.println("test");
    }
}
