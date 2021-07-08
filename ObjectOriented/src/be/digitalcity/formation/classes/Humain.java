package be.digitalcity.formation.classes;

import java.time.LocalDate;

public class Humain {
    private String nom;
    private String prenom;
    public LocalDate anniversaire;

    public static int COUNT;

    /** Constructeur */

     public Humain() {
        COUNT++;
    }

    /** Getters & Setters */

    public void Humain(String nom) {
        this();
        this.nom = nom;

    }

    public String Humain(String nom, String prenom) {
        this(nom);
        this.prenom = prenom;
    }

    public String getNom(){
        return nom;
    }




    public void afficher(){
        System.out.println(nom + " " + prenom + " " + anniversaire);
    }
}
