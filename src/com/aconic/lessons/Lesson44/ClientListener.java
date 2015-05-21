package com.aconic.lessons.Lesson44;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Date: 01.04.15 * Time: 19:56
 * To change this template use File | Settings | File Templates.
 */
public class ClientListener extends Thread
{
    DataInputStream in = null;
    String str = "";

    public ClientListener(Socket cs)
    {
        try
        {
            in = new DataInputStream(cs.getInputStream());

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
            while (true)
            {
                str = in.readUTF();
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

