package com.company;

import java.util.Random;

public class Condiments {

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
    final String [] condimentChoices = {"Mayo", "Mustard", "Ranch", "Hot Sauce", "Cranberry Sauce"};
    Random random = new Random();
    int n = 0;
    int e = 0;



    String [] arr = {"A", "B", "C", "D"};

    Random random = new Random();
    int n = 0;
    int e = 0;

//A random integer that is greater than 1 but not larger than arr.length
    n = random.nextInt(arr.length - 2 + 1) + 2;

//loops n times selecting a random element from arr each time it does
for(int i = 0; i < n; n++){
        e = random.nextInt(arr.length);
        System.out.println("Random String selected: " + arr[e]);
    }

    //we also need to be able to choose from a list
    //is there a way to call a list and then have people choose as well with the randomizer?
}
