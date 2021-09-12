package com.company;

import javax.swing.*;

public class MyFrame extends JFrame {
    betaGraphics betaGraphic = new betaGraphics();
    public MyFrame() {
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(betaGraphic);
        this.setVisible(true);
    }
}
