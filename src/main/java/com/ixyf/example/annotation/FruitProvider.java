package com.ixyf.example.annotation;

import java.lang.annotation.*;

/**
 * 自定义annotation
 * @Target ：
 *      表示注解所修饰的范围
 *      可用于package、types（类、接口、枚举、注解类型）
 *      类型成员（方法、构造方法、成员变量、枚举值）
 *      方法参数和本地变量（循环变量、catch参数等）
 * target取值类型如下：
 *      TYPE                用于描述类、接口（包括注解类型）或者枚举类型
 *      FIELD               用于描述域
 *      METHOD              用于描述方法
 *      PARAMETER           用于描述参数
 *      CONSTRUCTOR         用于描述构造器
 *      LOCAL_VARIABLE      用于描述局部变量
 *      ANNOTATION_TYPE     用于声明一个注解
 *      PACKAGE             用于描述包
 *      TYPE_PARAMETER      对普通变量的声明
 *      TYPE_USE            能标注任何类型的名称
 *
 * @Retention ：定义了该注解被保留的级别，即被描述的注解在什么级别有效
 *      SOURCE              在源文件有效，源文件中被保留
 *      CLASS               class文件中有效，class文件中被保留
 *      RUNTIME             运行时有效，运行时被保留
 *
 * @Documented ：表明这个注解应该被javadoc工具记录，因此可以被javadoc类的工具文档化
 * @Inherited ： 标记注解，表明某个被标记的类型是被继承的，如果有一个使用了@Inherited修饰的annotation被用于一个class，则这个注解将被用于该class的子类
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    // 供应商编号
    public int id() default -1;
    // 供应商名称
    public String name() default "";
    // 供应商地址
    public String address() default "";
}
