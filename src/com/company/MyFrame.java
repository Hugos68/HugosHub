package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyPanel panel = new MyPanel();
    MyFrame(){
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}