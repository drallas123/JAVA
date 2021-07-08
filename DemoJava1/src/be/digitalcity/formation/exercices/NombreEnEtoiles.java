package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class NombreEnEtoiles {
    public static void main(String[] args) {

        System.out.println("Entrez un nombre :");

        Scanner scan = new Scanner(System.in);
        int userText = scan.nextInt();
        char etoile = 0;

        for (int i = 0; i < userText; i++) {
            System.out.println("*");
            etoile++;
        }

    }
}
