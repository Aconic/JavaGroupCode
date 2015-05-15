package Apps.ChatSwing;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientListener extends Thread
{
    Socket cs;
    DataInputStream in;
    PanelChat panelChat;

    public ClientListener(Socket socket, PanelChat panel) throws IOException
    {
        this.cs = socket;
        this.panelChat = panel;
    }

    @Override
    public void run()
    {
        try
        {
            in = new DataInputStream(cs.getInputStream());
            while (true)                                      //listen to the server messages
            {
                String str = in.readUTF();
                panelChat.textArea.append(str + "\n");
            }

        } catch (IOException e)
        {
            System.out.println("Client error");
            e.printStackTrace();
        } finally
        {
            try
            {
                in.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
