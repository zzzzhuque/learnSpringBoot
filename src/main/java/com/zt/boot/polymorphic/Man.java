package com.zt.boot.polymorphic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Man")
public class Man implements Person{
    @Override
    public void eat() {
        System.out.println("Man eat");
    }

    @Override
    public void speak() {
        System.out.println("Man speak");
    }
}
