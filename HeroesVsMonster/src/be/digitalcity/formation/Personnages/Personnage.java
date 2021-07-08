package be.digitalcity.formation.Personnages;

public abstract class Personnage {

    protected int endurance;
    protected int force;
    protected int pointsDeVie;

    public Personnage(int endurance, int force, int pointsDeVie) {
        this.endurance = endurance;
        this.force = force;
        this.pointsDeVie = pointsDeVie;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

}




