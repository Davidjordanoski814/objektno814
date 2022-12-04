package fikt.kni.oop.z09;

import java.util.ArrayList;
import java.util.List;

public class GlavnaFakultet {
    public static void main(String[] args) {
        List<Fakultet> fakultet = new ArrayList<Fakultet>();

        Fakultet fakultet1 = new Fakultet("FIKT", 5, 250);
        fakultet.add(fakultet1);
        fakultet.add(new Fakultet("FEIT", 3, 178));
        fakultet.add(new Fakultet("FINKI", 7, 300));
        fakultet.add(new Fakultet("TFM", 2, 100));
        fakultet.add(new Fakultet("MF", 5, 500));

        for (int i = 0; i < fakultet.size(); i++) {
            System.out.println("Ime na fakultetot: " + fakultet.get(i).getIme_na_fakultet());
            System.out.println("Broj na smerovi: " + fakultet.get(i).getBroj_smerovi());
            System.out.println("Vkupno studenti: " + fakultet.get(i).getVk_studenti());
        }
    }
}
