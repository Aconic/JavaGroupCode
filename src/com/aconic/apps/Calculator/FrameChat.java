package com.aconic.apps.Calculator;


import javax.swing.*;
import java.io.IOException;

public class FrameChat extends JFrame

{
     public FrameChat() throws IOException
     {
         setTitle("Calculator");
         setLayout(null);
         setBounds(300,100,460,460);
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         setResizable(true);

         PanelCalc panel = new PanelCalc();
         panel.setBounds(20,20, 420,400);

         add(panel);
         setVisible(true);
     }
}

