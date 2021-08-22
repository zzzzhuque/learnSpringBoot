package com.zt.boot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    private static int m = 0;

    public static void main(String[] args) {
        System.out.println("test exception");
        try {
            m = 899/0;
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}