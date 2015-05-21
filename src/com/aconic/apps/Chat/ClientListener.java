package com.aconic.apps.Chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientListener extends Thread
{
    Socket cs;
    DataInputStream in;

    public ClientListener(Socket socket) throws IOException
    {
        this.cs = socket;
    }

    @Override
    public void run()
    {
        try
        {
            in = new DataInputStream(cs.getInputStream());

                while (true)                                      //listen to the server messages
                {
                    if (in.available() == 0)
                    {
                      break;
                    }
                    System.out.println(in.readUTF());
                }

        } catch (IOException e)
        {
            System.out.println("Client error");
            e.printStackTrace();
        } finally
        {
            try
            {
                in.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
