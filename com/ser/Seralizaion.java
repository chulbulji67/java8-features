package com.ser;

import java.io.*;

public class Seralizaion {
    public static void main(String[] args) throws IOException {
        Student student = new Student(1, "Akash");
        Student student1 = new Student(2, "Akasha");
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");

        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        outputStream.writeObject(student);
        outputStream.writeObject(student1);
        outputStream.flush();
        outputStream.close();

    }
}
