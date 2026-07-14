package com.engineering.playbook.concurrency.threads;

public class MyThreads extends Thread{

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("child thread.........");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
