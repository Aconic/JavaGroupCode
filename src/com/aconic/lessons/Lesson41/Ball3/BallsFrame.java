package com.aconic.lessons.Lesson41.Ball3;

import com.aconic.lessons.Lesson41.Ball2.BallsPanel;

import javax.swing.*;


public class BallsFrame extends JFrame
{
    public BallsFrame()
    {
        setTitle("Balls");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 200, 600, 400);
        add( new BallsPanel() );
        setVisible(true);
    }
}

