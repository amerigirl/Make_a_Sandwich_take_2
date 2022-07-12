package com.company;

import java.util.Random;


public class Bread {

    private String rye;
    private String wholeWheat;
    private String white;
    private String honeyWheat;
    private String focaccia;
    private String sourDough;
    private String randomChoice;

    //constructor for bread

    public Bread(String rye, String wholeWheat, String white, String honeyWheat, String focaccia, String sourDough){
        this.rye = rye;
        this.wholeWheat = wholeWheat;
        this.white = white;
        this.honeyWheat = honeyWheat;
        this.focaccia = focaccia;
        this.sourDough = sourDough;

//        this.randomChoice = pickRandomBread();--didn't need to add it to the constructor; just call an instance of the class
    }

    //we need to be able to choose from a list--create a list for the user to see


    //we need to be able to randomly choose a type of bread--random generator
    public String pickRandomBread(){
        final String[] breadChoices = {"Rye", "WholeWheat", "White", "Honey Wheat", "Focaccia", "SourDough"};
        Random randomPick = new Random();
        int index = randomPick.nextInt(breadChoices.length);
        System.out.println(breadChoices[index]);

        return new String(String.valueOf(index));
    }




    //is there a way to call a list and then have people choose as well with the randomizer?
}
