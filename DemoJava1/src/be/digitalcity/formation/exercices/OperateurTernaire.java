package be.digitalcity.formation.exercices;

public class OperateurTernaire {
    public static void main(String[] args) {

        int a = 0;

        if (a < 10){
            a = 20;
        }
        else{
            a = 30;
        }

        a = (a < 10) ? 20 : 30;

        System.out.println(a < 10 ? 20 : 30);

    }
}
