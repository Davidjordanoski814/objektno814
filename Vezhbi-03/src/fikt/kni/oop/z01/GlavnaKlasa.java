package fikt.kni.oop.z01;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Avtomobil avto = new Avtomobil();
        avto.marka = "BMW";
        avto.model = "320d";
        avto.boja = "Hot red";
        avto.pominatiKm = 222335;
        avto.registracija = "PP-2022-BT";
        avto.godinaNaProizvodstvo = 2008;

        avto.firstMethod();

        System.out.println("Izminatite kilometri so dodadeni 1520.25km se:" + avto.secondMethod());





    }
}
