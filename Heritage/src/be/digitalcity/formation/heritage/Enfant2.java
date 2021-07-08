package be.digitalcity.formation.heritage;

public final class Enfant2 extends Parent{
    @Override
    protected void seDeplacer() {

    }

    @Override
    protected void respirer() {
        super.respirer();
        System.out.println("Je ne sais pas");
    }
}
