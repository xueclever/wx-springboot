package com.wmeimob.custom.annotation;

import java.lang.annotation.*;

/**
 * Created by Shinez on 2016/10/21.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Page {
    String value() default "";
}
