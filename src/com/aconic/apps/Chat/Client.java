package com.aconic.apps.Chat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    private DataOutputStream out = null;
    private Socket cs = null;

    public static void main(String[] args) throws IOException
    {
        new Client();
    }

    public Client() throws IOException
    {
        try
        {
            cs = new Socket("LocalHost", 7777);
            out = new DataOutputStream(cs.getOutputStream());

            System.out.println("Enter your name :");
            Scanner scanner = new Scanner(System.in);
            out.writeUTF(scanner.nextLine());

            ClientListener cl = new ClientListener(cs);
            cl.setDaemon(true);
            cl.start();

            String mes = "";
            while (true) //sending message to server
            {
                if(mes.equals("exit"))
                {
                    break;
                }
                mes = scanner.nextLine();
                out.writeUTF(mes);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            cs.close();
        }
    }
}
