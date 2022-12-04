package fikt.kni.oop.z11;

import java.util.*;

public class Presek {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

        l1.add("Eden");
        l1.add("Dva");
        l1.add("Pet");

        l2.add("Pet");
        l2.add("Cetiri");
        l2.add("Eden");

        l1.retainAll(l2);
        System.out.println(l1);

    }

}
