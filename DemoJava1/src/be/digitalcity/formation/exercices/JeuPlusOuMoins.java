package be.digitalcity.formation.exercices;

import java.util.Random;
import java.util.Scanner;

public class JeuPlusOuMoins {
    public static void main(String[] args) {

        Random rand = new Random();
        int nbrRand = rand.nextInt(100);
        ///System.out.println(nbrRand);
        int essai = 0;
        int userText = 0;
        System.out.println("Devinez le nombre entre 0 et 100");

        do {
            Scanner scan = new Scanner(System.in);
            userText = scan.nextInt();

            if (userText > nbrRand) {
                System.out.println("le nombre est plus petit");
                essai++;

            }
            else if (userText < nbrRand) {
                System.out.println("le nombre est plus grand");
                essai++;

            }
            else {
                System.out.println("Bravo vous avez trouvé en " + essai + " essais.");
            }
        }while (userText != nbrRand);

    }
}
