package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Meat {

    private final String veggieMeat;
    private final String salami;
    private final String turkey;
    private final String ham;
    private final String pastrami;
    private final String prosciutto;
    private final String roastBeef;

    private final ArrayList<Object> finalMeatChoices = new ArrayList<>();


    //constructor for Meat

    Meat(String veggieMeat, String salami, String turkey, String ham, String pastrami, String prosciutto, String roastBeef){
        this. veggieMeat = veggieMeat;
        this.salami = salami;
        this.turkey = turkey;
        this.ham = ham;
        this.pastrami = pastrami;
        this.prosciutto = prosciutto;
        this.roastBeef = roastBeef;
    }

    //random choice of meat
    public String pickRandomMeats(){

        final String [] meatChoices = {"veggieMeat", "salami", "turkey", "ham", "pastrami", "prosciutto", "roastBeef"};
        Random randomPick = new Random();
        int index = randomPick.nextInt(meatChoices.length);
        finalMeatChoices.add(index); //user doesn't see this.  Adds final choice to the arrayList for building the sandwich
        System.out.println(meatChoices[index]);

        return meatChoices[index];

    }

    //Meat menu and user choice
    public void showMeatsMenu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n===========================================================================");
        System.out.println("               Meat: The HEART of any sandwich!             ");
        System.out.println("===============================================================================");

        System.out.println("\n Let's add some protein to our sandwich, shall we? Type the letter of the meat(s) you just can't live without: ");
        System.out.println("\n");
        System.out.println("A. Veggie Meat");
        System.out.println("B. Salami");
        System.out.println("C. Turkey");
        System.out.println("D. Ham");
        System.out.println("E. Pastrami");
        System.out.println("F. Prosciutto");
        System.out.println("G. Roast Beef");
        System.out.println("H. Random Choice");
        System.out.println("I. Exit");


        //conditional to cycle through the choices
        System.out.println("=======================================================================");
        System.out.println("Enter an option above to get started (2 choices max): ");
        System.out.println("=======================================================================");

        char userMeatChoice = scanner.next().toUpperCase().charAt(0);

        if (userMeatChoice == 'A') {
            System.out.println("\n Clean protein!");
            finalMeatChoices.add("Veggie Meat");

        } else if (userMeatChoice == 'B') {
            System.out.println("You've got Salami!");
            finalMeatChoices.add("Salami");

        } else if (userMeatChoice == 'C') {
            System.out.println("Turkey is in the sandwich!");
            finalMeatChoices.add("Turkey");

        } else if (userMeatChoice == 'D') {
            System.out.println("Ham, a classic choice!");
            finalMeatChoices.add("ham");

        } else if (userMeatChoice == 'E') {
            System.out.println("Pastrami--pairs well with turkey :)");
            finalMeatChoices.add("Pastrami");

        } else if (userMeatChoice == 'F') {
            System.out.println("Prosciutto...you can't always spell it right, but you know EXACTLY how it tastes!");
            finalMeatChoices.add("Prosciutto");

        } else if (userMeatChoice == 'G') {
            System.out.println("Roast Beef is always a safe choice :)");
            finalMeatChoices.add("Roast Beef");

        } else if (userMeatChoice == 'H') {

            String randomSelection = "";
            String randomSelection2= "";

            System.out.println("Yay! You hit the jackpot with: " + "\n");



            randomSelection = pickRandomMeats();
            randomSelection2 = pickRandomMeats();


            String allChoices = randomSelection + ", and " + randomSelection2;  //this creates one field (instead of 3) so the choice is added to an arrayList
            finalMeatChoices.add(allChoices);

            //System.out.println(allChoices);
        } else {
            System.out.println("See you next time your stomach growls :)");

        }

    }

    //getter
    public ArrayList getFinalMeatChoices() {
        return finalMeatChoices;
    }

}
