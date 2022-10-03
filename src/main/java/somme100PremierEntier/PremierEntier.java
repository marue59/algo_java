/* Ecrire un programme :
1. qui calcule la somme des 100premiers entiers.
2. qui demande à l'utilisateur de saisir un nombre entier n
3. qui affichera la somme des n premiers nombres entiers.
 */

package somme100PremierEntier;

import java.util.Scanner;

public class PremierEntier {
    public static void main(String[] args) {
    /* Exo 1. Calculer l'addition :
        Instantier une variable et faire une boucle.
        Incrémenter la variable dans la boucle dessus.
    */
        int j = 0;
        for (int i = 1; i <=100 ; i++) {
            j = j + i;
            // donc à chaque passage de boucle j est incrémenté.
        }
        System.out.println("la somme des 100 premiers nombre est : " + j);

    /*
    Exo 2. À la place de n = 100 on aura n = nombre saisi par le user.
    */
        System.out.println("taper la valeur de n : ");
        // Je recupere n a l'aide de la classe Scanner
        Scanner nombre = new Scanner(System.in);
        // Je définis une variable à laquel j'affecte la valeur saisie par le user
        int n = nombre.nextInt();

        // je fais l'addition cf:exo 1

        int m = 0;
        for (int i = 1; i <= n ; i++) {
            m = m + i;
        }
        System.out.println("la somme des " + n + " premier nombre est : " + m);
    }
}
