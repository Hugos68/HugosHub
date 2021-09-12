package com.company;

import java.awt.*;
import javax.swing.*;

public class betaGraphics extends JPanel {
    public void paintComponent(Graphics hangmanWindow) {
        super.paintComponent(hangmanWindow);
        this.setBackground(Color.BLACK);
        Graphics2D g2D= (Graphics2D) hangmanWindow;
        g2D.setColor(Color.WHITE);
        g2D.setStroke(new BasicStroke(2));
        //foundation
        g2D.drawLine(275,275,125,275);
        //long line upwards
        g2D.drawLine(125,275,125,75);
        //sideways support
        g2D.drawLine(150,275,125,250);
        //line sideways
        g2D.drawLine(125,75,200,75);
        //small line down
        g2D.drawLine(200,75,200,100);
        //head
        g2D.drawOval(187,100,25,25);
        //body
        g2D.drawLine(200,125,200,175);
        //left leg
        g2D.drawLine(200,175, 180, 200);
        //right leg
        g2D.drawLine(200,175, 220, 200);
        //left arm
        g2D.drawLine(200,150,180, 135);
        //right arm
        g2D.drawLine(200,150,220, 135);
    }
}
