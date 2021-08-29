package com.zt.boot;

import com.zt.boot.Service.UserService;
import com.zt.boot.dao.impl.Apple;
import com.zt.boot.dao.impl.Orange;

public class User {
    public static void main(String[] args) {
        UserService user = new UserService();
        user.setFruit(new Orange());
        user.getFruit();
    }
}
