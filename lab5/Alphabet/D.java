package com.company.Alphabet;

public class D extends C {
    protected String d = "D";

    public D(String value, X x) {
        d = value;
        super.x = x;
    }

    public D(String value) {
        d = value;
    }

    public D() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "D = " + d + "\n";
    }
}