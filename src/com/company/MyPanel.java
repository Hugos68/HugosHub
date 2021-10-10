package com.company;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import static com.company.Main.read;

public class MyPanel extends JPanel{

    String chosenWord = chooseWord();
    extra1 extra1 = new extra1();

    MyPanel(){
        this.setPreferredSize(new Dimension(400,400));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(5));
        g2D.setBackground(Color.BLACK);
        g2D.setPaint(Color.WHITE);
        g2D.drawOval(100,100,40,40);
        ArrayList<Character> wordDissected = new ArrayList<>();
        ArrayList<Character> wordBeingGuessed = new ArrayList<>();
        ArrayList<Character> userGuess = new ArrayList<>();

        //converting chosenWord into char array and creating empty char array
        int wordLength = chosenWord.length()-1;
        for (int i = 0; i <= wordLength; i++) {
            wordDissected.add(chosenWord.charAt(i));
        }
        for (int i = 0; i <= wordLength; i++) {
            wordBeingGuessed.add('_');
        }

        //start guessing
        int turns = 0;
        int mistakes = 0;
        int lettersGuessed = 0;
        boolean gameWon = false;
        boolean characterReplaced;
        while (!gameWon) {
            if (lettersGuessed==wordLength+1) {
                gameWon=true;
                gameWon(turns);
            }
            turns++;
            System.out.println("\n****** Round: "+turns+" ******\n");
            System.out.println(wordBeingGuessed);
            System.out.println("\nMake your guess:\n");
            String stringUserGuess = read.nextLine();
            userGuess.clear();
            userGuess.add(stringUserGuess.charAt(0));
            int loop = 0;
            characterReplaced = false;
            while (!characterReplaced) {
                mistakes++;
                for (int i = 0; i <= wordLength; i++) {
                    if (userGuess.get(0) == wordDissected.get(i)) {
                        mistakes--;
                        replaceCharacter(i, wordBeingGuessed, wordDissected);
                        lettersGuessed++;
                    }
                }
                characterReplaced=true;
            }
            if (mistakes == 1) {
                //foundation
                g2D.drawLine(275, 275, 125, 275);
            } else if (mistakes == 2) {
                //long line upwards
                g2D.drawLine(125, 275, 125, 75);
            } else if (mistakes == 3) {
                //sideways support
                g2D.drawLine(150, 275, 125, 250);
            } else if (mistakes == 4) {
                //line sideways
                g2D.drawLine(125, 75, 200, 75);
            } else if (mistakes == 5) {
                //small line down
                g2D.drawLine(200, 75, 200, 100);
            } else if (mistakes == 6) {
                //head
                g2D.drawOval(187, 100, 25, 25);
            } else if (mistakes == 7) {
                //body
                g2D.drawLine(200, 125, 200, 175);
            } else if (mistakes == 8) {
                //left leg
                g2D.drawLine(200, 175, 180, 200);
            } else if (mistakes == 9) {
                //right leg
                g2D.drawLine(200, 175, 220, 200);
            } else if (mistakes == 10) {
                //left arm
                g2D.drawLine(200, 150, 180, 135);
            } else if (mistakes == 11) {
                //right arm
                g2D.drawLine(200, 150, 220, 135);
                System.out.println("\nOh no, he's dead!\n\nThe word was: "+chosenWord+"\n");
                extra1.pressAnyKeyToContinue();
                System.exit(1);
            }
        }
    }

    public ArrayList replaceCharacter(int characterNumber, ArrayList<Character> wordBeingGuessed, ArrayList<Character> wordBeingDissected) {
        wordBeingGuessed.remove(characterNumber);
        wordBeingDissected.get(characterNumber);
        wordBeingGuessed.add(characterNumber, wordBeingDissected.get(characterNumber));
        return wordBeingGuessed;
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

    public void gameWon(int turns){
        System.out.println("\nCongratulations!\n\nYou guessed the word!\n\nIt took you "+turns+ " turns\n");
        extra1.pressAnyKeyToContinue();
        System.exit (1);
    }
}
