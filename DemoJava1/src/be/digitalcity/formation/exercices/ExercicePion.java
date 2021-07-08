package be.digitalcity.formation.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicePion {
    public static void main(String[] args) {

        char[] tableau = new char[10];
        tableau[0] = 'X';
        int position = 0;
        char choice;

        Scanner scanner = new Scanner(System.in);
                do{
                    System.out.println("Entrez (g) pour Gauche\nEntrez (d) pour droite\nEntrez (q) pour Quitter");
                    choice = scanner.next().charAt(0);
                    switch (choice){
                        case 'g':
                            if(position != 0){
                                tableau[position] = ' ';
                                position--;
                                tableau[position] = 'X';
                            }
                            break;

                        case 'd':
                            if(position != tableau.length - 1){
                                tableau[position] = ' ';
                                position++;
                                tableau[position] = 'X';
                            }
                            break;

                        case 'q':
                            break;

                        default:
                            System.out.println("Le caractère spécifié n'est pas reconnu !!!");
                            break;

                    }

                    System.out.println(Arrays.toString(tableau));

                }while (choice != 'q');
    }
}
