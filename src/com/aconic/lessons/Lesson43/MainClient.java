package com.aconic.lessons.Lesson43;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Клиент
 */
public class MainClient
{

    public static void main(String args[])
    {
        try
        {
            Socket cs = new Socket("LocalHost", 7777);
            DataOutputStream out = new DataOutputStream(cs.getOutputStream());
            DataInputStream in = new DataInputStream(cs.getInputStream());

            while (true)
            {
                Scanner scanner = new Scanner(System.in);
                String mes = scanner.nextLine();
                out.writeUTF(mes);
                out.flush();
                mes = in.readUTF();
                if (mes.equals("exitClient"))
                {
                    out.writeUTF(mes);
                    System.out.println("ServerZX closed");
                    cs.close();
                    break;
                }
               System.out.println("ServerZX message: " + mes);
            }
        } catch (IOException e)
        {

            e.printStackTrace();
        }


    }

}
