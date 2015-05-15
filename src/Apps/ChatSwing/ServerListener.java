package Apps.ChatSwing;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServerListener implements Runnable
{
    Socket cs;
    DataInputStream in = null;
    DataOutputStream out = null;
    private static List<Socket> sList = Collections.synchronizedList(new ArrayList<Socket>());

    public ServerListener(Socket socket)
    {
        this.cs = socket;
    }

    @Override
    public void run()
    {
        try
        {
            sList.add(cs);
            in = new DataInputStream(cs.getInputStream());
            String name = in.readUTF();
            System.out.println("User " + name + " - connected");

            for (Socket socket : sList)                    //notification about new client to all clients
            {
                if (!socket.equals(cs))
                {
                    out = new DataOutputStream(socket.getOutputStream());
                    out.writeUTF(name + " is online");
                }
            }

            String lineIn = "";
            while (true)                      //getting messages from client
            {
                lineIn = in.readUTF();
                System.out.println("Client " + name + ": " + lineIn);
                if (lineIn.equals("exit"))
                {
                    System.out.println("exit detected");
                    break;
                }

                for (Socket socket : sList)
                {
                    if (!socket.equals(cs))
                    {
                        out = new DataOutputStream(socket.getOutputStream());
                        out.writeUTF(name + ": " + lineIn);
                        out.flush();
                    }
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                sList.remove(cs);
                cs.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }


}

