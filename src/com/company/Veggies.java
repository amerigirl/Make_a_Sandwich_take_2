package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Veggies {

    private final String icebergLettuce;
    private final String tomato;
    private final String spinach;
    private final String pickle;
    private final String redLeafLettuce;
    private final String onion;

    private final ArrayList<Object> finalVeggieChoices = new ArrayList<>();


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
        System.out.println("G. Random picks");
        System.out.println("H. Exit");


        //conditional to cycle through the choices
        System.out.println("=======================================================================");
        System.out.println("Enter an option(s) above to get started (5 choices max): ");
        System.out.println("=======================================================================");

        char userVeggieChoice = scanner.next().toUpperCase().charAt(0);

        if (userVeggieChoice == 'A') {
            System.out.println("\n Iceberg: the classic choice!");
            finalVeggieChoices.add("iceberg lettuce");

        } else if (userVeggieChoice == 'B') {
            System.out.println("tomato--is a sandwich really a sandwich without a tomato?");
            finalVeggieChoices.add("tomato");

        } else if (userVeggieChoice == 'C') {
            System.out.println("spinach: the new favorite sandwich addition!");
            finalVeggieChoices.add("spinach");

        } else if (userVeggieChoice == 'D') {
            System.out.println("pickles, they belong here!");
            finalVeggieChoices.add("pickle");

        } else if (userVeggieChoice == 'E'){
                System.out.println("Red leaf is my favorite. Great choice!");
                finalVeggieChoices.add("red leaf lettuce");

        } else if (userVeggieChoice == 'F') {
            System.out.println("onions, the loud inclusion :)");
            System.out.println("onion");


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

            //System.out.println(allChoices);
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
