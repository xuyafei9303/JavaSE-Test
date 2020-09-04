package com.ixyf.example.annotation;

/**
 * 该类使用注解
 */
public class Apple {
    @FruitProvider(id = 1, name = "陕西红富士集团", address = "陕西西安")
    private String appleProvider;

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }
}
