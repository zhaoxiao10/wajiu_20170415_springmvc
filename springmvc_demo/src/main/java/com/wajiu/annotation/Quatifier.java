package com.wajiu.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/5/2 0002.
 */
@Target({ ElementType.FIELD }) // 代表注解的注解
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Quatifier {
    String value() default "";
}
