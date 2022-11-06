package fikt.kni.oop.z05;

public class Predmet {
    public String ime_na_predmetot;
    public String profesor_po_predmetot;
    public String broj_na_krediti;

    public String koj_semestar_e_predmetot;

    public Predmet() {

    }

    public Predmet(String ime_na_predmetot) {
        this.ime_na_predmetot = ime_na_predmetot;
    }

    public Predmet(String ime_na_predmetot, String profesor_po_predmetot, String broj_na_krediti) {
        this.ime_na_predmetot = ime_na_predmetot;
        this.profesor_po_predmetot = profesor_po_predmetot;
        this.broj_na_krediti = broj_na_krediti;
    }
}