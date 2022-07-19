package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Condiments<n> {

    String mayo;
    String mustard;
    String ranch;
    String hotSauce;
    String cranberrySauce;

    ArrayList finalCondimentChoice = new ArrayList<>();


    //constructor for condiments
    public Condiments(String mayo, String mustard, String ranch, String hotSauce, String cranberrySauce){

        this.mayo = mayo;
        this.mustard = mustard;
        this.ranch = ranch;
        this.hotSauce = hotSauce;
        this.cranberrySauce = cranberrySauce;

    }


    //we need to be able to randomly choose 3 condiments
    //we need a way to let users pick more than one in this case, right?  What about other cases?

    public String pickRandomCondiments(){

        final String [] condimentChoices = {"Mayo", "Mustard", "Ranch", "Hot Sauce", "Cranberry Sauce"};
        Random random = new Random();
        int n = 0;
        int e = 0;

        n = random.nextInt(condimentChoices.length - 2 + 1) + 2;

        for (int i = 0; i < n; n++) {
            e = random.nextInt(condimentChoices.length);
            System.out.println("Random string selected: " + condimentChoices[e]);
        }
        return condimentChoices[e];
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
            System.out.println("Yay! You hit the jackpot with: ");
            String randomSelection = pickRandomCondiments();
            finalCondimentChoice.add(randomSelection);

        } else {
            System.out.println("See you next time your stomach growls :)");

        }

    }

}
