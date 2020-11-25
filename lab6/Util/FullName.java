package com.company.Util;

public class FullName {
    public String givenName;
    public String middleName;
    public String familyName;

    public FullName(String givenName, String middleName, String familyName) {
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
    }

    public String toString() {
        return givenName + " " + middleName + " " + familyName;
    }
}