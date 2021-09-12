package com.company;

import javax.swing.*;

public class MyFrame extends JFrame {
    betaGraphics betaGraphic = new betaGraphics();
    public MyFrame() {
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(betaGraphic);
        this.setVisible(true);
    }
}
