package com.ser;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 2, 92, 39, 453, 23);

        Collections.sort(list);
        System.out.println(list);
        list.sort((a, b) -> (b - a));
        System.out.println(list);
    }
}
