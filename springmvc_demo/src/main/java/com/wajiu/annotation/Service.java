package com.wajiu.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/5/2 0002.
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {
    String value() default "";
}
