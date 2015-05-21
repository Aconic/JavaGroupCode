package com.aconic.apps.Balls;



import javax.swing.*;
import java.io.FileNotFoundException;

public class FrameRoot extends JFrame
{
    public FrameRoot() throws FileNotFoundException
    {
        setLayout(null);
        setBounds(100, 100, 600, 600);

        Data data = new Data();
        JPanel pd = new PanelDraw(data);
        data.panelDraw = (PanelDraw) pd;

        pd.setBounds(150, 0, 400, 400);

        add(pd);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     }

}
