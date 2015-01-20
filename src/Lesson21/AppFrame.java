package Lesson21;


import javax.swing.*;

public class AppFrame extends JFrame
{
    AppFrame()
    {
        setVisible(true);
        setBounds(300,200,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new AppPanel());
        setVisible(true);
    }
}
