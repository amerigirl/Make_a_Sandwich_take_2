package com.company;

import java.util.Random;
import java.util.Scanner;


public class Bread {

    private String rye;
    private String wholeWheat;
    private String white;
    private String honeyWheat;
    private String focaccia;
    private String sourDough;
    private String randomChoice;

    //constructor for bread

    public Bread(String rye, String wholeWheat, String white, String honeyWheat, String focaccia, String sourDough){
        this.rye = rye;
        this.wholeWheat = wholeWheat;
        this.white = white;
        this.honeyWheat = honeyWheat;
        this.focaccia = focaccia;
        this.sourDough = sourDough;

//  this.randomChoice = pickRandomBread();--didn't need to add it to the constructor; just call an instance of the class
    }

    //we need to be able to choose from a list--create a list for the user to see (then add all the choices into an array or something)

    public void showMenu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n===========================================================================");
        System.out.println("               Let's Make A Sandwich Together                         ");
        System.out.println("===========================================================================");

        System.out.println("\n Hello and welcome to McKerracher's Kitchen! Now, let's make a sandwich :)" +
                "\n We'll start by having you choose your type of bread. Type the letter of the bread you'd like: ");
        System.out.println("\n");
        System.out.println("A. Rye");
        System.out.println("B. Whole Wheat");
        System.out.println("C. White");
        System.out.println("D. Honey Wheat");
        System.out.println("E. Focaccia");
        System.out.println("F. SourDough");
        System.out.println("G. Random Choice");
        System.out.println("H. Exit");

        //conditional to cycle through the choices

        System.out.println("======================================================");
        System.out.println("Enter an option above to get started: ");
        System.out.println("======================================================");

        char userChoice = scanner.next().toUpperCase().charAt(0);

        if (userChoice == 'A') {
            System.out.println("\nGreat, Rye is one of my favs :-) \nLet's add some protein to this!");
        } else if (userChoice == 'B') {
            System.out.println("Whole wheat, a nice healthy choice! \nLet's add some protein to this!");
        } else if (userChoice == 'C') {
            System.out.println("White--a classically awesome choice! \nLet's add some protein to this!\"");
        } else if (userChoice == 'D') {
            System.out.println("Honey wheat, such a sweet and healthy treat! \nLet's add some protein to this!");
        } else if (userChoice == 'E') {
            System.out.println("Focaccia--so fancy! \nLet's add some protein to this!");
        } else if (userChoice == 'F') {
            System.out.println("SourDough is one of my favs! \nLet's add some protein to this!");
        } else if (userChoice == 'G') {
            pickRandomBread();
            System.out.println("\nLet's add some protein to this!");
        } else {
            System.out.println("See you next time your stomach growls :)");
        }

    }


    //we need to be able to randomly choose a type of bread--random generator
    public String pickRandomBread(){
        final String[] breadChoices = {"Rye", "Whole Wheat", "White", "Honey Wheat", "Focaccia", "SourDough"};
        Random randomPick = new Random();
        int index = randomPick.nextInt(breadChoices.length);
        System.out.println(breadChoices[index]);

        return String.valueOf(index);
    }




    //is there a way to call a list and then have people choose as well with the randomizer?
}
