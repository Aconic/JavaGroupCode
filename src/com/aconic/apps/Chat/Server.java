package com.aconic.apps.Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server
{
    ServerSocket ss;
    Socket cs;
    private static List<Socket> sList = Collections.synchronizedList(new ArrayList<Socket>());

    public Server() throws IOException
    {
        try
        {
            ss = new ServerSocket(7777);
            while (true)
            {
                cs = ss.accept();
                sList.add(cs);
                ServerListener serverListener = new ServerListener(cs);
                Thread t = new Thread(serverListener);
                t.start();
                if(sList==null)
                {
                    ss.close();
                    System.out.println("ServerZX closed");
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            ss.close();
        }
    }

    public static List<Socket> getSocketList()
    {
        return sList;
    }

    public static void setList(List<Socket> list)
    {
        sList = list;
    }
}

