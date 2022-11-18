package fikt.kni.oop.zadaca1;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Covek c = new Covek();
        c.setIme("David");
        c.setPrezime("Jordanoski");
        c.setMatichen_broj("1610200220223");
        System.out.println("Imeto na covekot e: " + c.getIme());
        System.out.println("Prezimeto na covekot e: " + c.getPrezime());
        System.out.println("Matichniot broj na covekot e: " + c.getMatichen_broj());
    }
}
