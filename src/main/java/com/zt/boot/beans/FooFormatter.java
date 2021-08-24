package com.zt.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter {
    @Value("${server.port}")
    public String formatter;

    public String format() {
        return "foo";
    }
}
