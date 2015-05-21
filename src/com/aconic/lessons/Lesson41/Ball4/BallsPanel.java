package com.aconic.lessons.Lesson41.Ball4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class BallsPanel extends JPanel implements MouseListener
{
    public BallsPanel()
    {
        setLayout(null);
        addMouseListener(this);
        ThreadBallsMove tt = new ThreadBallsMove();
        tt.start();
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

        if (SwingUtilities.isRightMouseButton(e))
        {
            RectPanel rectPanel = new RectPanel(e.getPoint());
            add(rectPanel);
        }
        else
        {
            Ball ball = new Ball(e.getPoint());
            add(ball);
        }
    }


    class ThreadBallsMove extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                while (true)
                {
                    Component[] list = getComponents();

                    for (Component b : list)
                    {
                      Imove i = (Imove) b;
                      i.move();
                    }
                    sleep(40);
                }
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void mouseEntered(MouseEvent e)
    {
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
    }
}

