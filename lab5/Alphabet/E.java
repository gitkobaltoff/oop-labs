package com.company.Alphabet;

public class E extends D {
    protected String e = "E";

    public E(String value, X x) {
        e = value;
        super.x = x;
    }

    public E(String value) {
        e = value;
    }

    public E() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "E = " + e + "\n";
    }
}
