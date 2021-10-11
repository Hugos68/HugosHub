package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class beta {
    extra1 extra1 = new extra1();
    Scanner read = new Scanner(System.in);
    public void hangmanGame() {
        ArrayList<Character> wordDissected = new ArrayList<>();
        ArrayList<Character> wordBeingGuessed = new ArrayList<>();
        ArrayList<Character> userGuess = new ArrayList<>();
        ArrayList<Character> charsGuessed = new ArrayList<>();

        //converting chosenWord into char array and creating empty char array
        String chosenWord = chooseWord();
        int wordLength = chosenWord.length() - 1;
        for (int i = 0; i <= wordLength; i++) {
            wordDissected.add(chosenWord.charAt(i));
        }
        for (int i = 0; i <= wordLength; i++) {
            wordBeingGuessed.add('_');
        }

        //start guessing
        int turns = 0;
        int mistakes = 0;
        boolean gameWon = false;
        while (!gameWon) {
            turns++;
            System.out.println("\n****** Round: " + turns + " ******\n");
            System.out.println(arrayToString(wordBeingGuessed));
            System.out.println("\nMake your guess:\n");
            userGuess.clear();
            String stringUserGuess = read.nextLine();
            userGuess.add(stringUserGuess.charAt(0));
            String stringCharsGuessed = arrayToString(charsGuessed);
            String stringWordDissected = arrayToString(wordDissected);

            if (stringCharsGuessed.contains(stringUserGuess)) {
                System.out.println("You already guessed this letter");
                turns--;
            }
            else if (!stringCharsGuessed.contains(stringUserGuess)) {
                charsGuessed.add(userGuess.get(0));
                for (int i = 0; i <= wordLength; i++) {
                    if (userGuess.get(0) == wordDissected.get(i)) {
                        replaceCharacter(i, wordBeingGuessed, wordDissected);
                    }
                }
            }
            else if (!stringUserGuess.contains(stringWordDissected) && !stringCharsGuessed.contains(stringUserGuess)) {
                mistakes++;
            }
            if (wordBeingGuessed.equals(wordDissected)) {
                gameWon=true;
                System.out.println("\nCongratulations!\n\nYou guessed the word!\n\nIt took you "+turns+ " turns\n");
                extra1.pressAnyKeyToContinue();
                System.exit (1);
            }
            switch(mistakes) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:
                    System.out.println("\nOh no, he's dead!\n\nThe word was: "+chosenWord+"\n");
                    extra1.pressAnyKeyToContinue();
                    System.exit(1);
            }
        }
    }

    public String chooseWord() {
        int random = (int) (Math.random() * (9));
        //difficulty 1
        String[] diff1;
        diff1 = new String[9];
        diff1[0] = ("cat");
        diff1[1] = ("dog");
        diff1[2] = ("pen");
        diff1[3] = ("map");
        diff1[4] = ("cup");
        diff1[5] = ("tan");
        diff1[6] = ("joy");
        diff1[7] = ("cap");
        diff1[8] = ("tub");
        //difficulty 2
        String[] diff2;
        diff2 = new String[9];
        diff2[0] = ("number");
        diff2[1] = ("sting");
        diff2[2] = ("koala");
        diff2[3] = ("ethical");
        diff2[4] = ("lecture");
        diff2[5] = ("tension");
        diff2[6] = ("school");
        diff2[7] = ("mansion");
        diff2[8] = ("friendly");
        //difficulty 3
        String[] diff3;
        diff3 = new String[9];
        diff3[0] = ("tranquility");
        diff3[1] = ("abomination");
        diff3[2] = ("unfortunate");
        diff3[3] = ("presentation");
        diff3[4] = ("prescription");
        diff3[5] = ("vaccination");
        diff3[6] = ("enlightening");
        diff3[7] = ("submission");
        diff3[8] = ("alcoholic");
        String chosenWord = null;
        System.out.println("\nWelcome to hangman!");
        System.out.println("\nBefore we start, please choose a word difficulty:");
        boolean diffChosen = false;
        while (!diffChosen) {
            System.out.println("A: Easy");
            System.out.println("B: Normal");
            System.out.println("C: Hard");
            System.out.println("Your answer:");
            String diffChoice = read.nextLine();
            if (diffChoice.matches("A") || diffChoice.matches("a")) {
                chosenWord = diff1[random];
                diffChosen = true;
            }
            else if (diffChoice.matches("B") || diffChoice.matches("b")) {
                chosenWord = diff2[random];
                diffChosen = true;
            }
            else if (diffChoice.matches("C") || diffChoice.matches("c")) {
                chosenWord = diff3[random];
                diffChosen = true;
            }
            else if (diffChoice.length()>=1){
                System.out.println("Please choose one of the listed difficulty's");
            }
        }
        return chosenWord;
    }

    public String arrayToString(ArrayList list) {
        String convertedWord="";
        for (int i = 0; i<=list.size()-1; i++) {
            char p = (char) list.get(i);
            convertedWord = convertedWord + String.valueOf(p) + " ";
        }
        return convertedWord;
    }

    public ArrayList replaceCharacter(int characterNumber, ArrayList<Character> wordBeingGuessed, ArrayList<Character> wordBeingDissected) {
        wordBeingGuessed.remove(characterNumber);
        wordBeingDissected.get(characterNumber);
        wordBeingGuessed.add(characterNumber, wordBeingDissected.get(characterNumber));
        return wordBeingGuessed;
    }
}