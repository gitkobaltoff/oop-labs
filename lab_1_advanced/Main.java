package com.company;

import static java.lang.StrictMath.abs;
import static java.util.concurrent.ThreadLocalRandom.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        University[] universities = new University[3];

        for (int i = 0; i < 3; i++) {
            universities[i] = new University();
            for (int j = 0; j < 3; j++) {
                universities[i].students.add(new Student(abs(current().nextInt() % 10) + 1));
                System.out.println(universities[i].students.get(j).mark);
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("University " + (i + 1) + " average mark: " + universities[i].marksAverage());
        }
    }
}

class University{
    String name;
    int foundationYear;
    List<Student> students = new ArrayList<>();

    float marksAverage(){
        float avg = 0;
        for (Student s : students){
            avg += s.mark;
        }
        avg /= students.size();
        return avg;
    }
}

class Student{
    public Student(int _mark){
        mark = _mark;
    }
    String name;
    int mark;
    int age;
}