package fikt.kni.oop.z04;

import fikt.kni.oop.z03.Covek;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Avtomobil a = new Avtomobil();
        a.marka = "BMW";
        a.model = "X5";
        a.pominati_kilometri = "257664";
        System.out.println("Markata na avtomobilot e : " + a.marka);
        System.out.println("Modelot na avtomobilot e : " + a.model);
        System.out.println("Avotmobilot ima izminato : " + a.pominati_kilometri + " " +"kilometri" );


        Avtomobil a1 = new Avtomobil( "Mercedes","220","354000");
        System.out.println("Markata na vtoriot avtomobilot e : " + a1.marka);
        System.out.println("Modelot na vtoriot avtomobilot e : " + a1.model);
        System.out.println("Avotmobilot vtoriot ima izminato : " + a1.pominati_kilometri + " " +"kilometri" );

    }
}
