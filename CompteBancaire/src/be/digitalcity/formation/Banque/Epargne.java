package be.digitalcity.formation.Banque;

import java.time.LocalDateTime;

public final class Epargne extends Compte{

    private LocalDateTime dateDernierRetrait;

    protected final double TAUX_INTERET = 3.95;

    public Epargne(String numero, Personne titulaire){
        super(dateDernierRetrait, numero, titulaire);
    }

    public Epargne(String numero, double solde, LocalDateTime dateDernierRetrait, Personne titulaire) {
        super(numero,solde,dateDernierRetrait,titulaire);


    }

    public LocalDateTime getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    public void setDateDernierRetrait(LocalDateTime dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }

//    public void depot(double montant) {
//        super.depot(montant);
//    }

    public void retrait(double montant){
        if(montant < this.solde){
            this.solde -= montant;
            this.setDateDernierRetrait(LocalDateTime.now());
            System.out.printf("Retrait de %10.2f EUR sur le compte %s %15s le %tD-%tM-%tY" +
                    "\nNouveau solde de %12.2f EUR\n\n", montant, this.getClass().getSimpleName().toUpperCase(), this.numero,this.dateDernierRetrait, this.solde);
        }
        else {
            System.out.printf("Retrait de %10.2f EUR sur le compte %s %15s est impossible" +
                    "\nSolde insuffisant\n\n", montant, this.getClass().getSimpleName().toUpperCase(), this.numero);
        }
    }
}
