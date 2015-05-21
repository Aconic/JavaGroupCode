package com.aconic.lessons.ZeroXClassWork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class ClientListenerZX
{
    Socket cs;
    DataInputStream in;
    ArrayList<ActionListener> actionListeners = null;


    public ClientListenerZX(Socket socket, ArrayList<ActionListener> actionListeners) throws IOException
    {
        this.cs = socket;
        in = new DataInputStream(cs.getInputStream());
        this.actionListeners = actionListeners;

    }

    public void readServerMessage()
    {
        try
        {
            while (true)
            {
                String str = in.readUTF();
                String[] input = str.split(":");
                switch (input[0])
                {
                    case "inviteFrom":
                        ServerZX.invite(input[1], "nik");
                        break;
                }

                ActionEvent e = new ActionEvent(this, 1, str);
                for (ActionListener al : actionListeners)
                {
                    al.actionPerformed(e);
                }
            }
        } catch (
                IOException e
                )
        {
            e.printStackTrace();
        }
    }
}
