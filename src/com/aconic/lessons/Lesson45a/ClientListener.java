package com.aconic.lessons.Lesson45a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;


public class ClientListener extends Thread
{
    DataInputStream in = null;
    ArrayList<ActionListener> actionListeners = null;

    public ClientListener(Socket cs, ArrayList<ActionListener> actionListeners) throws IOException
    {
        in = new DataInputStream( cs.getInputStream() );
        this.actionListeners = actionListeners;
    }

    @Override
    public void run()
    {
        String str;
        try
        {
            while(true)
            {
                str = in.readUTF();
                ActionEvent e = new ActionEvent(this, 1, str);
                for (ActionListener aa : actionListeners)
                {
                    aa.actionPerformed(e);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
