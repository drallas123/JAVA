package be.digitalcity.formation.heritage;

public abstract class Parent {

    protected String nom;

    protected abstract void seDeplacer();

    protected void respirer(){
        System.out.printf("%s respire ", this.nom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
