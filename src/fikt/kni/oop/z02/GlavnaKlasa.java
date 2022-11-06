package fikt.kni.oop.z02;

public class GlavnaKlasa {
    public static void main(String[] args) {

        Vraboten object1 = new Vraboten();
        object1.ime = "David";
        object1.prezime = "Jordanoski";
        object1.plata = 15000;
        System.out.println("Imeto na vraboteniot e : " + object1.ime);
        System.out.println("Prezimeto na vraboteniot e : " + object1.prezime);
        System.out.println("Platana na vraboteniot iznesuva: " + object1.plata + " denari.");
    }
}
