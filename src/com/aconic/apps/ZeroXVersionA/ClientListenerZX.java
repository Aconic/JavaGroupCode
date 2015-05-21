package com.aconic.apps.ZeroXVersionA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class ClientListenerZX extends Thread
{
    DataInputStream in;
    ArrayList<ActionListener> actionListeners = null;

    public ClientListenerZX(Socket cs, ArrayList<ActionListener> actionListeners) throws IOException
    {
        in = new DataInputStream(cs.getInputStream());
        this.actionListeners = actionListeners;
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                String str = in.readUTF();
                ActionEvent e = new ActionEvent(this, 1, str);
                for (ActionListener al : actionListeners)
                {
                    al.actionPerformed(e);
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}