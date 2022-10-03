/*
 Trier les element d'un tableau
 Les ranger par ordres croissant et/ou decroissant
 */

package tri;

import java.util.Arrays;
import java.util.Collections;

public class TriCroissantDecroissant {
    public static void main(String[] args) {
        // initialiser le tableau
        int array[] = {11, 34, 23, 62, 6, 41};

        // afficher tous les entiers avant le tri
        for (int entier : array) {
            System.out.println("Nombre : " + entier);
        }

        // Trier le tableau
        Arrays.sort(array);

        // Afficher tous les entiers aprés le tri
        System.out.println("\nTableau trié :\n ");
        for (int entier : array) {
            System.out.println("Nombre : " + entier);
        }

        // Decroissant
        // initialiser le tableau
        int arrayDecroissant[] = {11, 34, 23, 62, 6, 41};
        // Creer un tableau qui contient des objet Integer
        Integer[] intArray = new Integer[arrayDecroissant.length];
        // afficher tous les entiers avant le tri
        // copier toutes les valeurs dans un tableau de type Integer

        for (int i = 0; i < arrayDecroissant.length; i++) {
            System.out.println("\n nombre \n" + Arrays.toString(arrayDecroissant));
            // instancier un nouveau tab integer
            intArray[i] = new Integer(array[i]);
        }
        // trier le tableau, puis l'inverser
        Arrays.sort(intArray, Collections.reverseOrder());

        // Afficher tous les entiers après le tri
        System.out.println("\nTableau trié\n");
        for (int entier : intArray) {
            System.out.println("nombre: " + entier);
        }
    }
}
