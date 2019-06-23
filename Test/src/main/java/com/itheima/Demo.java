package com.itheima;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(4);

        MyRunnable myRunnable = new MyRunnable();

        service.submit(myRunnable);
        service.submit(myRunnable);
        service.submit(myRunnable);
        service.submit(myRunnable);
        service.submit(myRunnable);
        service.submit(myRunnable);
    }
}
