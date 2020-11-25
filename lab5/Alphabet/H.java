package com.company.Alphabet;

public class H extends G {
    protected String h = "H";
    private X x;

    public H(String value, X x) {
        h = value;
        super.x = x;
    }

    public H(String value) {
        h = value;
    }

    public H() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "H = " + h + "\n";
    }
}