package com.company.Alphabet;

public class A {
    protected String a = "A";
    protected X x = new X("default X");

    public A(String value, X x) {
        a = value;
        this.x = x;
    }

    public A(String value) {
        a = value;
    }

    public A() {
    }

    @Override
    public String toString() {
        return "X.name: " + x.name + "\n" +
                "Alphabet:\n" +
                "A = " + a + "\n";
    }
}