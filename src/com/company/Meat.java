package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Meat {

    private String veggieMeat;
    private String salami;
    private String turkey;
    private String ham;
    private String pastrami;
    private String prosciutto;
    private String roastBeef;

    private ArrayList finalMeatChoices = new ArrayList<>();


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


    public String pickRandomMeats(){

        final String [] meatChoices = {"veggieMeat", "salami", "turkey", "ham", "pastrami", "prosciutto", "roastBeef"};
        Random randomPick = new Random();
        int index = randomPick.nextInt(meatChoices.length);
        finalMeatChoices.add(index); //user doesn't see this.  Adds final choice to the arrayList for building the sandwich

        System.out.println(meatChoices[index]);

        return meatChoices[index];
    }

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
            finalMeatChoices.add("VeggieMeat");

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
            finalMeatChoices.add("roastBeef");

        } else if (userMeatChoice == 'H') {

            String randomSelection = "";
            String randomSelection2= "";

            System.out.println("Yay! You hit the jackpot with: " + "\n");

            //how do I stop the random selection from repeating?? (change in the randomCondiments method)
            randomSelection = pickRandomMeats();
            randomSelection2 = pickRandomMeats();


            String allChoices = randomSelection + ", and " + randomSelection2;  //this creates one field (instead of 3) so the choice is added to an arrayList
            finalMeatChoices.add(allChoices);

            //System.out.println(allChoices);
        } else {
            System.out.println("See you next time your stomach growls :)");

        }


    }


    public String getVeggieMeat() {
        return veggieMeat;
    }

    public String getSalami() {
        return salami;
    }

    public String getTurkey() {
        return turkey;
    }

    public String getHam() {
        return ham;
    }

    public String getPastrami() {
        return pastrami;
    }

    public String getProsciutto() {
        return prosciutto;
    }

    public String getRoastBeef() {
        return roastBeef;
    }

    public ArrayList getFinalMeatChoices() {
        return finalMeatChoices;
    }

    //we need to be able to randomly choose a type of meat
    //we also need to be able to choose from a list
    //is there a way to call a list and then have people choose as well with the randomizer?
}
