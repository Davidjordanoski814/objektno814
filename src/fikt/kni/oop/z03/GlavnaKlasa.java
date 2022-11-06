package fikt.kni.oop.z03;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Covek c = new Covek();
        c.ime = "David";
        c.prezime = "Jordanoski";
        c.embg = "2812004440000";
        System.out.println("Imeto na chovekot e : " + c.ime);
        System.out.println("Prezimeto na chovekot e : " + c.prezime);
        System.out.println("Chovekot ima matichen broj : " + c.embg);
    }
}
