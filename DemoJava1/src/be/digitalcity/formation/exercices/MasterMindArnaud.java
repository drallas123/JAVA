package be.digitalcity.formation.exercices;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MasterMindArnaud {

    static String combination = generateCombination();
    static  boolean isGameOver = false;

    public static void main(String[] args) {
        System.out.println(combination);
        while(!isGameOver){
            play();
        }
    }

    /**
     * @return a String representing a set of color, one color can only appears once
     */
    private static String generateCombination() {
        String result ="";
        ArrayList<String> possibilities = new ArrayList<>();

        possibilities.add("r"); //red
        possibilities.add("g"); //green
        possibilities.add("y"); //yellow
        possibilities.add("b"); //blue
        possibilities.add("p"); //purple
        possibilities.add("w"); //withe

        Random r = new Random();
        int temp = 0;
        for (int i = 0 ; i < 4 ; i++) {
            temp = r.nextInt((possibilities.size()));
            while(result.contains(possibilities.get(temp))) temp = r.nextInt((possibilities.size())-i);
            result = result+possibilities.get(temp);
        }
        return  result;
    }

    /**
     * ask a candidate combination in order to compare it with the original combination
     * if they're similar isGameOver is set to true and therefore the game is over
     * else the result are displayed
     * wellPlaced : the number of color that are in the right position
     * goodColor : the number of color that are similar between the candidate and the combination
     */
    private static void play() {
        String candidate = askCandidate();
        int wellPlaced = 0;
        int goodColor = 0;
        if (candidate.equals(combination)){
            isGameOver = true;
        }
        else {
            wellPlaced = getWellPlaced(candidate);
            goodColor = getGoodColor(candidate) - wellPlaced; // since counted twice, one must subtract the wellPlaced from goodColor
        }
        displayResult(wellPlaced, goodColor, candidate);
    }


    private static void displayResult(int wellPlaced, int goodColor, String candidate) {
        if(!isGameOver){
            System.out.println("candidate : "+candidate);
            System.out.println("wellplaced : "+wellPlaced);
            System.out.println("goodColor : "+goodColor);
        }
        else {
            System.out.println("Félicitation ! La combinaison était bien "+combination);
        }
    }

    /**
     * ask the player to enter a String representing his guess for combination
     */
    private static String askCandidate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre combinaison de 4 couleurs (r,g,y,b,p,w)");
        String temp = sc.nextLine();
        return isValid(temp) ? temp : askCandidate();
    }

    /**
     * @param s the string to be tested
     * @return if the given string matches the possible color and the size of the combination String
     */
    private  static boolean isValid(String s){
        if(s.length()>4) return false;
        String regEx = "[rgbypw]{4}";
        return s.matches(regEx);
    }

    /**
     * @param candidate the String that will be compared with the combination
     * @return the number of char placed at the right position in the String candidate
     */
    private static int getWellPlaced(String candidate){
        int temp = 0;
        for (int i = 0 ; i < candidate.length(); i++){
            if(candidate.charAt(i)==combination.charAt(i)) ++temp;
        }
        return temp;
    }

    /**
     * @param candidate the String that will be compared with the combination
     * @return the number of char that are similar between combination and candidate
     * nb : to be used the number of wellPlaced must me subtracted from this return
     */

    private static int getGoodColor(String candidate){
        String candiTemp = candidate;
        String temp = "c";
        for (int i = 0 ; i < combination.length(); i++){
            temp = String.valueOf(combination.charAt(i));
            candiTemp = candiTemp.replaceAll(temp,"");
        }
        return combination.length() - candiTemp.length();
    }
}

