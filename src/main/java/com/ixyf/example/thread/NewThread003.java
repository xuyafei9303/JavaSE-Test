package com.ixyf.example.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 通过ExecutorService和Callable<class>实现有返回值的线程
 * 有时候我们需要在主线程开启多个子线程并发执行一个任务，然后收集各个线程执行返回的结果并将最终结果汇总，这时候需要用到callable接口
 * 实现方法：
 * 创建一个类并实现callable接口，在call方法中实现具体的运算逻辑并返回计算结果
 * 调用过程：
 * 创建一个线程池，一个用于接收返回结果的future List及callable线程实例，使用线程池提交任务并将线程执行后的结果保存在future中，
 * 在线程执行结束后遍历futureList中的future对象，在该对象上调用get方法就可以互殴callable线程任务返回的数据并汇总结果
 */
public class NewThread003 implements Callable<String> {
    private String name;

    public NewThread003(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception { // call方法内为线程实现逻辑
        return name;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        List<Future> list = new ArrayList<Future>();
        for (int i = 0; i < 5; i++) {
            // 创建一个有返回值的线程实例
            Callable callable = new NewThread003(i + " ");
            // 提交线程，获取future对象并将其保存在future list中
            Future future = pool.submit(callable);
            System.out.println("submit a callable thread:" + i);
            list.add(future);
        }
        pool.shutdown();
        for (Future future: list) {
            // 从future对象上获取任务的返回值，并将结果输出到控制台
            System.out.println("get the result callable thread:" + future.get().toString());
        }
    }



}
