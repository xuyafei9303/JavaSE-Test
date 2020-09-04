package com.ixyf.example.thread;

/**
 * 实现Runnable接口
 */
public class NewThread002 implements Runnable{
    @Override
    public void run() {
        System.out.println("create a thread by implements Runnable");
    }

    public static void main(String[] args) {
        // 实例化一个NewThread002对象
        NewThread002 newThread002 = new NewThread002();
        // 创建一个线程对象并为其传入已经实例化好的实例
        Thread thread = new Thread(newThread002);
        // 启动线程
        thread.start();
        /**
         * 在传入一个实现了Runnable的线程实例给thread后，thread的run方法在执行时就会调用target.run方法并执行该线程具体的实现逻辑
         */
    }

}
