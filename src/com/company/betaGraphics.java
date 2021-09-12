package com.company;

import java.awt.*;
import javax.swing.*;

public class betaGraphics extends JPanel {
    public void paintComponent(Graphics hangmanWindow) {
        super.paintComponent(hangmanWindow);
        this.setBackground(Color.BLACK);
        Graphics2D g2D= (Graphics2D) hangmanWindow;
        g2D.setColor(Color.WHITE);
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0,0,400,400);

    }
}
