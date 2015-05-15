package Lesson46.ZeroXClassWork;

import javax.swing.*;

public class PanelCmd extends JPanel
{
    public PanelCmd(ClientCmd cmd)
    {
        setLayout(null);

        JButton cmdConnect = new JButton("Connect");
        JButton cmdAuth    = new JButton("Enter");
        JButton cmdInvite  = new JButton("Invite");


        cmdConnect.setBounds(10,10,100,30);
        cmdAuth.setBounds(10,40,100,30);
        cmdInvite.setBounds(10,70,100,30);

        add(cmdConnect);
        add(cmdAuth);
        add(cmdInvite);

        cmdConnect.addActionListener(cmd.actConn);
        cmdAuth.addActionListener(   cmd.actAuth);
        cmdInvite.addActionListener( cmd.actInvt);
    }
}
