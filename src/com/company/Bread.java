package com.company;

import java.util.Random;
import java.util.Scanner;


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

    //we need to be able to choose from a list--create a list for the user to see (then add all the choices into an array or something)

    public void showMenu(){
    char option = '\0';

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nHello and welcome to McKerracher's Kitchen. Now, let's make a sandwich :)" +
                "\n1. Choose your type of bread: ");
        System.out.println("\n");
        System.out.println("A. Rye");
        System.out.println("B. Whole Wheat");
        System.out.println("C. White");
        System.out.println("D. Honey Wheat");
        System.out.println("E. Focaccia");
        System.out.println("F. SourDough");
        System.out.println("G. Random Choice");





    }


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
