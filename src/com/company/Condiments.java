package com.company;

import java.util.Random;

public class Condiments<n> {

    String mayo;
    String mustard;
    String ranch;
    String hotSauce;
    String cranberrySauce;


    //constructor for condiments
    public Condiments(String mayo, String mustard, String ranch, String hotSauce, String cranberrySauce){

        this.mayo = mayo;
        this.mustard = mustard;
        this.ranch = ranch;
        this.hotSauce = hotSauce;
        this.cranberrySauce = cranberrySauce;

    }


    //we need to be able to randomly choose 3 condiments
    //we need a way to let users pick more than one in this case, right?  What about other cases?

    public String pickRandomCondiments(){

        final String [] condimentChoices = {"Mayo", "Mustard", "Ranch", "Hot Sauce", "Cranberry Sauce"};
        Random random = new Random();
        int n = 0;
        int e = 0;

        n = random.nextInt(condimentChoices.length - 2 + 1) + 2;

        for (int i = 0; i < n; n++) {
            e = random.nextInt(condimentChoices.length);
            System.out.println("Random string selected: " + condimentChoices[e]);
        }
        return condimentChoices[e];
    }

    //we also need to be able to choose from a list


    //is there a way to call a list and then have people choose as well with the randomizer?
}
