package com.aconic.lessons.ZeroXClassWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelZX extends JPanel
{
    private JButton[] btn;

    ClientZX client;
    CheckDataZX checkDataZX;
    String btnSign;

    public PanelZX()
    {
        setLayout(new GridLayout(3, 3));
        Font f = new Font("Arial", Font.BOLD, 32);
        btn = new JButton[9];
        client = new ClientZX();
        checkDataZX = new CheckDataZX();

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
                    client.sendMessage(e.getActionCommand());
                }
            });
        }

        client.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btnNum = e.getActionCommand().substring(0, 1);
                btnSign = e.getActionCommand().substring(e.getActionCommand().length() - 1);

                btn[Integer.parseInt(btnNum)].setText(btnSign);
                btn[Integer.parseInt(btnNum)].setEnabled(false);
                if (resultChecked())
                {
                    close();
                }
            }
        });
    }

    private boolean resultChecked()
    {
        boolean c = false;
        if (checkDataZX.checkWinner(btn, btnSign) != null)
        {
            String winnerSign = checkDataZX.checkWinner(btn, btnSign);
            JOptionPane.showMessageDialog(null, "User with " + winnerSign + " sign - wins!");
            c = true;
        }
        return c;
    }

    private void close()
    {
        client.close();
    }
}


