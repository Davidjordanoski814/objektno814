package fikt.kni.oop.z07;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Triagolnik p = new Triagolnik();
        System.out.println("Ploshtinata na triagolnikot e: " + p.plostina(10,14) + "cm2");
        System.out.println("Perimetarot na triagolnikot e: " + p.perimetar(10,14,20) + "cm");
    }
}
