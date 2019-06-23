package com.itheima;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("我要一个教练");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"教我游泳");
        System.out.println("学完游泳");
    }
}
