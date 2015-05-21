package com.aconic.apps.Tables;

import javax.swing.*;

public class TableFrame extends JFrame
{
    public TableFrame(Commands cmd)
    {
        setBounds(300, 200, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new TablePanel(cmd));

        setVisible(true);
    }
}