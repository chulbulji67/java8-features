package com.ser.problems;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 6, 1, 2,3 , 2);

        Set<Integer> list1 = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println(list1);

        Set<Integer> set = new HashSet<>();
        List<Integer> list2 = list.stream().filter(e -> !set.add(e)).toList();
        System.out.println(list2);


    }
}
