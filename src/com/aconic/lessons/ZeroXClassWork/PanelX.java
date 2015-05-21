package com.aconic.lessons.ZeroXClassWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class PanelX extends JPanel
{
    public JButton[] btn;

    ClientCmd clientCmd = null;

    public PanelX(ClientCmd cmd)
    {
        setLayout(new GridLayout(3, 3));
        setBackground(Color.BLACK);
        this.clientCmd = cmd;
        Font f = new Font("Arial", Font.BOLD, 32);
        btn = new JButton[9];
       // cmd.setGamePanel(this);

        for (int i = 0; i < 9; i++)
        {
            btn[i] = new JButton();
            btn[i].setActionCommand(String.valueOf(i));
            btn[i].setFont(f);
            add(btn[i]);
            btn[i].addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    try
                    {
                        clientCmd.out.writeUTF("buttonPressed:" + e.getActionCommand());
                    } catch (IOException e1)
                    {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void buttonPressed(String num, String btnSign)
    {
        btn[Integer.parseInt(num)].setEnabled(false);
        btn[Integer.parseInt(num)].setText(btnSign);

    }
//	        client.addActionListener(new ActionListener()
//	        {
//	            @Override
//	            public void actionPerformed(ActionEvent e)
//	            {
//	                String btnNum = e.getActionCommand().substring(0, 1);
//	                btnSign = e.getActionCommand().substring(e.getActionCommand().length() - 1);
//
//	                btn[Integer.parseInt(btnNum)].setText(btnSign);
//	                btn[Integer.parseInt(btnNum)].setEnabled(false);
//	                if (resultChecked())
//	                {
//	                    close();
//	                }
//	            }
//	        });
}





