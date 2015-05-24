package com.aconic.apps.Calculator;


import javax.swing.*;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e)
        {
        }
        new FrameChat();

    }
}