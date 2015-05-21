package com.aconic.lessons.Lesson41.Ball4;

import javax.swing.*;


public class BallsFrame extends JFrame
{
    public BallsFrame()
    {
        setTitle("Balls");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 200, 600, 400);
        add(new BallsPanel());
        setVisible(true);
    }
}

