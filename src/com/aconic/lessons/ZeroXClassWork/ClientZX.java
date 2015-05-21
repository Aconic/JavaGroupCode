package com.aconic.lessons.ZeroXClassWork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;


public class ClientZX
{
    DataOutputStream out = null;
    Socket cs = null;
    ArrayList<ActionListener> lst = null;
    ClientListenerZX cl;
    public ClientZX()
    {
        lst = new ArrayList<>();

        try
        {
            cs = new Socket("localhost", 7777);
            out = new DataOutputStream(cs.getOutputStream());

            cl = new ClientListenerZX(cs, lst);
            Timer t =  new Timer(100, new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                   cl.readServerMessage();
                }
            });
            t.start();
            //t.scheduleAtFixedRate(cl,0,100);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void addActionListener(ActionListener a)
    {
        lst.add(a);
    }

    public void sendMessage(String str)
    {
        try
        {
            out.writeUTF(str);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void close()
    {
        try
        {
            out.close();
            cs.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
   }
}
