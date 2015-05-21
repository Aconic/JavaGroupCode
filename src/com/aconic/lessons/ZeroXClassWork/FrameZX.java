package com.aconic.lessons.ZeroXClassWork;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class FrameZX extends JFrame
{

    public FrameZX() throws IOException
    {
        setTitle("Game ZeroXing");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 150, 407, 600);

        ClientCmd cmd = new ClientCmd();
        JPanel pGame = new PanelZX();
        JPanel pCmd = new PanelCmd(cmd);

        pGame.setBounds(0, 0, 400, 250);
        pCmd.setBounds(0, 250, 400, 120);

        pCmd.setBackground(Color.DARK_GRAY);

        add(pGame);
        add(pCmd);
        setVisible(true);
    }
}

