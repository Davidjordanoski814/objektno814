package fikt.kni.oop.z09;

public class Fakultet {
    private String ime_na_fakultet;
    private int broj_smerovi;
    private double vk_studenti;

    public Fakultet(String ime_na_fakultet, int broj_smerovi, double vk_studenti) {
        this.broj_smerovi = broj_smerovi;
        this.ime_na_fakultet = ime_na_fakultet;
        this.vk_studenti = vk_studenti;
    }

    public String getIme_na_fakultet() {
        return ime_na_fakultet;
    }

    public void setIme_na_fakultet(String ime_na_fakultet) {
        this.ime_na_fakultet = ime_na_fakultet;
    }

    public int getBroj_smerovi() {
        return broj_smerovi;
    }

    public void setBroj_smerovi(int broj_smerovi) {
        this.broj_smerovi = broj_smerovi;
    }

    public double getVk_studenti() {
        return vk_studenti;
    }

    public void setVk_studenti(double vk_studenti) {
        this.vk_studenti = vk_studenti;
    }
}
