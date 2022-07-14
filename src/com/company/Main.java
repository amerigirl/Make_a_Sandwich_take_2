package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

Bread sampleBread = new Bread("rye", "wholeWheat", "white", "honeyWheat", "focacia", "sourDough");
Cheese sampleCheese = new Cheese("americanCheddar", "provlone", "swiss", "smokedGouda", "mozzarella", "honeyGoatCheese");

sampleBread.showBreadMenu();
sampleCheese.showCheeseMenu();

    }
}

//we want to be able to call either a sandwich method that builds the sandwich with the user's help, or a main menu that lets the user cycle through the parts of making a sandwich