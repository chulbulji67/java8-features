package com.ser;

@FunctionalInterface
public interface Add {
    public int sum(int a, int b);

     default int add(int a, int b){
         System.out.println("Default Method is Running");
         return a+b;
    }
    static int addition(int a, int b){
        System.out.println("Static Method is Running");
        return a+b;
    }
}
