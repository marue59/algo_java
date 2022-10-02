/*Ecrire un programme java qui demande à l’utilisateur de saisir un nombre entier
et de lui afficher que le nombre est pair ou impair selon la valeur tapée
Cet algorithme utilise :
- la classe Scanner Java
- la structure conditionnelle if else Java
- le reste de la division euclidienne Java
 */
package nombrePaireImpaire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Tapez la valeur de l'entier n");
        Scanner entier=new Scanner(System.in);
        // je recupere ma variable en int:
        int n= entier.nextInt();

        // je prends la division de n=q*2 + reste
        // reste  que j'obtien : r= n%2 division de n /2
        int r= n%2;
        // n entier : n est paire quand le reste de la division est = 0
        // soit n=q*2 +r            => n est divisible par 2 donc r (le reste = zero)
        // quand r est != de 0      => n est impaire

        if(r==0){
            System.out.println("Le nombre est paire");
        } else {
            System.out.println("le nombre est impaire");
        }
    }
}