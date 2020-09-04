package com.ixyf.example.genericity;

/**
 * 泛型接口
 * 和泛型类的声明类似，通过在接口名后面添加类型参数的声明部分来实现泛型接口的具体类型一般在实现类中进行声明，不同类型的实现类处理不同的业务逻辑
 */
public interface IGeneral<T> {
    public T genId();
}
