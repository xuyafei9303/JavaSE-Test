package com.ixyf.example.innerClass;

/**
 * 静态内部类
 * 静态内部类可以访问外部类的静态变量和方法
 * 在静态内部类中可以定义静态变量，方法，构造函数等
 * 静态内部类通过"外部类.静态内部类"的方式来调用
 * 案例：Java集合类HashMap在内部维护了一个静态内部类Node数组用于存放元素，但Node数组对使用者是透明的,像这种和外部关系密切且不依赖外部类的实例的类,可以使用静态内部类实现
 */
public class OutClass001 {
    private static String className = "staticInnerClass";
    // 定义一个静态内部类
    public static class StaticInnerClass {
        public void getClassName() {
            System.out.println("className:" + className);
        }
    }

    public static void main(String[] args) {
        // 调用静态内部类
        OutClass001.StaticInnerClass staticInnerClass = new OutClass001.StaticInnerClass();
        staticInnerClass.getClassName();
    }
}
