package com.ixyf.example.annotation;

import java.lang.reflect.Field;

/**
 * @FruitProvider <- 注解的处理器类
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitProvider = "供应商信息: ";
        Field[] fields = clazz.getDeclaredFields(); // 通过反射获取处理注解
        for (Field field: fields) {
            if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                // 处理注解信息
                strFruitProvider = "供应商编号：" + fruitProvider.id() + "，供应商名称：" + fruitProvider.name() + "，供应商地址：" + fruitProvider.address();
                System.out.println(strFruitProvider);
            }
        }
    }

    public static class FruitRun {
        public static void main(String[] args) {
            FruitInfoUtil.getFruitInfo(Apple.class);
        }
    }
}
