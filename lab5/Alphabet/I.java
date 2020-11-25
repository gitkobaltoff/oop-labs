package com.company.Alphabet;

public class I extends H {
    protected String i = "I";

    public I(String value) {
        i = value;
    }

    public I() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "I = " + i + "\n";
    }
}