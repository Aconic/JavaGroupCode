package com.aconic.lessons.ZeroXClassWork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static javax.swing.JOptionPane.showInputDialog;


public class ClientCmd
{
    Socket cs = null;
    DataOutputStream out = null;

    ConnectAction actConn = new ConnectAction();
    AuthAction    actAuth = new AuthAction();
    InviteAction  actInvt = new InviteAction();

    class ConnectAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                cs = new Socket("localhost", 7777);
                out = new DataOutputStream(cs.getOutputStream());
            }
            catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }
    }
    class AuthAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
               String str = showInputDialog(null);
                out.writeUTF("auth:"+str);
            }
            catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }
    }
    class InviteAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                out.writeUTF("invite:");
            }
            catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }
    }
}
