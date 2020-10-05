package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;



public class RouletteWheel {

//import java.awt.*; gui stuff not yet implemented


    public static int rand2 = 0;
    public static String guessColour = "";
    public static String WinningColour ="";

    public void main(String [] args) {
        //int xBaselineLeft= 50; this is for not implemented gui
        //int yBaselineLeft = 20; this is gui not implemented

            //Random randomNumber = new Random();
            //int rand1 = randomNumber.nextInt(36);
        //rand2 = rand1;
            //System.out.println("This is a random nr and should not be picked besides thats cheating");
            //System.out.println(rand1);

            boolean isRed = false;
            boolean isGreen = false;
            boolean isBlack = false;
            boolean isInt = false;
            int tester = 0;
            int guess = -1;
            //Files fil = new Files();
    }

   public static void spinWheel(int guess, int winningNr) {
        int roulette_wheel[] = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        for (int i=0; i<=winningNr; i++) {System.out.println(roulette_wheel[i]);}
        if (guess == winningNr){ System.out.println("Congrats");}
        else { System.out.println("Better luck next time");}
    }

       // public static void spinWheel(boolean isRed, int guess, int winningNr) {

        //}



        public static void createFiles(String text) {
            try {
                Files.write(Paths.get("score.txt"), text.getBytes());
            }catch (IOException e) {
                e.printStackTrace();
            }
        }


    public static String colourPicker(int colourCheck) {
        String checkedColour="";
        if (colourCheck == 0) {checkedColour = "green";}
        else if (colourCheck%2==0) {checkedColour = "red";}
        else if (colourCheck%2!=0) {checkedColour = "black"; }

        return checkedColour;
    }

    }



