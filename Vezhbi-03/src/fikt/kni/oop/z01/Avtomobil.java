package fikt.kni.oop.z01;

public class Avtomobil {
    public String marka;
    public String model;
    public String boja;
    public double pominatiKm;
    public int godinaNaProizvodstvo;
    public String registracija;

    public Avtomobil()
    {
        this.marka = marka;
        this.model = model;
        this.boja = boja;
        this.pominatiKm = pominatiKm;
        this.godinaNaProizvodstvo = godinaNaProizvodstvo;
        this.registracija = registracija;
    }

    public void firstMethod(){
        System.out.println("Marka:" + this.marka + ", Model:" + this.model + ", Boja:" + this.boja);
    }

    public double secondMethod(){
        double pKm;
        pKm = this.pominatiKm + 1520.25;
        return pKm;
    }
}
