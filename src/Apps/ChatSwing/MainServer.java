package Apps.ChatSwing;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer
{
    ServerSocket ss;
    Socket cs;

    public static void main(String [] args) throws IOException
    {
        new MainServer();
    }

    public MainServer() throws IOException
    {
        try
        {
            System.out.println("ServerZX started");
            ss = new ServerSocket(7777);
            while (true)
            {
                cs = ss.accept();
                ServerListener serverListener = new ServerListener(cs);
                Thread t = new Thread(serverListener);
                t.start();

            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            ss.close();
        }
    }
}

