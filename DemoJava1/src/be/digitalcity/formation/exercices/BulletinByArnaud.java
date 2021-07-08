package be.digitalcity.formation.exercices;

import java.util.Arrays;
import java.util.HashMap;

public class BulletinByArnaud {
    public static void main(String[] args) {

        //creating bulletin
        HashMap<String, Integer[]> bulletin = getBulletinClasse();

        //displaying bulletin & mean
        for (String k : bulletin.keySet() ){
            System.out.println(getMean(bulletin, k));
        }
    }

    private static HashMap<String, Integer[]> getBulletinClasse() {
        HashMap<String, Integer[]> bulletin = new HashMap<>();
        bulletin.put("Arnaud", new Integer[]{1,2,3,4,5});
        bulletin.put("Martin", new Integer[]{6,7,8,9,10});
        bulletin.put("Selim", new Integer[]{11,12,13,14,15});

        return bulletin;
    }

    private static String getMean(HashMap<String, Integer[]> map, String key) {
        int total = 0 ;
        int nbNotes = 0;
        for (Integer i : map.get(key)) {
            total +=i;
            ++nbNotes;
        }
        return key + " : " + Arrays.toString(map.get(key)) + " : moyenne : "+ total/nbNotes ;
    }
}
