package com.engineering.playbook.concurrency.threads;

public class AnonymousExample {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("chidl thread........");
                }
            }
        });

        t.start();
        for(int i=0; i<10; i++){
            System.out.println("main thread...........");
        }
    }
}
