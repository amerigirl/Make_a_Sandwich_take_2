package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Veggies {

    private String icebergLettuce;
    private String tomato;
    private String spinach;
    private String pickle;
    private String redLeafLettuce;
    private String onion;

    private ArrayList finalVeggieChoices = new ArrayList<>();


    //constructor for Veggies

    public Veggies(String icebergLettuce, String tomato, String spinach, String pickle, String redLeafLettuce, String onion) {
        this.icebergLettuce = icebergLettuce;
        this.tomato = tomato;
        this.spinach = spinach;
        this.pickle = pickle;
        this.redLeafLettuce = redLeafLettuce;
        this.onion = onion;

    }

    public String pickRandomVeggies() {
    final String[] veggieChoices = {"iceberg lettuce", "tomato", "spinach", "pickle", "red leaf lettuce", "onion"};
    Random randomPick = new Random();
    int index = randomPick.nextInt(veggieChoices.length);
        finalVeggieChoices.add(index); //user doesn't see this.  Adds final choice to the arrayList for building the sandwich
        System.out.println(veggieChoices[index]);

        return veggieChoices[index];

}

    public void showVeggiesMenu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n===========================================================================");
        System.out.println("               Veggies: The icing on a sandwich cake!             ");
        System.out.println("===============================================================================");

        System.out.println("\n We will wrap up our sandwich by choosing veggies. Type the letter of the veggies(s) you just can't live without: ");
        System.out.println("\n");
        System.out.println("A. iceberg lettuce");
        System.out.println("B. tomato");
        System.out.println("C. spinach");
        System.out.println("D. pickle");
        System.out.println("E. red leaf lettuce");
        System.out.println("F. onion");
        System.out.println("G. Exit");


        //conditional to cycle through the choices
        System.out.println("=======================================================================");
        System.out.println("Enter an option(s) above to get started (5 choices max): ");
        System.out.println("=======================================================================");

        char userVeggieChoice = scanner.next().toUpperCase().charAt(0);

        if (userVeggieChoice == 'A') {
            System.out.println("\n Clean protein!");
            finalVeggieChoices.add("VeggieMeat");

        } else if (userVeggieChoice == 'B') {
            System.out.println("You've got Salami!");
            finalVeggieChoices.add("Salami");

        } else if (userVeggieChoice == 'C') {
            System.out.println("Turkey is in the sandwich!");
            finalVeggieChoices.add("Turkey");

        } else if (userVeggieChoice == 'D') {
            System.out.println("Ham, a classic choice!");
            finalVeggieChoices.add("ham");

        } else if (userVeggieChoice == 'E') {


        } else if (userVeggieChoice == 'F') {
            System.out.println("Roast Beef is always a safe choice :)");
            finalVeggieChoices.add("roastBeef");

        } else if (userVeggieChoice == 'G') {

            String randomSelection = "";
            String randomSelection2 = "";
            String randomSelection3 = "";
            String randomSelection4 = "";
            String randomSelection5 = "";

            System.out.println("Yay! You hit the jackpot with: " + "\n");

            randomSelection = pickRandomVeggies();
            randomSelection2 = pickRandomVeggies();
            randomSelection3 = pickRandomVeggies();
            randomSelection4 = pickRandomVeggies();
            randomSelection5 = pickRandomVeggies();

            String allChoices = randomSelection + "," + randomSelection2 + "," + randomSelection3 +  "," + randomSelection4 + ", and " + randomSelection5;  //this creates one field (instead of 3) so the choice is added to an arrayList
            finalVeggieChoices.add(allChoices);

            System.out.println(allChoices);
        } else {
            System.out.println("See you next time your stomach growls :)");

        }


    }



    public String getIcebergLettuce() {
        return icebergLettuce;
    }

    public String getTomato() {
        return tomato;
    }

    public String getSpinach() {
        return spinach;
    }

    public String getPickle() {
        return pickle;
    }

    public String getRedLeafLettuce() {
        return redLeafLettuce;
    }

    public String getOnion() {
        return onion;
    }

    public ArrayList getFinalVeggieChoices() {
        return finalVeggieChoices;
    }




}
