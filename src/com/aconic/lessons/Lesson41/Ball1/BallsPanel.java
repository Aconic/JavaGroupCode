package com.aconic.lessons.Lesson41.Ball1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class BallsPanel extends JPanel implements MouseListener
{
    ArrayList<Ball> list = new ArrayList<Ball>();

    public BallsPanel()
    {
        setLayout(null);
        addMouseListener(this);

        Timer tt = new Timer(50, new ActionBallsMove() );
        tt.start();
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        Ball bb = new Ball(e.getX()-15, e.getY()-15, getWidth(), getHeight());
        list.add(bb);
        repaint();
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(Color.white);
        gg.fillRect(0, 0, getWidth(), getHeight());
        for (Ball b : list)
        {
            gg.setColor(b.col);
            gg.fillOval(b.x, b.y, 30, 30);
        }
    }

    class ActionBallsMove implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            for (Ball b : list)
            {
                b.move();
            }
            repaint();
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

