package com.aconic.apps.ZeroXVersionA;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServerZX
{
    private static List<ServerZXListener> sList = null;

    public static void main(String[] args)
    {
        new ServerZX();
    }

    public ServerZX()
    {
        int clientNum = 0;
        sList = Collections.synchronizedList(new ArrayList<ServerZXListener>());
        System.out.println("ServerZX started");

        try (ServerSocket ss = new ServerSocket(7777))
        {
            while (true)
            {
                Socket cs = ss.accept();
                clientNum++;
                ServerZXListener serverListener = new ServerZXListener(cs, clientNum);
                sList.add(serverListener);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            System.out.println("Server closed");
        }
    }

    public static void serverSend(String str)
    {
        for (ServerZXListener sl : sList)
        {
            try
            {
                sl.out.writeUTF(str);
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

