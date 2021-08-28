package com.zt.boot;

import com.zt.boot.Service.UserService;
import com.zt.boot.dao.impl.Apple;
import com.zt.boot.dao.impl.Orange;

public class User {
    // 讲解IOC：https://www.zhihu.com/search?q=%E5%A6%82%E4%BD%95%E5%AD%A6%E4%B9%A0springboot&utm_content=search_suggestion&type=content
    public static void main(String[] args) {
        UserService user = new UserService();
        user.setFruit(new Orange());
        user.getFruit();
    }
}
