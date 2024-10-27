package com.ser.interfaces;

import java.util.function.Supplier;

public class SupplierI {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () ->  6;
        System.out.println(supplier.get());
    }
}
