package be.digitalcity.formation.exercices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MasterMindMohAmine {
    public static void main(String[] args) {


        String[] combinaison;
        String[] essai;
        int compteurBonnePlace = 0;
        int compteurMauvaisePlace = 0;
        int compteurDeTours = 0;

        Scanner sc = new Scanner(System.in);

        char comb1;
        char comb2;
        char comb3;
        char comb4;

//        System.out.println("Veuillez introduire une combinaison à faire deviner (R pour rouge, B pour blanc, J pour jaune et V pour vert).");
//        combinaison = sc.nextLine().split("");

        Random r = new Random();

        do {
            comb1 = (char) (r.nextInt((104 - 97) + 1) + 97);
            comb2 = (char) (r.nextInt((104 - 97) + 1) + 97);
            comb3 = (char) (r.nextInt((104 - 97) + 1) + 97);
            comb4 = (char) (r.nextInt((104 - 97) + 1) + 97);

        } while (comb1 == comb2 || comb1 == comb3 || comb1 == comb4 || comb2 == comb3 || comb2 == comb4 || comb3 == comb4);

        combinaison = new String[]{String.valueOf(comb1), String.valueOf(comb2), String.valueOf(comb3), String.valueOf(comb4)};

        //System.out.println(Arrays.toString(combinaison));
        do {
            System.out.println("Veuillez introduire une combinaison pour deviner celle du 1er joueur");
            essai = sc.nextLine().split("");

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) {
                        if (essai[i].equals(combinaison[j])) {
                            compteurBonnePlace++;
                        }
                    } else if (essai[i].equals(combinaison[j])) {
                        compteurMauvaisePlace++;
                    }
                }
            }

            System.out.println("Il y a " + compteurBonnePlace + " bonnes couleurs à la bonne place et " + compteurMauvaisePlace + " bonnes couleurs à la mauvaise place");

            compteurBonnePlace = 0;
            compteurMauvaisePlace = 0;
            compteurDeTours++;

        } while (!(String.join("", combinaison).equals(String.join("", essai))) && compteurDeTours < 12);

        if (compteurDeTours == 12) {
            System.out.println("Vous avez essayé 12 fois, vous ne pouvez plus réessayer. La bonne combinaison était " + Arrays.toString(combinaison));
        } else {
            System.out.println("Bravo ! Vous avez deviné la bonne combinaison!!!!!");
        }
    }
}


