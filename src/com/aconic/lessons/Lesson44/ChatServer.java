package com.aconic.lessons.Lesson44;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class ChatServer
{
    static ArrayList<ServerListener> slst= new ArrayList<ServerListener>();
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss = new ServerSocket(7777);
        while(true)
        {
            Socket cs = ss.accept();
            ServerListener sl = new ServerListener(cs);
            slst.add(sl);
            sl.start();
        }
    }
    public static void  sendMsg(String str) throws IOException
    {
        for (ServerListener sl : slst)
        {
            sl.out.writeUTF(str);
        }
    }
}

