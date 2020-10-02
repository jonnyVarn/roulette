package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


public class Main {

public static int rand2 = 0;




    public static void main(String[] args) {
        Random randomNumber = new Random();
        int rand1 = randomNumber.nextInt(36);
        rand2 = rand1;
        System.out.println("This is a random nr and should not be picked besides thats cheating");
        System.out.println(rand1);
        boolean isRed = false;
        boolean isGreen = false;
        int tester = 0;
        int guess = -1;



        Scanner Input = new Scanner(System.in);
        System.out.println("Enter username");
        String username = Input.nextLine();

            System.out.println("Enter a guess, number 0-36");

                try { guess = Input.nextInt(); }
                catch (java.util.InputMismatchException error) { System.out.println("That is not a number 0-36");}



        spinWheel(guess, rand1, isRed);
    }

    public static void spinWheel(int guess, int winningNr, boolean isRed) {
        int roulette_wheel[] = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        for (int i=0; i<=winningNr; i++) {System.out.println(roulette_wheel[i]);}
        if (guess == winningNr || isRed==true){ System.out.println("Congrats");}
        else { System.out.println("Better luck next time");}
    }

    public static boolean isRed(boolean isRed,boolean isGreen ) {
        if (rand2%2==0) {isRed = false; isGreen = true;}
        else {isRed = true; isGreen = false;}
        System.out.println("isRed " +isRed + isGreen);
        return isRed;
    }
}
