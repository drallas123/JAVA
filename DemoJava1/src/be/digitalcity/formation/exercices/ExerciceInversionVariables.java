package be.digitalcity.formation.exercices;

public class ExerciceInversionVariables {

    public static void main(String[] args) {
        System.out.println("Inversion de variables");

        int A = 5, B = 7;
        int temp;

        System.out.println("Si A vaut " + A + " et B vaut " + B);

        temp = B;
        B = A;
        A = temp;

        System.out.println("Alors en inversant, A vaut " + A + " et B vaut " + B);



    }
}
