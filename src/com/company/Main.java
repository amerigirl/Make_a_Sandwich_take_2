package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        System.out.println("\n\nWelcome to Be-Asia's 'Build a Sandwich to Remember' App-- I hope you're hungry!");

        //can we add a delay here of just a couple of seconds?
            System.out.println("Ok, let's get this yummy party started.");

        Bread sampleBread = new Bread("rye", "wholeWheat", "white", "honeyWheat", "focacia", "sourDough");
            //we need a small break here--2-3 seconds
            sampleBread.showBreadMenu();


        Cheese sampleCheese = new Cheese("americanCheddar", "provlone", "swiss", "smokedGouda", "mozzarella", "honeyGoatCheese");
            //we need a small break here--2-3 seconds
            sampleCheese.showCheeseMenu();


        Condiments sampleCondiments = new Condiments("mayo", "mustard","rance","hotSauce",  "cranberrySauce");
            //we need a small break here--2-3 seconds
            sampleCondiments.showCondimentsMenu();


        Meat sampleMeat = new Meat("veggie meat", "salami", "turkey", "ham", "pastrami", "prosciutto", "roast beef");
            //we need a small break here--2-3 seconds
            sampleMeat.showMeatsMenu();


        Veggies sampleVeggie = new Veggies("iceberg lettuce", "tomato", "spinach", "pickle", "red leaf lettuce", "onion");
            //we need a small break here--2-3 seconds
            sampleVeggie.showVeggiesMenu();


        System.out.println("\n\nOk, you've made all of your choices, now, let's put this sandwich together.  Here's your ingredient list: ");

        //build the sandwich list using string buffers(at least until you find a simpler way :-))
        StringBuffer meatString = new StringBuffer();
            for (Object s : sampleMeat.getFinalMeatChoices()) {
                meatString.append(s);
                String finalMeatString = meatString.toString();
                System.out.println("\nMeat    =  " + finalMeatString);
            }

        StringBuffer breadString = new StringBuffer();
            for (Object s : sampleBread.getFinalBreadChoice()) {
                breadString.append(s);
                String finalBreadString = breadString.toString();
                System.out.println("Bread   =  " + finalBreadString);
            }

        StringBuffer cheeseString = new StringBuffer();
            for (Object s : sampleCheese.getFinalCheeseChoice()) {
                cheeseString.append(s);
                String finalCheeseString = cheeseString.toString();
                System.out.println("Cheese  =  " + finalCheeseString);
            }

        //when the random choice is selected, the console returns the index value (?) instead of the string--boo!!!!
        StringBuffer veggieString = new StringBuffer();
            for (Object s : sampleVeggie.getFinalVeggieChoices()) {
                veggieString.append(s);
                String finalVeggieString = veggieString.toString();
                System.out.println("Veggies =  " + finalVeggieString);
            }

        StringBuffer condimentString = new StringBuffer();
            for (Object s : sampleCondiments.getFinalCondimentChoice()) {
                condimentString.append(s);
                String finalCondimentString = condimentString.toString();
                System.out.println("Condim. =  " + finalCondimentString);
            }

    }

}

//how are we going to get the user to make another sandwich?