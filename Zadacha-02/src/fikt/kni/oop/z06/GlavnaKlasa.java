package fikt.kni.oop.z06;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Proizvod p = new Proizvod();
        System.out.println("Cenata na " + p.ime_na_proizvod + "to" + " so tezhina od " + p.tezhina + "g iznesuva " + p.cena + " denari");
    }
}
