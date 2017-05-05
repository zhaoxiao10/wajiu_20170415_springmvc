package com.wajiu.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/5/2 0002.
 */
@Target({ ElementType.METHOD }) // 在方法上的注解
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "";
}
