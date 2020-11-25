package com.company.Alphabet;

public class G extends F {
    protected String g = "G";

    public G(String value, X x) {
        g = value;
        super.x = x;
    }

    public G(String value) {
        g = value;
    }

    public G() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "G = " + g + "\n";
    }
}