package com.ser.problems;

import java.util.Arrays;
import java.util.List;

public class Avg {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 6, 1, 2);
//        Integer sum = list.stream().reduce((x, y) -> x + y).get();
//        double avg = list.stream().reduce(Integer::sum).map(x->
//            x / list.size()
//        ).get();
        double avg = list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);
    }
}
