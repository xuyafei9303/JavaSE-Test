package com.ixyf.example.innerClass;

/**
 * 局部内部类
 * 定义在方法中的类叫做局部内部类
 * 当一个类只需要在某个方法中使用某个特定的类时，可以通过局部内部类来优雅的实现
 */
public class OutClass003 {
    private static int a;
    private int b;
    public void partClassTest(final int c) {
        // 方法中的局部内部类
        class PastClass {
            public void print() {
                System.out.println(c);
            }
        }
    }
}
