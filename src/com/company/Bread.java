package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Bread {

    private String rye;
    private String wholeWheat;
    private String white;
    private String honeyWheat;
    private String focaccia;
    private String sourDough;

    private ArrayList finalBreadChoice = new ArrayList<>(); //this might have to be in it's own class so ALL the classes have access to add something to it.


    //constructor for bread
    public Bread(String rye, String wholeWheat, String white, String honeyWheat, String focaccia, String sourDough){
        this.rye = rye;
        this.wholeWheat = wholeWheat;
        this.white = white;
        this.honeyWheat = honeyWheat;
        this.focaccia = focaccia;
        this.sourDough = sourDough;

    }

    //we need to be able to randomly choose a type of bread--random generator
    public String pickRandomBread(){
        final String[] breadChoices = {"Rye", "Whole Wheat", "White", "Honey Wheat", "Focaccia", "SourDough"};
        Random randomPick = new Random();
        int index = randomPick.nextInt(breadChoices.length);
        finalBreadChoice.add(index);
        System.out.println(breadChoices[index]);

        return breadChoices[index];
    }


    //create a list for the user to see (then add all the choices into an array or something)
    public void showBreadMenu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n===========================================================================");
        System.out.println("               Bread: The Choice That Matters Most                        ");
        System.out.println("===============================================================================");

        System.out.println("\n Sure, meat tends to be king in a sandwich, but really, bread is the star of the show!" +
                "\n Type the letter of the bread you'd like: ");
        System.out.println("\n");
        System.out.println("A. Rye");
        System.out.println("B. Whole Wheat");
        System.out.println("C. White");
        System.out.println("D. Honey Wheat");
        System.out.println("E. Focaccia");
        System.out.println("F. SourDough");
        System.out.println("G. Random Choice");
        System.out.println("H. Exit");


        //conditional to cycle through the choices--only one choice per sandwich
        System.out.println("=======================================================================");
        System.out.println("Enter an option above to get started (one choice per sandwich): ");
        System.out.println("=======================================================================");

        char userBreadChoice = scanner.next().toUpperCase().charAt(0);

        if (userBreadChoice == 'A') {
            System.out.println("\nGreat, Rye is one of my favs :-) \nLet's add some cheese to this!");
            finalBreadChoice.add("Rye");

        } else if (userBreadChoice == 'B') {
            System.out.println("Whole wheat, a nice healthy choice! \nLet's add some cheese to this!");
            finalBreadChoice.add("Whole Wheat");

        } else if (userBreadChoice == 'C') {
            System.out.println("White--a classically awesome choice! \nLet's add some cheese to this!\"");
            finalBreadChoice.add("White");

        } else if (userBreadChoice == 'D') {
            System.out.println("Honey wheat, such a sweet and healthy treat! \nLet's add some cheese to this!");
            finalBreadChoice.add("Honey Wheat");

        } else if (userBreadChoice == 'E') {
            System.out.println("Focaccia--so fancy! \nLet's add some cheese to this!");
            finalBreadChoice.add("Focaccia");

        } else if (userBreadChoice == 'F') {
            System.out.println("SourDough is one of my favs! \nLet's add some cheese to this!");
            finalBreadChoice.add("SourDough");

        } else if (userBreadChoice == 'G') {

            System.out.println("Yay! You hit the jackpot with: ");
            String randomSelection = pickRandomBread();
            System.out.println("\nLet's add some cheese to this!");
            finalBreadChoice.add(randomSelection);
        } else {
            System.out.println("See you next time your stomach growls :)");

        }
            //System.out.println(finalBreadChoice); so, it's printing the index AND the random selection for G---is this ok? (probably not)
    }

    public ArrayList getFinalBreadChoice() {
        return finalBreadChoice;
    }
}
