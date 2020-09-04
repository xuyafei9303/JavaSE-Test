package com.ixyf.example.genericity;

import com.ixyf.example.innerClass.OutClass004;

/**
 * 泛型
 * 泛型的本质是参数化类型，泛型提供了编译时的安全监测机制，该机制允许程序在编译时检测非法的类型
 * 关于泛型标记：
 *      E-Element           在集合中使用，表示在集合中存放的元素
 *      T-Type              表示Java类，包括基本的类和我们自己定义的类
 *      K-Key               表示键，比如map中的key
 *      V-Value             表示值
 *      N-Number            表示数值类型
 *      ？                   表示不确定的Java类型
 * 使用通配符 ？和 extends 指定泛型的上限 <? extend T>
 * 使用通配符 ？和 super 指定泛型的下限 <? super T>
 *
 * 类型擦除：
 * 在编译阶段使用泛型时加上的类型参数，会被编译器在编译时去掉，这个过程叫做类型擦除，泛型主要用于编译阶段
 * 编译后生成的Java字节代码文件中不包含泛型中的类型信息
 *
 */
public class GenericityClass {
    /**
     * 泛型方法
     */
    public static void main(String[] args) {
        generalMethod("1", 2);
    }
    public static <T> void generalMethod(T... inputArray) {
        for (T element : inputArray) {
            if (element instanceof Integer) {
                System.out.println("处理integer数据...");
            } else if (element instanceof String) {
                System.out.println("处理string数据...");
            }
        }
    }

    /**
     * 泛型类
     * @param <T>
     */
    public static class GeneralClass<T> {
        public static void main(String[] args) {
            // 根据需求初始化不同的类型
            GeneralClass<Integer> genInt = new GeneralClass<Integer>();
            genInt.add(1);
            GeneralClass<String> genStr = new GeneralClass<String>();
            genStr.add("2");
        }
        private T t;
        public void add(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }
    }
}
