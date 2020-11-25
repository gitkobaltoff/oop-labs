package com.company.Alphabet;

public class B extends A {
    protected String b = "B";

    public B(String value, X x) {
        b = value;
        super.x = x;
    }

    public B(String value) {
        b = value;
    }

    public B() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "B = " + b + "\n";
    }
}