package com.ixyf.example.genericity.impl;

import com.ixyf.example.genericity.IGeneral;

import java.util.Random;

public class GeneralIntegerImpl implements IGeneral<Integer> {
    @Override
    public Integer genId() {
        Random random = new Random(100);
        return random.nextInt();
    }

    public static void main(String[] args) {
        // 使用泛型
        GeneralIntegerImpl generalInteger = new GeneralIntegerImpl();
        System.out.println(generalInteger.genId());
    }
}
