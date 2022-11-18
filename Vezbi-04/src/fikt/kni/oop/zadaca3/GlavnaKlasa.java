package fikt.kni.oop.zadaca3;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Proizvod p = new Proizvod();
        System.out.println("Ime na proizvod: " + p.getIme_na_proizvod());
        System.out.println("Proizvoditel: " + p.getProizvoditel());
        System.out.println("Cenata e: " + (int)p.getCena_na_prozivodot() +" denari");
        System.out.println("Tezhinata na proizvodot e: " + p.getTezhina());
    }
}
