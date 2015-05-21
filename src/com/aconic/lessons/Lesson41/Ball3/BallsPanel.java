package com.aconic.lessons.Lesson41.Ball3;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class BallsPanel extends JPanel implements MouseListener
{
    public BallsPanel()
    {
        setLayout(null);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        Ball b = new Ball(e.getPoint());
        add( b );
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

