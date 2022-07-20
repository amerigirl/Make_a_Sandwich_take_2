package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cheese {

    private final String americanCheddar;
    private final String provolone;
    private final String swiss;
    private final String smokedGouda;
    private final String mozzarella;
    private final String honeyGoatCheese;

    private final ArrayList<Object> finalCheeseChoice = new ArrayList<>();


    //constructor for cheese
    public Cheese(String americanCheddar, String provolone, String swiss, String smokedGouda, String mozzarella, String honeyGoatCheese){
        this.americanCheddar =americanCheddar;
        this.provolone = provolone;
        this.swiss = swiss;
        this.smokedGouda = smokedGouda;
        this.mozzarella = mozzarella;
        this.honeyGoatCheese = honeyGoatCheese;
    }



    //we need to be able to randomly choose a type of cheese

    public String pickRandomCheese(){
        final String[] cheeseChoices = {"American Cheddar", "Provolone", "Swiss", "Smoked Gouda", "Mozzarella", "Honey Goat Cheese"};
        Random randomPick = new Random();
        int index = randomPick.nextInt(cheeseChoices.length);
        finalCheeseChoice.add(index);
        System.out.println(cheeseChoices[index]);

        return cheeseChoices[index];
    }

    //cheese menu
    public void showCheeseMenu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n===========================================================================");
        System.out.println("               Cheese: The Must-Have Ingredient!                       ");
        System.out.println("===========================================================================");

        System.out.println("\n This is where your creativity can really shine! Type the letter of the cheese you just can't live without: ");
        System.out.println("\n");
        System.out.println("A. American Cheddar");
        System.out.println("B. Provolone");
        System.out.println("C. Swiss");
        System.out.println("D. Smoked Gouda");
        System.out.println("E. Mozzarella");
        System.out.println("F. Honey Goat Cheese");
        System.out.println("G. Random Choice");
        System.out.println("H. Exit");


        //conditional to cycle through the choices
        System.out.println("=======================================================================");
        System.out.println("Enter an option above to get started (one choice per sandwich): ");
        System.out.println("=======================================================================");

        char userCheeseChoice = scanner.next().toUpperCase().charAt(0);

        if (userCheeseChoice == 'A') {
            System.out.println("\n American Cheddar, the classic choice :-) \nLet's add some condiments to this!");
            finalCheeseChoice.add("American Cheddar");

        } else if (userCheeseChoice == 'B') {
            System.out.println("Provolone--such a stately choice! \nLet's add some condiments to this!");
            finalCheeseChoice.add("Provolone");

        } else if (userCheeseChoice == 'C') {
            System.out.println("Swiss, a nice and hole-y choice :) \nLet's add some condiments to this!\"");
            finalCheeseChoice.add("Swiss");

        } else if (userCheeseChoice == 'D') {
            System.out.println("Smoked Gouda--a dreamy delight! \nLet's add some condiments to this!");
            finalCheeseChoice.add("Smoked Gouda");

        } else if (userCheeseChoice == 'E') {
            System.out.println("Mozzarella--my childhood love, great choice! \nLet's add some condiments to this!");
            finalCheeseChoice.add("Mozzarella");

        } else if (userCheeseChoice == 'F') {
            System.out.println("Nothing beats honey and goat cheese! \nLet's add some condiments to this!");
            finalCheeseChoice.add("Honey Goat Cheese");

        } else if (userCheeseChoice == 'G') {

            System.out.println("Yay! You hit the jackpot with: ");
            String randomSelection = pickRandomCheese();
            System.out.println("\nLet's add some condiments to this!");
            finalCheeseChoice.add(randomSelection);
        } else {
            System.out.println("See you next time your stomach growls :)");

        }

    }

    //getter
    public ArrayList getFinalCheeseChoice() {
        return finalCheeseChoice;
    }
}
