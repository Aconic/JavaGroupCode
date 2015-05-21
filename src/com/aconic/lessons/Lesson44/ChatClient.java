package com.aconic.lessons.Lesson44;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class ChatClient
{
    public static void main(String[] args) throws UnknownHostException, IOException
    {
        Socket cs = new Socket("localhost", 7777);
        DataOutputStream out = new DataOutputStream(cs.getOutputStream());

        ClientListener cl = new ClientListener(cs);
        cl.start();

        Scanner scin = new Scanner(System.in);
        String str = scin.nextLine();
        while (true)
        {
            out.writeUTF(str);
            if (str.equals("exit"))
            {
                cl.setDaemon(true);
                break;
            }
            str = scin.nextLine();
        }
        cs.close();
    }
}

