package fikt.kni.oop.z03;

import java.util.ArrayList;
import java.util.List;

public class SmeroviFIKT {
    public static void main(String[] args) {
        List<String> smerovi = new ArrayList<>();
        smerovi.add("INKI");
        smerovi.add("IKT");
        smerovi.add("KNI");
        smerovi.add("IMB");
        smerovi.add(2, "DS");
        System.out.println("Smerovite vneseni vo listata se: " + smerovi);
    }
}
