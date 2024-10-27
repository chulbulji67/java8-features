package com.ser.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {
        //Streams on integers
        List<Integer> list = Arrays.asList(22, 3, 18, 392, 32, 99, 51, 54, 98, 23, 75, 84, 32, 54, 99, 51);
        //Print AllEven

        List<Integer> evenList = list.stream().filter(num->num%2==0).toList();
        List<Integer> dividedByTwo = evenList.stream().map(num->num/2).toList();
        System.out.println(evenList);
        System.out.println("Devided by 2 list"+dividedByTwo);
        //No Repetition(use distinct)
        List<Integer> noRepetition = dividedByTwo.stream().distinct().toList();
        System.out.println("No Repeated Value "+noRepetition );
        //Sort
        List<Integer> sorted = noRepetition.stream().sorted().toList();
        System.out.println("Sorted in increasing Order "+sorted );
        //Sort in descending order
        List<Integer> decreasingOrder = sorted.stream().sorted((a, b)->b-a).toList();
        System.out.println("Sorted in Decreasing Order "+decreasingOrder );
        //first 3 element
        List<Integer> firstThree = decreasingOrder.stream().limit(3).toList();
        System.out.println("First Three Element "+firstThree );
        //Skipping first 3 element
        List<Integer> skipThree = decreasingOrder.stream().skip(3).toList();
        System.out.println("First Three Element "+skipThree );

        //Minimum
        Optional<Integer> min = decreasingOrder.stream().min(Integer::compareTo);

        System.out.println("min element "+min );
        //Maximum Element
        Optional<Integer> max = decreasingOrder.stream().max(Integer::compareTo);
        System.out.println("Max element "+max.get());

    }
}
