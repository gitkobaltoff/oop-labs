package com.company.Alphabet;

public class F extends E {
    protected String f = "F";

    public F(String value, X x) {
        f = value;
        super.x = x;
    }

    public F(String value) {
        f = value;
    }

    public F() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "F = " + f + "\n";
    }
}
