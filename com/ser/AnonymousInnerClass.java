package com.ser;

//when There is two abstract Method in any Interface then We can't use lambda expressions
//We can use Anonymous Inner class for that.
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public String getName() {
                return "Chulbul";
            }

            @Override
            public int getSalary() {
                return 0;
            }
        };

        System.out.println( employee.getName());
        System.out.println(employee.getSalary());
    }

}
