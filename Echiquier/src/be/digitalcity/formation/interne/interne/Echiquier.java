package be.digitalcity.formation.interne.interne;

import java.util.ArrayList;
import java.util.List;

public class Echiquier {

    public String modele;

    class Case {

        public int X;
        public int Y;

        public void Afficher(){
            System.out.println(modele);
        }


    }

    List<Case> cases = new ArrayList<>();
}
