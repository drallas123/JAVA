package be.digitalcity.formation.Banque;

import java.util.HashMap;

public class Banque {

    private final String nom;

    private final HashMap<String, Compte> comptes = new HashMap<>();

    public Banque(String nom) {

        this.nom = nom;
    }

    public String getNom() {

        return nom;
    }

    public HashMap<String, Compte> getComptes() {
        return comptes;
    }

    public void ajouter(Compte compte) {
        if (compte != null) {
            this.comptes.put(compte.getNumero(), compte);
            System.out.printf("Nouveau compte %s [%14s] ajouté\n", compte.getNumero());
        } else {
            System.out.println("Impossible d'ajouter le compte");
        }
    }

    public void supprimer(String numero) {
        if (this.comptes.remove(numero) != null) {
            System.out.printf("Le compte [%14s] a bien été supprimé !", numero);
        } else {
            System.err.printf("Le compte [%14s] n'a pas été trouvé !", numero);
        }
    }

    public Compte rechercherCompte(String numero) {
        if (numero != null) {
            if (this.comptes.containsKey(numero)) {
                System.out.printf("\nVoici les informations du compte %10s\n" +
                        "Nom du titulaire : " + this.comptes.get(numero).getTitulaire().getNom() + " " + this.comptes.get(numero).getTitulaire().getPrenom() + "\n" +
                        "Solde : " + this.comptes.get(numero).getSolde() + "\n\n", numero);
                return this.comptes.get(numero);
            } else {
                System.out.printf("Le compte [%14s] n'a pas été trouvé !", numero);
            }
        } else {
            System.err.println("Le numéro de compte n'est pas valide !");
        }
        return null;
    }

    public double avoirDesComptes(Personne titulaire) {
        if (titulaire != null) {
            double totalAvoir = 0;
            int compteur = 0;

            for (Compte compte : this.comptes.values()) {
                if (compte.getTitulaire().equals(titulaire)) {
                    compteur++;
                    if (compte.getSolde() > 0) {
                        totalAvoir += compte.getSolde();
                    }
                }
            }
            if (compteur == 0) {
                System.out.printf("Le titulaire 25%s ne possède pas de comptes\n", titulaire.getPrenom() + " " + titulaire.getNom());
            } else {
                System.out.printf("Total des avoirs de %25s : %.2fEUR\n",
                        titulaire.getPrenom() + " " + titulaire.getNom(),
                        totalAvoir);
            }
            return totalAvoir;


        }
        System.err.println("Problème de donné non valide");
        return 0;
    }
}
