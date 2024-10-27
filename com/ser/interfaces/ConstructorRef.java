package com.ser.interfaces;

import com.ser.Student;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class ConstructorRef {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<Person> people = names.stream().map((String name) -> new Person(name, 1)).toList();
        for (Person person:
             people) {
            System.out.println(person.getName()+" "+person.getAge());
        }
    }

}
