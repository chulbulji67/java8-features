package com.ser.problems;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 6);
//        Integer sum = list.stream().reduce((x, y) -> x + y).get();
        Integer sum = list.stream().reduce(Integer::sum).get();
        int sum1 = list.stream().mapToInt(e -> e).sum();
        System.out.println(sum);
        System.out.println(sum1);
    }
}
