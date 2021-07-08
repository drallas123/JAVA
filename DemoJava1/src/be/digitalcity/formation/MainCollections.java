package be.digitalcity.formation;

import java.util.*;
import java.util.stream.Stream;

public class MainCollections {


    public static void main(String[] args) {
        // tableauMultiDimensionnel();
        // CollectionListes();
        // TableauAssociatifs();
        // Bulletin();


    }

    /*private static void Bulletin() {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Riri", (5+4+9)/3);
        map.put("Fifi", 9);
        map.put("Loulou", 9);

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        for(Integer key : map.keySet()){
            System.out.println(key);
        }

        for(String value : map.values()){
            System.out.println(value);
        }

    }*/

    /*private static void TableauAssociatifs() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Bonjour");
        map.put(5, "Et quoi");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        for(Integer key : map.keySet()){
            System.out.println(key);
        }

        for(String value : map.values()){
            System.out.println(value);
        }

    }*/

    /*private static <HashtSet> void CollectionListes() {
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(5D);
        int val = 153;
        list.add((double) val);
        list.add(list.indexOf(5D), 14D);
        list.forEach(x -> System.out.println(x));

        Collections.reverse(list);
        list.forEach(x -> System.out.println(x));

        Collections.sort(list);
        // list.sort((x,y)-> (int)(x - y));
        list.forEach(x -> System.out.println(x));

        HashSet<Integer> set = new Hashset<>();
        set.add(5);
        set.add(15);
        System.out.println(set.size());

    }*/


    public static void tableauMultiDimensionnel() {
        int[][] tableau = new int[2][];
        tableau[0] = new int[]{1, 2, 3, 4, 5};
        tableau[1] = new int[]{6, 7, 8, 9, 10};
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.println(tableau[i][j] + "\t");
            }
            System.out.println();

        }

    }

}
