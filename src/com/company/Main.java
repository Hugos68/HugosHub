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
            System.out.println("\nWelcome to Hugo's Hub!\n");
            System.out.println("Please choose a program you want to launch:");
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
            System.out.println("\nYour answer:\n");
            String programChoice = read.nextLine();
            if (programChoice.matches("A") || programChoice.matches("a")) {
                programChosen=true;
                alphaObject.guessTheNumber();
            }
            if (programChoice.matches("B") || programChoice.matches("b")) {
                programChosen=true;
                betaObject.hangman();
            }
            else {
                System.out.println("Please pick one of the listed programs");
            }
        }
    }
}