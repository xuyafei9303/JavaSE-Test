package com.ixyf.example.thread;

/**
 * 创建线程的四种方式
 * 1.继承Thread类
 * 2.实现Runnable
 * 3.通过ExecutorService和Callable<class>实现由=有返回值的线程
 * 4.基于线程池
 */

/**
 * 基于继承Thread类
 */
public class NewThread001 extends Thread{
    public void run() {
        System.out.println("create a thread by extends Thread");
    }

    public static void main(String[] args) {
        // 实现线程对象
        NewThread001 newThread001 = new NewThread001();
        // 调用启动线程
        newThread001.start();
        /**
         * start方法时一个native方法，通过在操作系统上启动一个新线程，并最终执行run方法来启动一个线程
         * 调用run并不会开启新线程，只有调用start才会开启新线程
         */
    }
}
