package com.aconic.apps.Tables;

import javax.swing.*;

class TableMain

{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                Commands cmd = new Commands();
                JFrame.setDefaultLookAndFeelDecorated(true);
                new TableFrame(cmd);
            }
        });
    }
}
