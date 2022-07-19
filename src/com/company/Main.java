package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//Bread sampleBread = new Bread("rye", "wholeWheat", "white", "honeyWheat", "focacia", "sourDough");
//Cheese sampleCheese = new Cheese("americanCheddar", "provlone", "swiss", "smokedGouda", "mozzarella", "honeyGoatCheese");
//Condiments sampleRandom = new Condiments("mayo", "mustard","rance","hotSauce",  "cranberrySauce");
//Meat sampleMeat = new Meat("veggie meat", "salami", "turkey", "ham", "pastrami", "prosciutto", "roast beef");
Veggies sampleVeggie = new Veggies("iceberg lettuce", "tomato", "spinach", "pickle", "red leaf lettuce", "onion");

sampleVeggie.showVeggiesMenu();
//sampleMeat.showMeatsMenu();
//sampleBread.showBreadMenu();
//sampleCheese.showCheeseMenu();
//sampleRandom.showCondimentsMenu();
    }
}

//we want to be able to call either a sandwich method that builds the sandwich with the user's help, or a main menu that lets the user cycle through the parts of making a sandwich