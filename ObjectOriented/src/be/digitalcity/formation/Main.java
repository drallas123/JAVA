package be.digitalcity.formation;

import be.digitalcity.formation.classes.Humain;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Humain personne = new Humain();
        // On affecte le prénom Selim à la caracteristique prenom dans la variable personne
        personne.setPrenom("Selim");
        personne.setNom("Allard");
        personne.anniversaire = LocalDate.of(1986,8,14);

        personne.afficher();
        System.out.println(Humain.COUNT);


        Humain personne2 = new Humain();

//        Humain personne2 = new Humain();
//        personne2.prenom = "Caro";
//        personne2.nom = "Herssens";
//        personne2.anniversaire = LocalDate.of(1983,9,26);

//        personne2.afficher();
//        System.out.println(Humain.COUNT);
    }
}
