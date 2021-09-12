package com.company;

public class beta {

    public void hangman() {
        MyFrame MyFrame = new MyFrame();
        int randomWord = (int) (Math.random()*9);
        //difficulty 1
        String[]diff1;
        diff1=new String[9];
        diff1[0]=("cat");
        diff1[1]=("dog");
        diff1[2]=("puck");
        diff1[3]=("dice");
        diff1[4]=("cup");
        diff1[5]=("tan");
        diff1[6]=("joy");
        diff1[7]=("girl");
        diff1[8]=("line");
        //difficulty 2
        String[]diff2;
        diff2=new String[9];
        diff2[0]=("number");
        diff2[1]=("sting");
        diff2[2]=("koala");
        diff2[3]=("ethical");
        diff2[4]=("lecture");
        diff2[5]=("tension");
        diff2[6]=("school");
        diff2[7]=("mansion");
        diff2[8]=("friendly");
        //difficulty 3
        String[]diff3;
        diff3=new String[9];
        diff3[0]=("tranquility");
        diff3[1]=("abomination");
        diff3[2]=("quantummechanics");
        diff3[3]=("presentation");
        diff3[4]=("prescription");
        diff3[5]=("vaccination");
        diff3[6]=("enlightening");
        diff3[7]=("submission");
        diff3[8]=("alcoholic");


    }
}
