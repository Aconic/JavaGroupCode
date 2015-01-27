package Lesson22;

import javax.swing.*;

public class TableFrame extends JFrame
{
    TableFrame()
    {
        setVisible(true);
        setBounds(300, 200, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new TablePanel());

    }
}
