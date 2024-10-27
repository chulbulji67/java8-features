package com.ser;

public class Threadd {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for(int i = 1; i<=10; i++){
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(runnable);
        t.start();
       for(int i = 1; i<=10; i++){
           System.out.println(Thread.currentThread().getName());
       }
    }

}
