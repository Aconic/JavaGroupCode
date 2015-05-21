package com.aconic.apps.ZeroXVersionA;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerZXListener implements Runnable
{
    Socket cs;
    int clientNum;
    DataInputStream in = null;
    DataOutputStream out = null;

    public ServerZXListener(Socket socket, int n)
    {
        this.cs = socket;
        this.clientNum = n;
        try
        {
            in = new DataInputStream(cs.getInputStream());
            out = new DataOutputStream(cs.getOutputStream());
            Thread t = new Thread(this);
            t.start();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        try
        {
            while (true)                      //getting messages from client
            {
                String  lineIn = in.readUTF();
                ServerZX.serverSend(lineIn + getClientSign());
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public String getClientSign()
    {
        String s = "";
        if (clientNum == 1)
        {
            s = "0";
        }
        if (clientNum == 2)
        {
            s = "X";
        }
        return s;
    }
}

