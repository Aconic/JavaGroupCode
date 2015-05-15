package Apps.ChatSwing;


import javax.swing.*;
import java.io.IOException;

public class FrameChat extends JFrame

{
     public FrameChat() throws IOException
     {
         setTitle("Chat");
         setLayout(null);
         setBounds(300,100,360,460);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setResizable(false);

         PanelChat panel = new PanelChat();
         panel.setBounds(20,20, 320,380);

         add(panel);
         setVisible(true);
     }
}

