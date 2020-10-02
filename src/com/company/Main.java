package com.company;
import java.util.Scanner;
import java.util.Random;


public class Main {






    public static void main(String[] args) {
	// write your code here
        Random randomNumber = new Random();
        int rand1 = randomNumber.nextInt(36);
        System.out.println("This is a random nr ");
        System.out.println(rand1);
        boolean isRed = true;
        boolean isGreen = true;
        int tester = 0;


      //


        Scanner Input = new Scanner(System.in); //
        System.out.println("Enter username");
        String username = Input.nextLine();
        System.out.println("Enter a guess");
        int guess = Input.nextInt();


        spinWheel(guess, rand1, isRed);
    }

    public static void spinWheel(int guess, int winningNr, boolean isRed) {
        int roulette_wheel[] = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        for (int i=0; i<=winningNr; i++) {System.out.println(roulette_wheel[i]);}
        if (guess == winningNr || isRed==true){ System.out.println("Congrats");}
        else { System.out.println("Better luck next time");}
    }

    public static boolean isRed(int isRed, ) {
        if (rand1%2==0) {isRed = false; isGreen = true;}
        else {isRed = true; isGreen = false;}
        System.out.println(isRed);
    }
}
