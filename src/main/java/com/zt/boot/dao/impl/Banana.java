package com.zt.boot.dao.impl;

import com.zt.boot.dao.Fruit;

public class Banana implements Fruit {
    @Override
    public void get() {
        System.out.println("get a banana");
    }
}
