package AfficherMessage;

import java.util.Scanner;

public class AfficherMessage {
    public static void main(String[] args) {
        System.out.println("Saisissez votre nom");
        Scanner sc = new Scanner(System.in);

        // je recupère le scanner dans une variable
        String nom = sc.nextLine();
        System.out.println("Bienvenue : "+ nom);

    }
}
