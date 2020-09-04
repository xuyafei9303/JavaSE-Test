package com.ixyf.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 基于线程池
 * 线程是非常宝贵的资源，在每次使用的时候创建并在运行结束后销毁是非常浪费系统资源的
 * 我们可以使用缓存策略并使用线程池来创建线程，具体过程为创建一个线程池并用该线程池提交线程任务
 */
public class NewThread004 {
    public static void main(String[] args) {
        // 创建大小为10的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            // 提交多个线程任务并执行
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " is running");
                }
            });
        }
    }
}
