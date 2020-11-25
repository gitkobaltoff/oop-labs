package com.company;

        import com.company.Hospital.Hospital;
        import com.company.Util.Address;
        import com.company.Util.FullName;
        import com.company.Util.Gender;
        import com.company.Util.Phone;

        import java.util.ArrayList;
        import java.util.Date;

public class Person {
    public ArrayList<Hospital> hospitals = new ArrayList<Hospital>();

    public String title;
    public Date birthDate;
    public Gender gender;
    public Phone phone;

    private FullName name;
    private Address homeAddress;

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
}