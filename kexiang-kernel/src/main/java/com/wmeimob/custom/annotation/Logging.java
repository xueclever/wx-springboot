package com.wmeimob.custom.annotation;

import java.lang.annotation.*;

/**
 * Created by ShiNez on 2016/5/25.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Logging {

    String value() default "";
}
