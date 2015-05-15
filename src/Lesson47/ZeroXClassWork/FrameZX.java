package Lesson47.ZeroXClassWork;
import javax.swing.*;
import java.io.IOException;

public class FrameZX extends JFrame
{
    public FrameZX() throws IOException
    {
        setTitle("Game ZeroXing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(200, 150, 500, 360);

        ClientCmd cmd = new ClientCmd();
        add( new PanelContent(cmd) );
        setVisible(true);
    }
}

