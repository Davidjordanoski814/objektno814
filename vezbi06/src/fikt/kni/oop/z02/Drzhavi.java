package fikt.kni.oop.z02;

import java.util.ArrayList;
import java.util.List;

public class Drzhavi {
    public static void main(String[] args) {
        List<String> drzhavi = new ArrayList<>();
        drzhavi.add("Makedonija");
        drzhavi.add("Srbija");
        drzhavi.add("Anglija");
        System.out.println("Goleminata na listata e:" + drzhavi.size());
        if (drzhavi.size() == 3) {
            drzhavi.add("Belgija");
            drzhavi.add("Japonija");
            System.out.println("Drhzavite smesteni vo listata se: " + drzhavi);
        } else {
            System.out.println("Drhzavite smesteni vo listata se: " + drzhavi);
        }
    }
}
