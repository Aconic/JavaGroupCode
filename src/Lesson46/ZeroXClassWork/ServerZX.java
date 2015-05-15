package Lesson46.ZeroXClassWork;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServerZX
{
    private static List<ServerZXListener> sList = null;

    public ServerZX()
    {
        try( ServerSocket ss = new ServerSocket(7777); )
        {
            sList = Collections.synchronizedList(new ArrayList<ServerZXListener>());
            System.out.println("ServerZX started");

            while (true)
            {
                Socket cs = ss.accept();
                ServerZXListener serverListener = new ServerZXListener(cs);
                sList.add(serverListener);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Server closed");
        }
    }
    public static void invite(String nameTo, String nameFrom) throws IOException
    {
        for(ServerZXListener sl : sList)
        {
            if(sl.nik.equals(nameTo))
                sl.out.writeUTF("inviteFrom:" + nameFrom);
        }
    }
}

