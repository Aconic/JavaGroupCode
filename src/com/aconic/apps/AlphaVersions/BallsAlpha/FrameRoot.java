package com.aconic.apps.AlphaVersions.BallsAlpha;


import javax.swing.*;
import java.io.FileNotFoundException;

public class FrameRoot extends JFrame
{
    public FrameRoot() throws FileNotFoundException
    {
        setLayout(null);
        setBounds(100, 100, 550, 550);

        Data data = new Data();
        JPanel pd = new PanelDraw(data);
        data.panelDraw = (PanelDraw) pd;

        pd.setBounds(10, 0, 520, 500);

        add(pd);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     }

}
