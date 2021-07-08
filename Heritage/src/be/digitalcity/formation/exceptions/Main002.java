package be.digitalcity.formation.exceptions;

public class Main002 {

    public static void main(String[] args) {

        try {
            System.out.println(10/0);
            GenereErreur();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Code inatégniable");
    }

    public static void GenereErreur() throws NullPointerException{
        throw new NullPointerException();
    }

}