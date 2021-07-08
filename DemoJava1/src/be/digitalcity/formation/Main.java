package be.digitalcity.formation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Affichage dans la console
        System.out.println("Bienvenue dans Java SE11");

        // Permet de faire un console.readline()
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        // Ecrire sout permet d'appeler le system.out.println()
        System.out.println(message);

/*
        int incr = 6;
        System.out.println(++incr);
        switch (incr) {
            case 4:
            case 5:
            case 6:
                System.out.println("Coucou");
                break;
            case 7:
                System.out.println("Encore moi");
                break;
            default:
                System.err.println("Pas normal");
                break;
            }
*/


        int[] tab = new int[]{1, 2, 3, 4};

        for (int item : tab){
            System.out.println(item);
        }


    }
}
