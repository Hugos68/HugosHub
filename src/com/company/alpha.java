package com.company;

import java.util.Random;
import java.util.Scanner;

public class alpha {
    public static Scanner read = new Scanner(System.in);
    public void guessTheNumber() {
        extra1 extraObject = new extra1();
        System.out.println("Welcome to Guess The Number!");
        int turns = 1;
        boolean correctNumberChosen = false;
        while (!correctNumberChosen) {
            Random random = new Random();
            System.out.println();
            System.out.println("In what range would you like your number to be in?" );
            System.out.println("Your answer:");
            String userRange = read.nextLine();
            if (userRange.matches("[0-9]+")) {
                correctNumberChosen=true;
                int x = Integer.parseInt(userRange);
                int correctNumber = random.nextInt(x) + 1;
                System.out.println("We chose a number between 0 and " + userRange);
                boolean gameWon=false;
                while (!gameWon) {
                    System.out.println("\n****** Round: "+turns+" ******\n");
                    turns++;
                    System.out.println("Enter a value:");
                    String stringUserGuess = read.nextLine();
                    int userGuess = Integer.parseInt(stringUserGuess);
                    if (userGuess < correctNumber) {
                        System.out.println("Incorrect! You need to guess higher!");
                    }
                    if (userGuess > correctNumber) {
                        System.out.println("Incorrect! You need to guess lower!");
                    }
                    if (userGuess == correctNumber) {
                        gameWon=true;
                        System.out.println("\nCongratulations! You guessed the number!");
                        System.out.println("\nIt took you " + turns + " turn(s)\n");
                        extraObject.pressAnyKeyToContinue();
                        System.exit (1);
                    }
                }
            }
            else {
                System.out.println("Please choose a valid number");
            }
        }
    }
}
