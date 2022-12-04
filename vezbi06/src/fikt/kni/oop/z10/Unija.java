package fikt.kni.oop.z10;
import java.util.*;
public class Unija {

    public static void main(String[] args) {
        List<String> l1= new ArrayList<>();
        List<String> l2= new ArrayList<>();

        l1.add("Eden");
        l1.add("Dva");
        l1.add("Pet");

        l2.add("Tri");
        l2.add("Cetiri");

        l1.addAll(l2);
        System.out.println(l1);

    }

}