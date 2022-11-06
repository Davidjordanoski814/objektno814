package fikt.kni.oop.z05;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Predmet p = new Predmet();
        p.ime_na_predmetot = "Objektno-orientirano-programiranje";
        p.profesor_po_predmetot = "Prof.dr. Ilija Jolevski";
        p.koj_semestar_e_predmetot = "Tret";
        p.broj_na_krediti = "6";
        // /^\OVA BESHE KREIRANJE NA OBJEKT SO DEFAULT KONSTRUKTOR
        System.out.println("Imeto na prdedmetot e: " + p.ime_na_predmetot);
        System.out.println("Imeto na profesorot e: " + p.profesor_po_predmetot);
        System.out.println("Predmetot e vo: " + p.koj_semestar_e_predmetot + " semestar");
        System.out.println("Brojot na krediti e: " + p.broj_na_krediti);

        Predmet p1 = new Predmet("Algoritmi i strukturi na podatoci");//DINAMICKI KONSTRUKTOR POVIKUVA
        System.out.println("Imeto na prdedmetot e: " + p1.ime_na_predmetot);

        Predmet p2 = new Predmet( "Napredno Programiranje","Prof.dr. Ramona Markoska", "8");//DINAMICKI KONSTRUKTOR POVIKUVA
        System.out.println("Imeto na prdedmetot e: " + p2.ime_na_predmetot );
        System.out.println("Imeto na profesorot e: " + p2.profesor_po_predmetot);
        System.out.println("Brojot na krediti e: " + p2.broj_na_krediti);





    }
}
