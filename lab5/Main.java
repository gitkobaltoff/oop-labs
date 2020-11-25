package com.company;

        import com.company.Alphabet.*;

public class Main {

    public static void main(String[] args) {
        Object[] alphabet = new Object[10];
        alphabet[0] = new A("New A", new X("XXX"));
        alphabet[1] = new B("B inherits from A");
        alphabet[2] = new C("C inherits from B");
        alphabet[3] = new D("D inherits from C");
        alphabet[4] = new E("E inherits from D", new X("New X"));
        alphabet[5] = new F("F inherits from E", new X("Override new X"));
        alphabet[6] = new G("G inherits from F");
        alphabet[7] = new H("H inherits from G", new X("Last X override"));
        alphabet[8] = new I("I inherits from H");
        alphabet[9] = new J("J inherits from H");

        for (var alpha: alphabet) {
            System.out.println(alpha.toString());
        }
    }
}
