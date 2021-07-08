package be.digitalcity.formation.Banque;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Personne titulaire = new Personne("Allard", "Selim",LocalDate.of(1986,8,14));

        Compte courant = new Courant("BE151412151412",titulaire,500);
        Compte courant1 = new Courant("BE124565321278", titulaire);

        Epargne epargne = new Epargne("BE506519781203",2500, LocalDateTime.of(2021,6,22,12,02),titulaire);

        Banque banque = new Banque("BNP Paribas Fortis");
        banque.ajouter(courant);
        banque.ajouter(courant1);

        courant.depot(1000);
        courant.retrait(1200);
        courant.retrait(500);

        courant1.depot( 500);
        courant1.retrait(650);

        epargne.retrait(2000);

        Compte rechercheCompte = banque.rechercherCompte("BE151412151412");

        double totalAvoirs = banque.avoirDesComptes(titulaire);

        ((Banquier)rechercheCompte).appliquerInteret
                (rechercheCompte instanceof Courant ?
                ((Courant)rechercheCompte).TAUX_INTERET :
                ((Epargne)rechercheCompte).TAUX_INTERET);

    }
}
