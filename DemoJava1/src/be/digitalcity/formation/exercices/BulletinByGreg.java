package be.digitalcity.formation.exercices;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BulletinByGreg {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, int[]> bulletin = generateBulletin();
        afficherBulletin(bulletin);
    }

    private static void afficherBulletin(HashMap<String,int[]> bulletin) {
        bulletin.forEach((k, v) -> {
            System.out.printf("%10s\tCOTES : %s\tMOY : %s\n",k, Arrays.toString(v), calculMoyenne(v));
        });
    }

    private static double calculMoyenne(int[] v) {
        int total = 0;
        for (int value : v) {
            total += value;
        }
        return (double) total / v.length;
    }

    private static HashMap<String,int[]> generateBulletin() {
        HashMap<String, int[]> bulletin = new HashMap<>();
        boolean continuer = true;
        do {

            System.out.println("Entrez le nom de l'élève");
            String key = scanner.nextLine();
            System.out.println("Côte 1");
            int cote1 = scanner.nextInt();
            System.out.println("Côte 2");
            int cote2 = scanner.nextInt();
            System.out.println("Côte 3");
            int cote3 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Voulez-vous introduire un autre élève (O/N) ?");
            String choice = scanner.nextLine();
            if (choice.charAt(0) == 'N' || choice.charAt(0) == 'n') {
                continuer = false;
            }


            bulletin.put(key, new int[] {cote1, cote2, cote3});

        } while (continuer);

        return bulletin;
    }
}
