package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Condiments<n> {

    private String mayo;
    private String mustard;
    private String ranch;
    private String hotSauce;
    private String cranberrySauce;

    private ArrayList finalCondimentChoice = new ArrayList<>(); //does each choice HAVE to be in an arrayList, or can it be saved in a variable?


    //constructor for condiments
    public Condiments(String mayo, String mustard, String ranch, String hotSauce, String cranberrySauce){

        this.mayo = mayo;
        this.mustard = mustard;
        this.ranch = ranch;
        this.hotSauce = hotSauce;
        this.cranberrySauce = cranberrySauce;

    }


    public String pickRandomCondiments(){

        final String [] condimentChoices = {"Mayo", "Mustard", "Ranch", "Hot Sauce", "Cranberry Sauce"};
        Random randomPick = new Random();
        int index = randomPick.nextInt(condimentChoices.length);
        finalCondimentChoice.add(index); //user doesn't see this.  Adds final choice to the arrayList for building the sandwich

        System.out.println(condimentChoices[index]);

        return condimentChoices[index];
    }


    public void showCondimentsMenu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n===========================================================================");
        System.out.println("               Condiments: Rounding out every great sandwich!             ");
        System.out.println("===============================================================================");

        System.out.println("\n Let's add some sweet extras to our sandwich, shall we? Type the letter of the condiment(s) you just can't live without: ");
        System.out.println("\n");
        System.out.println("A. Mayo");
        System.out.println("B. Mustard");
        System.out.println("C. Ranch");
        System.out.println("D. hot sauce");
        System.out.println("E. cranberry sauce");
        System.out.println("F. Random Choice");
        System.out.println("G. Exit");


        //conditional to cycle through the choices
        System.out.println("=======================================================================");
        System.out.println("Enter an option above to get started (up to 3 choices): ");
        System.out.println("=======================================================================");

        char userCheeseChoice = scanner.next().toUpperCase().charAt(0);

        if (userCheeseChoice == 'A') {
            System.out.println("\n You've got mayo!");
            finalCondimentChoice.add("Mayo");

        } else if (userCheeseChoice == 'B') {
            System.out.println("You've got mustard!");
            finalCondimentChoice.add("Mustard");

        } else if (userCheeseChoice == 'C') {
            System.out.println("you've got ranch!");
            finalCondimentChoice.add("Ranch");

        } else if (userCheeseChoice == 'D') {
            System.out.println("You've got hot sauce!");
            finalCondimentChoice.add("hot sauce");

        } else if (userCheeseChoice == 'E') {
            System.out.println("You've got cranberry sauce");
            finalCondimentChoice.add("Cranberry sauce");

        } else if (userCheeseChoice == 'F') {

            String randomSelection = "";
            String randomSelection2= "";
            String randomSelection3 = "";
            System.out.println("Yay! You hit the jackpot with: " + "\n");

            //how do I stop the random selection from repeating?? (change in the randomCondiments method)
            randomSelection = pickRandomCondiments();
            randomSelection2 = pickRandomCondiments();
            randomSelection3 = pickRandomCondiments();

            String allChoices = randomSelection + "," + randomSelection2 + ", and " + randomSelection3; //this creates one field (instead of 3) so the choice is added to an arrayList

            finalCondimentChoice.add(allChoices);

            System.out.println(allChoices);
        } else {
            System.out.println("See you next time your stomach growls :)");

        }


    }

    public String getMayo() {
        return mayo;
    }

    public String getMustard() {
        return mustard;
    }

    public String getRanch() {
        return ranch;
    }

    public String getHotSauce() {
        return hotSauce;
    }

    public String getCranberrySauce() {
        return cranberrySauce;
    }

    public ArrayList getFinalCondimentChoice() {
        return finalCondimentChoice;
    }
}
