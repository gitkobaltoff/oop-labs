package com.oop.lab1;

public class Main {
    public static void main(String[] args){
        System.out.println("lab 1 started");

        Student student1 = new Student();
        student1.name = "Ion";
        System.out.println(student1.name);
    }
}

class Student{
    String name = "";
}