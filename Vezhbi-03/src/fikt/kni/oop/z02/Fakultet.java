package fikt.kni.oop.z02;

public class Fakultet {
    public String nazivNaFakulet;
    public int brojNaSmerovi;
    public int brojNaStudenti;
    public String dekan;
    public String sedishte;

    public void firstMethod(){
        System.out.println("Zgolemen broj na studenti za 50 e: " + (this.brojNaStudenti + 50));
    }

    public int secondMethod(int namali){
        int namalenaVrednost = this.brojNaStudenti - namali;
        return namalenaVrednost;
    }

    public void thirdMethod(){
        System.out.println("Naziv na fakultetot: " + this.nazivNaFakulet + ", negovoto sedishte e vo: " + this.sedishte + ".");
    }
}
