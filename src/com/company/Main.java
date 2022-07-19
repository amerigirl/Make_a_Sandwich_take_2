package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("\n\nWelcome to Be-Asia's 'Build a Sandwich to Remember' App-- I hope you're hungry!"); part of the app?

        //can we add a delay here of just a couple of seconds?

        System.out.println("Ok, let's get this yummy party started.");
        Bread sampleBread = new Bread("rye", "wholeWheat", "white", "honeyWheat", "focacia", "sourDough");
        //we need a small break here--2-3 seconds
        sampleBread.showBreadMenu();

        Cheese sampleCheese = new Cheese("americanCheddar", "provlone", "swiss", "smokedGouda", "mozzarella", "honeyGoatCheese");
        //we need a small break here--2-3 seconds
        sampleCheese.showCheeseMenu();

        Condiments sampleRandom = new Condiments("mayo", "mustard","rance","hotSauce",  "cranberrySauce");
        //we need a small break here--2-3 seconds
        sampleRandom.showCondimentsMenu();

        Meat sampleMeat = new Meat("veggie meat", "salami", "turkey", "ham", "pastrami", "prosciutto", "roast beef");
        //we need a small break here--2-3 seconds
        sampleMeat.showMeatsMenu();


        Veggies sampleVeggie = new Veggies("iceberg lettuce", "tomato", "spinach", "pickle", "red leaf lettuce", "onion");
        //we need a small break here--2-3 seconds
        sampleVeggie.showVeggiesMenu();

        System.out.println("Ok, you've made all of your choices, now, let's put this sandwich together.  Here's your ingredient list: ");
    }
}

//we want to be able to call either a sandwich method that builds the sandwich with the user's help, or a main menu that lets the user cycle through the parts of making a sandwich