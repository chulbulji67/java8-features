package com.ser.interfaces;

import java.util.function.Consumer;

public class ConsumerI {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x)->{
            System.out.println("Consumer Method is running with input "+x);
        };

        consumer.accept(19);
    }



}
