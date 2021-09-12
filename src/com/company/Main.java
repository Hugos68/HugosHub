package com.company;

import java.util.*;

public class Main {
    public static final Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        alpha alphaObject = new alpha();
        beta betaObject = new beta();
        boolean programChosen = false;
        while (!programChosen) {
            for (int m=0; m<25; m++) {
                System.out.print("- ");
            }
            System.out.println();
            for (int m=0; m<25; m++) {
                System.out.print("- ");
            }
            System.out.println();
            System.out.println("Welcome to Hugo's Hub!");
            System.out.println("Please choose a program you want to launch.");
            System.out.println("A: Guess the number!");
            System.out.println("B: Hangman!");
            System.out.println("C: Password Strength Validator");
            System.out.println("D: n/a");
            for (int m=0; m<25; m++) {
                System.out.print("- ");
            }
            System.out.println();
            for (int m=0; m<25; m++) {
                System.out.print("- ");
            }
            System.out.println();

            System.out.println("Your answer:");
            String programChoice = read.nextLine();
            System.out.println();
            if (programChoice.matches("A") || programChoice.matches("a")) {
                alphaObject.guessTheNumber();
            }
            if (programChoice.matches("B") || programChoice.matches("b")) {
                betaObject.hangman();
            }
        }
    }
}