package com.ixyf.example.serializable;

import java.io.*;

/**
 * 序列化与反序列化
 * 类要实现序列化，只需要实现Serializable接口
 * 序列化和反序列化必须保持序列化的ID一致，一般使用private static final long serialVersionUID进行定义
 * 序列化并不保存静态变量
 * 在需要序列化父类变量时，父类也需要实现Serializable接口
 * transient可以阻止变量被序列化，再被反序列化后，transient变量的值被设为对应类型的初始值：int类型0，Object类型null等
 */
public class Worker implements Serializable {
    private static final long serialVersionUID = -8395924780419507694L;
    private String name;
    private transient int salary; // 被transient修饰的变量不会被序列化
    static int age = 10; // 静态变量属于类，不属于对象的状态，因此不会被序列化

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 序列化数据到磁盘
        FileOutputStream fos = new FileOutputStream("worker.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Worker worker = new Worker();
        worker.setName("张三");
        oos.writeObject(worker);
        oos.flush();
        oos.close();

        // 反序列化磁盘数据并解析数据状态
        FileInputStream fis = new FileInputStream("worker.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Worker deWorker = (Worker) ois.readObject();
        System.out.println(deWorker.getName());
    }
}
