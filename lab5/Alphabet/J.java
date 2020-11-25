package com.company.Alphabet;

public class J extends I {
    protected String j = "J";

    public J(String value) {
        j = value;
    }

    public J() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "J = " + j + "\n";
    }
}
