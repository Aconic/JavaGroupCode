package com.aconic.lessons.Lesson41.Ball2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BallsPanel extends JPanel implements MouseListener
{
    public BallsPanel()
    {
        setLayout(null);
        addMouseListener(this);

        //Timer tt = new Timer(50, new ActionBallsMove() );
        ThreadBallsMove tt = new ThreadBallsMove();
        tt.start();
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        Ball b = new Ball(e.getPoint());
        add( b );
        //b.repaint();
    }


    class ActionBallsMove implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Component[] list = getComponents();
            for (Component b : list)
            {
                Ball bb = (Ball) b;
                bb.move();
                bb.repaint();
            }
        }
    }

    class ThreadBallsMove extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                while(true)
                {
                    Component[] list = getComponents();
                    for (Component b : list)
                    {
                        Ball bb = (Ball) b;
                        bb.move();
                        bb.repaint();
                    }
                    sleep(50);
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }



    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}


}
