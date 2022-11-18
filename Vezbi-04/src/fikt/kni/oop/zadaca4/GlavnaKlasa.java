package fikt.kni.oop.zadaca4;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Avtomobil a = new Avtomobil("BMW", "320D","Hot pink", 225334);

        System.out.println("Markata na avtomobilot e: " + a.getMarka());
        System.out.println("Modelot na avtomobilot e: " + a.getModel());
        System.out.println("Bojata na avtomobilot e: " + a.getBoja());
        System.out.println("Pominati kilometri: " + a.getPominatiKM());
        System.out.println("Presmetkata na metodot: " + a.metod_za_presmetka(24));

    }
}
