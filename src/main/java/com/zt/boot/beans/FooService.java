package com.zt.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 这个@Component注解就相当于定义了一个Bean
@Component
public class FooService {
    @Autowired
    public FooFormatter fooFormatter;

    private static FooUtil fooUtil;

    @Autowired
    public void setFooUtil(FooUtil fooUtil) {
        FooService.fooUtil = fooUtil;
    }

    public static void testStatic() {
        fooUtil.processQuery();
    }
}
