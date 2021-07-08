package be.digitalcity.formation;

public class MainFunctions {


    public static void main(String[] args) {
        int val = 5;
        M1(val);
        System.out.println(val);

        M2(0, 5);

        M3(1000000000);

        System.out.println(moyenne(5,4,64,51,49,12,39));
    }

    public static void M1(int i) {
        System.out.println(++i);
    }

    public static int M1() {
        return 0;
    }

    // INTERDIT
//    public static double M1(){
//        return 0;
//    }

    public static int M1(double i) {
        return 0;
    }

    // return va forcer l'arrêt et ne lira pas le println si le a = 0
    public static void M2(int a, int b) {
        if (a == 0) {
            return;
        }
        System.out.println(a + b);
    }

    public static double M3(int a) {
        return a + 5;

    }

    // on peut déclarer un String avant mais pas après le int...

    public static double moyenne(int... cote) {
        var total = 0;
        for (int i = 0; i < cote.length; i++) {
            total += cote[i];
        }
        return (double) total / cote.length;
    }

}
