package com.zt.boot.Service;

import com.zt.boot.dao.Fruit;
import com.zt.boot.dao.impl.Apple;

public class UserService {
    private Fruit fruit;

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public void getFruit() {
        this.fruit.get();
    }
}
