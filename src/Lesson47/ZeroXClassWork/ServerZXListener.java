package Lesson47.ZeroXClassWork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerZXListener implements Runnable
{
    Socket cs;
    DataInputStream in = null;
    DataOutputStream out = null;
    String nick = "";

    public ServerZXListener(Socket socket)
    {
        this.cs = socket;
        try
        {
            in = new DataInputStream(cs.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Thread t = new Thread(this);
            t.start();
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
            boolean b = true;

            String clientSign = "";
            while (b)                      //getting messages from client
            {
                String lineIn = in.readUTF();
                String[] input = lineIn.split(":");
                switch (input[0])
                {
                    case "auth":
                        nick = input[1];
                        ServerZX.userListInfoSend();
                        clientSign = ServerZX.getClientSign();
                        break;
                    case "invite":
                        ServerZX.invite(input[1], nick);
                        break;
                    case "buttonPressed":
                        System.out.println((input[1]) + " " + clientSign);        //test print
                        ServerZX.sendUserBtn((input[1]) + clientSign);
                        ServerZX.add(input[1], clientSign);     //add sign to array of signs
                        ServerZX.checkWinner(clientSign);
                        ServerZX.resultChecked();
                        break;
                    case "exit":
                        ServerZX.exitUser(this);
                        ServerZX.userListInfoSend();
                        b = false;
                        in.close();
                        out.close();
                        cs.close();
                        break;
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                cs.close();

            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

