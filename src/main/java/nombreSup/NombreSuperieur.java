/*
Afficher le nombre superieur entre 2 nombres saisi par l'utilisateur
 */
package nombreSup;

import java.util.Scanner;

public class NombreSuperieur {
    public static void main(String[] args) {
        System.out.println("Saississez un nombre x :");
        Scanner nombre1= new Scanner(System.in);
        float x = nombre1.nextFloat();

        System.out.println("Saississez votre 2eme nombre y :");
        Scanner nombre2= new Scanner(System.in);
        float y = nombre2.nextFloat();

        // Je compare les 2 nombres grance a if
        if(x <= y){
            System.out.println("le nombre : "+x +" est plus petit que le nombre : " +y);
        } else {
            System.out.println("le nombre : " +x+ " est plus grand que le nombre : "+y);
        }
    }
}
