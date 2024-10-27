package com.ser;

public class Lambda {
    public static void main(String[] args) {
         Add add = (a,b)->{
           return a+b;
        };

        System.out.println(add.sum(5, 6));


        System.out.println( add.add(5, 6));

        System.out.println(Add.addition(4, 5));

        Lambda lambda = new Lambda();
        System.out.println(lambda.addition(5, 6));

    }

    public int  addition(int x, int y){
        System.out.println("Addition Method of Main class");
        return x+y;
    }



}
