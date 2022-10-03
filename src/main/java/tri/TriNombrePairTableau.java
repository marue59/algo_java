/*
Selectionner le plus grand nombre pair d'un tableau
Sortie max = 8
*/
package tri;


import java.lang.reflect.Array;
import java.util.Arrays;

public class TriNombrePairTableau {
    public static void main(String[] args) {
        // declare un tableau :
        int[] tab = {3, 6, 1, 9, 8, 4};
        // 1. Parcourir le tableau :
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        int max = 0 ;
        Arrays.sort(tab);

        for (int i = tab.length -1; i >= 0 ; i--) {
            if (tab[i] %2 == 0) {
                max = tab[i];
                break;
            }
        }
        System.out.println("Notre nombre max est "+max);
    }
}
