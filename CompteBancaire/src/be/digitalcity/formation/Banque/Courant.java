package be.digitalcity.formation.Banque;

public final class Courant extends Compte {

    // private double solde;
    private double ligneDeCredit;

    protected final double TAUX_INTERET = 5.75;

    public Courant(String numero, Personne titulaire){
        super(numero, titulaire);
    }

    public Courant(String numero, Personne titulaire, double ligneDeCredit){
        super(numero, titulaire);
        this.ligneDeCredit = ligneDeCredit;
    }

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {
        this.ligneDeCredit = Math.abs(ligneDeCredit);
    }

//    public void depot(double montant) {
//        super.depot(montant);
//    }

    public void retrait(double montant) {
        if (montant < this.solde + this.ligneDeCredit) {
            this.solde -= montant;
            System.out.printf("Retrait de %10.2f EUR sur le compte %s %15s" +
                    "\nNouveau solde de %12.2f EUR\n\n", montant, this.getClass().getSimpleName(), this.numero, this.solde);
        } else {
            System.out.printf("Retrait de %10.2f EUR sur le compte %s %15s est impossible" +
                    "\nSolde insuffisant\n\n", montant, this.getClass().getSimpleName(), this.numero);
        }
    }
}




