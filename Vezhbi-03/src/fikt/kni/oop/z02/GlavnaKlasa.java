package fikt.kni.oop.z02;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Fakultet fakultet1 = new Fakultet();
        fakultet1.nazivNaFakulet = "FIKT";
        fakultet1.sedishte = "Studentska-bb-Bitola";
        fakultet1.brojNaStudenti = 270;
        fakultet1.brojNaSmerovi = 2;
        fakultet1.dekan = "Aleksandar Markoski";

        fakultet1.firstMethod();
        System.out.println("Namalen broj na studentite:" + fakultet1.secondMethod(24));
        fakultet1.thirdMethod();
        System.out.println("------------------------------------------------------------------------------------------------------");
        Fakultet fakultet2 = new Fakultet();
        fakultet2.nazivNaFakulet = "Ekonomski fakultet Prilep";
        fakultet2.sedishte = "Prilepski braniteli-bb-Prilep";
        fakultet2.brojNaStudenti = 182;
        fakultet2.brojNaSmerovi = 4;
        fakultet2.dekan = "Dragica Odzaklieska";

        fakultet2.firstMethod();
        System.out.println("Namalen broj na studentite:" + fakultet2.secondMethod(65));
        fakultet2.thirdMethod();
    }
}
