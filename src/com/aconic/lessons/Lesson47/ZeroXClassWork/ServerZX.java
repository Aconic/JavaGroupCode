package com.aconic.lessons.Lesson47.ZeroXClassWork;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServerZX
{
    private static List<ServerZXListener> sList = null;
    static String[] arrOfSigns = new String[9];
    private static String res = null;

    public ServerZX()
    {
        try (ServerSocket ss = new ServerSocket(7777);)
        {
            sList = Collections.synchronizedList(new ArrayList<ServerZXListener>());
            System.out.println("ServerZX started");

            for (int i = 0; i < arrOfSigns.length; i++)
            {
                arrOfSigns[i] = "*";
            }

            while (true)
            {
                Socket cs = ss.accept();
                ServerZXListener serverListener = new ServerZXListener(cs);
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

    public static void invite(String nameTo, String nameFrom) throws IOException
    {
        for (ServerZXListener sl : sList)
        {
            if (sl.nick.equals(nameTo))
            {
                sl.out.writeUTF("inviteFrom:" + nameFrom);
            }
        }
    }

    public static void userListInfoSend() throws IOException
    {
        String listNames = "Users:{";
        for (ServerZXListener sl : sList)
        {
            listNames = listNames.concat(sl.nick + ",");
        }
        listNames = listNames.concat("}");
        for (ServerZXListener sl : sList)
        {
            sl.out.writeUTF(listNames);
        }
    }

    public static void exitUser(ServerZXListener serverZXListener)
    {
        sList.remove(serverZXListener);
    }

    public static String getClientSign()
    {
        String s = "";
        if (sList.size() % 2 != 0)
        {
            s = "0";
        }
        if (sList.size() % 2 == 0)
        {
            s = "X";
        }
        return s;
    }

    public static void sendUserBtn(String btn)
    {
        for (ServerZXListener sl : sList)
        {
            try
            {
                sl.out.writeUTF("button:" + btn);
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void add(String n, String btnSign)
    {
        arrOfSigns[Integer.parseInt(n)] = btnSign;
    }

    public static String checkWinner(String btnSign)
    {
         if (arrOfSigns[0].equals(btnSign) && arrOfSigns[1].equals(btnSign) && arrOfSigns[2].equals(btnSign))
        {
            res = btnSign;
        }
        else if (arrOfSigns[3].equals(btnSign) && arrOfSigns[4].equals(btnSign) && arrOfSigns[5].equals(btnSign))
        {
            res = btnSign;
        }
        else if (arrOfSigns[6].equals(btnSign) && arrOfSigns[7].equals(btnSign) && arrOfSigns[8].equals(btnSign))
        {
            res = btnSign;
        }
        else if (arrOfSigns[0].equals(btnSign) && arrOfSigns[3].equals(btnSign) && arrOfSigns[6].equals(btnSign))
        {
            res = btnSign;
        }
        else if (arrOfSigns[1].equals(btnSign) && arrOfSigns[4].equals(btnSign) && arrOfSigns[7].equals(btnSign))
        {
            res = btnSign;
        }
        else if (arrOfSigns[2].equals(btnSign) && arrOfSigns[5].equals(btnSign) && arrOfSigns[8].equals(btnSign))
        {
            res = btnSign;
        }
        else if (arrOfSigns[0].equals(btnSign) && arrOfSigns[4].equals(btnSign) && arrOfSigns[8].equals(btnSign))
        {
            res = btnSign;
        }
        else if (arrOfSigns[2].equals(btnSign) && arrOfSigns[4].equals(btnSign) && arrOfSigns[6].equals(btnSign))
        {
            res = btnSign;
        }
        return res;
    }

    public static boolean resultChecked()
    {
        boolean c = false;
        if (res != null)
        {
            String winnerSign = checkWinner(res);
            JOptionPane.showMessageDialog(null, "User with <" + winnerSign + "> sign - wins!");
            c = true;
        }
        return c;
    }
}

