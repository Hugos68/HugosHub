package com.company;

import static com.company.Main.read;

public class beta {
    public void hangman() {;
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
        boolean diffChosen = false;
        String chosenWord;
        System.out.println("Welcome to Hangman!\n");
        while (!diffChosen) {
            System.out.println("Please choose a difficulty:");
            System.out.println("A: Easy");
            System.out.println("B: Normal");
            System.out.println("C: Hard");
            System.out.println("Your answer:");
            String diffChoice = read.nextLine();
            if (diffChoice.matches("A") || diffChoice.matches("a")) {
                diffChosen = true;
                chosenWord = diff1[random];
            }
            else if (diffChoice.matches("B") || diffChoice.matches("b")) {
                diffChosen = true;
                chosenWord = diff2[random];
            }
            else if (diffChoice.matches("C") || diffChoice.matches("c")) {
                diffChosen = true;
                chosenWord = diff3[random];
            }
        }
    }
}

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setSize(500,500);
                this.setBackground(Color.BLACK);
                this.pack();
                this.setLocationRelativeTo(null);
                this.setVisible(true);
                this.setPreferredSize(new Dimension(400,400));

                Graphics2D g2D = (Graphics2D) g;
                g2D.setPaint(Color.WHITE);
                g2D.setStroke(new BasicStroke(5));
                //foundation
                g2D.drawLine(275, 275, 125, 275);
                //long line upwards
                g2D.drawLine(125, 275, 125, 75);
                //sideways support
                g2D.drawLine(150, 275, 125, 250);
                //line sideways
                g2D.drawLine(125, 75, 200, 75);
                //small line down
                g2D.drawLine(200, 75, 200, 100);
                //head
                g2D.drawOval(187, 100, 25, 25);
                //body
                g2D.drawLine(200, 125, 200, 175);
                //left leg
                g2D.drawLine(200, 175, 180, 200);
                //right leg
                g2D.drawLine(200, 175, 220, 200);
                //left arm
                g2D.drawLine(200, 150, 180, 135);
                //right arm
                g2D.drawLine(200, 150, 220, 135);
