package fikt.kni.oop.z05;

import java.util.ArrayList;
import java.util.List;

public class CeliBroevi2 {
    public static void main(String[] args) {
        List<Integer> celibr = new ArrayList<>();
        celibr.add(26);
        celibr.add(814);
        celibr.add(6);
        celibr.add(22);
        celibr.add(16);
        System.out.println("Vtoriot element vo listata na celi broevi e: " + celibr.get(1));
    }
}
