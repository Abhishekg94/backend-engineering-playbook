package com.engineering.playbook.concurrency.threads;

import static java.lang.Thread.sleep;

public class MyThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        MyThreads t = new MyThreads();
        t.start();
        for(int i=0; i<10; i++){
            System.out.println("main thread........");
            sleep(3000);
        }
    }
}
