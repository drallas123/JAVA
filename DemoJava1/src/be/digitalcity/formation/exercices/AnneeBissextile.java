package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class AnneeBissextile {

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une année pour savoir si elle est bissextile :");

        int anneeBissex;

        Scanner scan = new Scanner(System.in);
        anneeBissex = scan.nextInt();

        if (anneeBissex % 4 == 0 && anneeBissex % 100 != 0 || anneeBissex % 400 == 0) {
            System.out.println("L'année " + anneeBissex + " est bissextile.");
        }
        else {
            System.out.println("L'année " + anneeBissex + " n'est pas bissextile.");
        }
    }
}
