package com.zt.boot.dao.impl;

import com.zt.boot.dao.Fruit;

public class Apple implements Fruit {
    @Override
    public void get() {
        System.out.println("get an apple");
    }
}
