package com.github.youzan.httpfetch.resolver;

import java.lang.annotation.*;

/**
 * Created by daiqiang on 17/6/19.
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface URL {
}
