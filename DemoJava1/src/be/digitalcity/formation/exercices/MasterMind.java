package be.digitalcity.formation.exercices;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MasterMind {
    public static void main(String[] args) {
//        String reservoirDeCouleurs = "RVBNJM";

        //char [] reservoirDeCouleurs = {R, V, B, N, J, M};
        int nombreCouleurAProposer = 4;
        //int nombreCouleurDansReservoir = reservoirDeCouleurs.length();

        Random rand = new Random();

        for (int i = 0; i < nombreCouleurAProposer; i++) {
            //int indiceCouleurAleatoire = rand.nextInt(nombreCouleurDansReservoir);
            //System.out.print(reservoirDeCouleurs.charAt(indiceCouleurAleatoire));
        }
        System.out.println();








        // System.out.println("Tapez " + nombreCouleurAProposer + " caractères différents de la liste suivante : " + reservoirDeCouleurs);
        Scanner scan = new Scanner(System.in);

        String userText = scan.next();
    }
}
