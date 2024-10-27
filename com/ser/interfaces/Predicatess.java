package com.ser.interfaces;

import java.util.function.Predicate;

public class Predicatess {

    public static void main(String[] args) {
        Predicate<Integer> predicate1 = x->x>10;
        System.out.println(predicate1.test(2));

        Predicate<Integer> predicate2 = x-> x<29;
//        System.out.println(predicate2.test("abcdfa"));

        System.out.println(predicate1.and(predicate2).test(14));

    }

}
