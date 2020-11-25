package com.company.Alphabet;

public class C extends B {
    protected String c = "C";

    public C(String value, X x) {
        c = value;
        super.x = x;
    }

    public C(String value) {
        c = value;
    }

    public C() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "C = " + c + "\n";
    }
}