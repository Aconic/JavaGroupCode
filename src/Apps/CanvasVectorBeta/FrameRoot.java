package Apps.CanvasVectorBeta;

import javax.swing.*;
import java.io.FileNotFoundException;

public class FrameRoot extends JFrame
{
    public FrameRoot() throws FileNotFoundException
    {
        setLayout(null);
        setBounds(100, 100, 800, 600);


        Data data = new Data();
        JPanel pb = new PanelButton(data);
        JPanel pd = new PanelDraw(data);
        data.panelDraw = (PanelDraw) pd;
        JMenuBar menuBar = new MenuCommands(data);

        pb.setBounds(0, 0, 150, 600);
        pd.setBounds(150, 0, 800, 600);

        add(pd);
        add(pb);

        setJMenuBar(menuBar);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     }

}
