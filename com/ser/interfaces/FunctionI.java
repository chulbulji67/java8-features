package com.ser.interfaces;

import java.util.function.Function;

public class FunctionI {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;

        System.out.println(function.apply("abc"));
    }
}
