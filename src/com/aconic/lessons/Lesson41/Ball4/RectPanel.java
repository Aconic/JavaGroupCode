package com.aconic.lessons.Lesson41.Ball4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RectPanel extends BallsPanel implements Imove
{
    int dx;
    int dy;
    Color col;
    public RectPanel()
    {}

    public RectPanel(Point p)
    {
        setLocation(p);
        setOpaque(false);
        setSize(150, 150);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.lightGray);
        Random rnd = new Random();
        col = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        dx = rnd.nextInt(10) - 5;
        dy = rnd.nextInt(10) - 5;
    }

    public void move()
    {
        JPanel pp = (JPanel) getParent();
            if(getX() <= 0 || getX() >=  pp.getWidth()-150)
            dx *= -1;
        if(getY() <= 0 || getY() >=  pp.getHeight()-150)
            dy *= -1;

        Point p = getLocation();
        p.translate(dx, dy);
        setLocation(p);
    }
}

