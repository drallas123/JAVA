package be.digitalcity.formation.Banque;

public interface Banquier {

    void depot (double montant);
    void retrait(double montant);
    double appliquerInteret(double tauxInteret);
}
