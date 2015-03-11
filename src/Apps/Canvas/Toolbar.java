package Apps.Canvas;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JToolBar
{

    JButton btnLineWeight_1 = null;
    JButton btnLineWeight_5 = null;
    JButton btnLineWeight_7 = null;
    JButton btnColorRed = null;
    JButton btnColorGreen = null;
    JButton btnColorBlue = null;
    JTextField fieldRed = null;

    public Toolbar(Command cmd)
    {
        setLayout(null);
        btnLineWeight_1 = new JButton("1");
        btnLineWeight_5 = new JButton("5");
        btnLineWeight_7 = new JButton("7");
        btnColorRed = new JButton("||||||||||||");
        btnColorGreen = new JButton("||||||||||||");
        btnColorBlue = new JButton("||||||||||||");


        btnLineWeight_1.setBounds(40, 5, 40, 25);
        btnLineWeight_5.setBounds(80, 5, 40, 25);
        btnLineWeight_7.setBounds(120, 5, 40, 25);
        btnColorRed.setBounds(200, 5, 60, 25);
        btnColorGreen.setBounds(265, 5, 60, 25);
        btnColorBlue.setBounds(330, 5, 60, 25);
        btnColorRed.setForeground(Color.RED);
        btnColorGreen.setForeground(Color.GREEN);
        btnColorBlue.setForeground(Color.BLUE);

        add(btnLineWeight_1);
        add(btnLineWeight_5);
        add(btnLineWeight_7);
        add(btnColorRed);
        add(btnColorGreen);
        add(btnColorBlue);

        btnLineWeight_1.addActionListener(cmd.lineWCmd_1);
        btnLineWeight_5.addActionListener(cmd.lineWCmd_5);
        btnLineWeight_7.addActionListener(cmd.lineWCmd_7);
        btnColorRed.addActionListener(cmd.colCmdRed);
        btnColorGreen.addActionListener(cmd.colCmdGreen);
        btnColorBlue.addActionListener(cmd.colCmdBlue);
        setFloatable(false);
        setRollover(true);
    }
}
