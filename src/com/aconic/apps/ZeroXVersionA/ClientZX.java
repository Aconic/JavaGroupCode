package com.aconic.apps.ZeroXVersionA;

import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class ClientZX
{
    DataOutputStream out = null;
    ArrayList<ActionListener> lst = null;

    public ClientZX()
    {
        lst = new ArrayList<>();

        try
        {
            Socket cs = new Socket("localhost", 7777);
            out = new DataOutputStream(cs.getOutputStream());
            ClientListenerZX cl = new ClientListenerZX(cs, lst);
            cl.start();
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
        } catch (IOException e)
        {
            e.printStackTrace();
        }
   }
}
