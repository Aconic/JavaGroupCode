package com.aconic.lessons.Lesson45a;

import javax.swing.*;


public class FrameChat extends JFrame
{

    public FrameChat()
    {
        setTitle("App for odd calculation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 150, 500, 350);
        add( new PanelChat() );
        setVisible(true);
    }
}
