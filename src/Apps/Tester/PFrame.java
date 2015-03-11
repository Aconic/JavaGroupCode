package Apps.Tester;

import javax.swing.*;


public class PFrame extends JFrame
{
    public PFrame()
    {
        setLayout(null);
        setBounds(100, 100, 700, 400);

        PPanel ppanel = new PPanel();
        //  PButton pbutton = new PButton(ppanel);
         add(ppanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
