package fikt.kni.oop.z04;
import java.util.Scanner;
public class GlavnaKlasa {
    public static void main(String[] args)
        {
            try(Scanner vnes = new Scanner(System.in)) {
                Brojac b = new Brojac();
                System.out.println("Vnesi go brojot na frlanja na parichkata: ");
                b.BrFrlanja= vnes.nextInt();// vnes od tastatura na broj na frlanja na parickata
                b.ZgolemuvanjeBrojac(b.BrFrlanja); // povikuvanje na funkcija za zgolemuvanje na brojac, i so toa kolku pati padnale pismo ili glava
                b.Resetiranje(b.BrGlava,b.BrPismo); // povikuvanje na resetiranjeto na brojacite
            }
        }
    }

