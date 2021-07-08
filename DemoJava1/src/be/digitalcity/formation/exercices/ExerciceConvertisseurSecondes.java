package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class ExerciceConvertisseurSecondes {

    public static void main(String[] args) {

        int totalSecondes, jours, heures, minutes, secondes;

        System.out.println("Entrez le nombre de secondes que vous voulez convertir :");

        Scanner scan = new Scanner(System.in);
        totalSecondes = scan.nextInt();

        jours = totalSecondes/86400;
        heures = totalSecondes%86400/3600;
        minutes = totalSecondes%86400%3600/60;
        secondes = totalSecondes%86400%3600%60;

        System.out.println(totalSecondes+" secondes sont équivalentes à : " +jours +" jours/ "+ heures+" heures/ "+ minutes+" minutes/ " + secondes+" secondes.");

    }
}
