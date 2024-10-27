package com.ser.problems;

import java.util.Arrays;
import java.util.List;

public class StartingWith2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 22, 23, 32, 42, 222, 34, 322, 2222);

        List<Integer> startWithTwo = list.stream().map(String::valueOf).filter(x -> x.startsWith("2")).map(Integer::valueOf).toList();
        System.out.println(startWithTwo);

    }
}
