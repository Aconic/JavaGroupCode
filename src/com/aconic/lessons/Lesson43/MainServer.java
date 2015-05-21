package com.aconic.lessons.Lesson43;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket ss = new ServerSocket(7777);
            Socket cs = ss.accept();
            DataInputStream in = new DataInputStream(cs.getInputStream());
            DataOutputStream out = new DataOutputStream(cs.getOutputStream());

            while (true)
            {
                String lineIn = in.readUTF();  //получаем от клиента
                System.out.println("Client " + lineIn);

                if (lineIn.equals("exit"))
                {
                    out.writeUTF("exitClient");
                    cs.close();
                    ss.close();
                    break;
                }
                out.writeUTF("ServerZX is open");      // отправляем клинету
                out.flush();
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
