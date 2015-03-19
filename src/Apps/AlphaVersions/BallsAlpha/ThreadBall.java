package Apps.AlphaVersions.BallsAlpha;


import java.awt.*;
import java.util.Random;

public class ThreadBall extends Thread
{
    PanelBall panelBall;

    int dX = 1;
    int dY = 2;
    int count = 0;


    public ThreadBall(PanelBall panelBall)
    {
        this.panelBall = panelBall;
        this.dX = randomDx();
        this.dY = randomDy();
    }

    public void run()
    {
        while (true)
         //   while (count <= 200)
        {
            try
            {
                moveBall();
                sleep(50);
                count++;
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
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
