package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class MotDePasse {
    public static void main(String[] args) {
        int code, secret;
        float essai;
        essai = 3;
        secret = 1234;
        Scanner userText = new Scanner(System.in);
        do {
            System.out.println("Veuillez entrer votre code ?");
            code = userText.nextInt();
            if ((code == secret) & (essai >= 0)) {
                System.out.println("Bienvenue!");
            }
            else {
                System.out.println("Ils vous reste encore " + --essai + " essai(s)");

            }
        }
        while (!"1234".equals(code) && essai > 0);
    }
}
