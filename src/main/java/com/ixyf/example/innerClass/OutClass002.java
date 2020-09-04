package com.ixyf.example.innerClass;

/**
 * 成员内部类
 * 定义在类内部的非静态类叫做成员内部类，在成员内部类内部不能定义静态方法和变量（final修饰的除外）
 * 成员内部类是非静态的
 * 在Java的非静态代码块中不能定义静态方法和变量
 * 使用方法和静态内部类相同
 */
public class OutClass002 {
    private static int a;
    private int b;
    // 定义一个成员内部类
    public class MemberInnerClass {
        public void print() {
            System.out.println(a);
            System.out.println(b);
        }
    }
}
