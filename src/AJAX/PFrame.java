package AJAX;

import javax.swing.*;


public class PFrame   extends JFrame
{
      public PFrame()
    {
        setLayout(null);
        setTitle("Calc-Server-Ajax");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(200, 150, 400, 260);
        PClient panel = new PClient();
        panel.setBounds(0, 0, 500, 260);
        add(panel);
        setVisible(true);
    }
}
