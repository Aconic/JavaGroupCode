package com.aconic.apps.ZeroXVersionA;

import javax.swing.*;
import java.io.IOException;

public class FrameZX extends JFrame
{
     int count;
    public FrameZX() throws IOException
    {
        setTitle("Game ZeroXing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 150, 500, 350);
        add( new PanelZX() );
        setVisible(true);
    }
}

