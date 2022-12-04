package fikt.kni.oop.z01;

import java.util.ArrayList;
import java.util.List;

public class GlavnaGradovi {
    public static void main(String[] args) {
        List<String> gradovi = new ArrayList<>();
        gradovi.add("Prilep");
        gradovi.add("Bitola");
        gradovi.add("Veles");
        gradovi.add("Skopje");
        gradovi.add("Ohrid");
        System.out.println("Pette gradovi vo listata se: " + gradovi);
    }
}
