package com.aconic.apps.BallsBeta;


import java.awt.*;
import java.util.Random;

public class Ball implements Runnable
{
    PanelBall panelBall;

    int dX = 1;
    int dY = 2;

    public Ball(PanelBall panelBall)
    {
        this.panelBall = panelBall;
        this.dX = randomDx();
        this.dY = randomDy();
        Thread tt = new Thread(this);
        tt.start();
    }

    public void run()
    {
        try
        {
            while (true)
            {

                moveBall();
                Thread.sleep(50);
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public int randomDx()
    {
        Random r = new Random();
        int dX = r.nextInt(10 + 2 + 1) + 2;
        System.out.println("dx " + dX);
        return dX;
    }

    public int randomDy()
    {
        Random r = new Random();
        int dY = r.nextInt(10 + 3 + 1) + 3;
        System.out.println("dy " + dY);
        return dY;
    }

    private void moveBall()
    {

        Point p = panelBall.getLocation();
        if (p.getX() >= panelBall.getParent().getWidth() - 30 || p.getX() <= 0)
        {
            dX = -dX;
        }
        if (p.getY() >= panelBall.getParent().getHeight() - 30 || p.getY() <= 0)
        {
            dY = -dY;
        }
        p.translate(dX, dY);
        panelBall.setLocation(p);
    }
}
