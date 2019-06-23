package com.itheima;

import javax.lang.model.element.VariableElement;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {

    int ticket = 100;

    Lock lock =  new ReentrantLock();

    @Override
    public void run() {

        while (true){
            lock.lock();
            if (ticket>0){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name+"在卖第"+ticket--+"张票");
            }
            lock.unlock();
        }
    }
}
