package com.aconic.lessons.ZeroXClassWork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerZXListener implements Runnable
{
    Socket cs;
    DataInputStream in = null;
    DataOutputStream out = null;
    int clientNum;
    String nik = "";

    public ServerZXListener(Socket socket)
    {
        this.cs = socket;
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
                String lineIn = in.readUTF();
                String[] input = lineIn.split(":");
                switch (input[0])
                {
                    case "auth":
                        nik = input[1];
                        break;
                    case "invite":
                        ServerZX.invite(input[1], nik);
                        break;
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                cs.close();

            } catch (IOException e)
            {
                e.printStackTrace();
            }
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

