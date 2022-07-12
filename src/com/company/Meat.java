package com.company;

public class Meat {

    String veggieMeat;
    String salami;
    String turkey;
    String ham;
    String pastrami;
    String prosciutto;
    String roastBeef;


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


    //we need to be able to randomly choose a type of meat
    //we also need to be able to choose from a list
    //is there a way to call a list and then have people choose as well with the randomizer?
}
