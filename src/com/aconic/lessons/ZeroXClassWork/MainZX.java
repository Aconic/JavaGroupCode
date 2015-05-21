package com.aconic.lessons.ZeroXClassWork;


import javax.swing.*;
import java.io.IOException;

public class MainZX
{

    public static void main(String[] args) throws IOException
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e)
        {
        }
        new FrameZX();
        }
}
