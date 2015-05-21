package com.aconic.lessons.Lesson44;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerListener extends Thread
{
    DataInputStream in = null;
    DataOutputStream out = null;
    Socket cs;

    public ServerListener(Socket cs)
    {
        this.cs = cs;
    }

    @Override
    public void run()
    {
        try
        {
            in = new DataInputStream(cs.getInputStream());
            out = new DataOutputStream(cs.getOutputStream());
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                cs.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }



    }
}
