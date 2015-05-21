package com.aconic.lessons.Lesson45a;


import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;



public class ChatClient
{
    Socket           cs  = null;
    DataOutputStream out = null;

    ArrayList<ActionListener> lst = null;

    public  ChatClient(JTextArea txt)
    {
        lst = new ArrayList<>();

        try
        {
            cs  = new Socket("localhost", 7777);
            out = new DataOutputStream(cs.getOutputStream());
            ClientListener cl = new ClientListener(cs, lst);
            cl.start();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void addActionListener(ActionListener a)
    {
        lst.add(a);
    }

    public void sendMessage(String str)
    {
        try
        {
            out.writeUTF(str);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
