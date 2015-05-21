package com.aconic.lessons.Lesson41.Ball1;

import java.awt.Color;
import java.util.Random;


public class Ball
{
    int x;
    int y;
    int dx;
    int dy;
    int pw;
    int ph;
    Color col;

    public Ball(int x, int y, int pw, int ph)
    {
        this.x = x;
        this.y = y;
        this.pw = pw;
        this.ph = ph;

        Random rnd = new Random();
        col = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        dx = rnd.nextInt(10) - 5;
        dy = rnd.nextInt(10) - 5;
    }

    public void move()
    {
        if(x <= 0 || x >=  pw-30)
            dx *= -1;
        if(y <= 0 || y >=  ph-30)
            dy *= -1;
        x += dx;
        y += dy;
    }
}
