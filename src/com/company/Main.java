package com.company;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.awt.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        boolean isRed = false;
        boolean isGreen = false;
        boolean isBlack = false;
        boolean isInt = false;
        int tester = 0;
        int guess = -1;
        int rand2 = 0;
        String guessColour = "";
        String WinningColour ="";

        Random randomNumber = new Random();
        int rand1 = randomNumber.nextInt(36);
        rand2 = rand1;
        System.out.println("This is a random nr and should not be picked besides thats cheating");
        System.out.println(rand1);



        RouletteWheel R1= new RouletteWheel();
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter username");
        String username = Input.nextLine();


        do {
            System.out.println("Enter a guess, number 0-36");
            if(Input.hasNextInt()) { guess = Input.nextInt(); if (guess<=36 && guess >0 || guess ==0 ) {isInt = true;}
            } else {Input.nextLine();}
        } while(!isInt);

        RouletteWheel.spinWheel(guess, rand2);
        System.out.println(RouletteWheel.colourPicker(guess));
        System.out.println(RouletteWheel.colourPicker(rand2));

        //creates a texfile
        RouletteWheel.createFiles(username +" " + guess + "  " +rand2);

       /* spinWheel(guess, rand1);
        System.out.println(colourPicker(guess));
        System.out.println(colourPicker(rand1)); */
    }

}
