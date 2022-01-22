package oneTo50.view;

import oneTo50.model.Rect;
import oneTo50.model.UImodel;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyPanel extends JPanel {
    Random ran;
    int a = 1;
    JButton restartButton = new JButton();
    JLabel timer = new JLabel();
    UImodel uimodel;
    Rect[] rects;

    MyPanel(UImodel uimodel) {
        this.uimodel = uimodel;
        setLayout(null);
        ran = new Random();
        uimodel.setRects();
        uimodel.numShuffle();
        rects = uimodel.getRects();

        restartButton.setLabel("RESTART");
        restartButton.setBounds(145, 350, 100, 50);
        add(restartButton);

        timer.setText("0 second"); // sample
        timer.setBounds(170, 13, 100, 50);
        add(timer);
    }



    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Thread.sleep(10);
            repaint();
        } catch (Exception e) {
        }
        for (int i = 0; i < 25; i++) {
            g.setColor(rects[i].color);
            g.fillRect(rects[i].x, rects[i].y, rects[i].size, rects[i].size);
            g.setColor(Color.black);
            g.drawRect(rects[i].x, rects[i].y, rects[i].size, rects[i].size);
            g.drawString(rects[i].num + "", rects[i].x + 20, rects[i].y + 30);
        }
    }
}