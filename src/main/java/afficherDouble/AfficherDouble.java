package afficherDouble;

import java.util.Scanner;

public class AfficherDouble {
    public static void main(String[] args) {
        System.out.println("Taper un nombre");

        // j'instancie la classe Scanner
        Scanner nombre = new Scanner(System.in);

        // je veux recuperer dans une variable la valeur taper par l'utilisateur
        int n = nombre.nextInt();

        // je defini le double de l'entier n
        int m = 2*n;
        System.out.println("le double de " + n + " est : "+ m);
    }
}
