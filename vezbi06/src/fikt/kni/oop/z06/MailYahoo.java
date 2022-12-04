package fikt.kni.oop.z06;

import java.util.ArrayList;
import java.util.List;


public class MailYahoo {
    public static void main(String[] args) {
        List<String> mejl = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            mejl.add("mail" + (i) + "@yahoo.com");
        }

        for (int i = 1; i < mejl.size(); i++) {
            System.out.println(mejl.get(i));
        }

    }
}
