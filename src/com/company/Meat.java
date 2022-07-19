package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

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
