package com.zt.boot.beans;

import org.springframework.stereotype.Component;

@Component
public class FooUtil {

    public void processQuery() {
        System.out.println("test static class");
    }
}
