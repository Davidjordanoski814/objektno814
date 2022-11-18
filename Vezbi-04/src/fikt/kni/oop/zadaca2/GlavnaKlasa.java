package fikt.kni.oop.zadaca2;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Restoran r = new Restoran();
        r.setIme_na_restoranot("Pajton");
        r.setLokacija("Prilep");
        r.setTelefon("048-520-236");
        r.setBroj_na_sedishta(200);

        System.out.println("Imeto na restoranot e: " + r.getIme_na_restoranot());
        System.out.println("Lokacijata na restoranot e: " + r.getLokacija());
        System.out.println("Telefonskiot broj na restoranot e: " + r.getTelefon());
        System.out.println("Brojot na sedishta so koj raspolaga restoranot e: " + r.getBroj_na_sedishta());
    }
}
