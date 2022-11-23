package popravki2;

//package fikt.kni.oop.z01;

public class Avtomobil {
    public String marka;
    public String model;
    public String boja;
    public double pominatiKm;
    public int godinaNaProizvodstvo;
    public String registracija;

    public Avtomobil(String marka, String model, String boja, double pominatiKm, int godinaNaProizvodstvo, String registracija)
    {
        this.marka = marka;
        this.model = model;
        this.boja = boja;
        this.pominatiKm = pominatiKm;
        this.godinaNaProizvodstvo = godinaNaProizvodstvo;
        this.registracija = registracija;
    }

    public void firstMethod(){
        System.out.println("Marka:" + marka + ", Model:" + model + ", Boja:" + boja + " Registracija: " + registracija + " Godina na proizvodstvo: " + godinaNaProizvodstvo );
    }

    public double secondMethod(){
        double pKm;
        pKm = this.pominatiKm + 1520.25;
        return pKm;
    }
}