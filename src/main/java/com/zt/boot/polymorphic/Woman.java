package com.zt.boot.polymorphic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("woman")
public class Woman implements Person{
    @Override
    public void eat() {
        System.out.println("Woman eat");
    }

    @Override
    public void speak() {
        System.out.println("Woman speak");
    }
}
