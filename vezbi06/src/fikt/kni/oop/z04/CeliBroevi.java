package fikt.kni.oop.z04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CeliBroevi {
    public static void main(String[] args) {
        List<Integer> celibroevi = new ArrayList<>();
        celibroevi.add(5);
        celibroevi.add(225);
        celibroevi.add(16);
        celibroevi.add(18);
        celibroevi.add(814);

        Collections.sort(celibroevi);
        System.out.println("Sortiranata niza na celi broevi vo listata e: " + celibroevi);

    }
}
