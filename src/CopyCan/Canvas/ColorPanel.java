package CopyCan.Canvas;


import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel
{
    JButton btnColor = null;

    ColorPanel(Command cmd)
    {
        setLayout(null);
        setBackground(Color.GRAY.brighter());
        btnColor = new JButton("Color");
        btnColor.setBounds(10, 10, 80, 25);
        add(btnColor);
        btnColor.addActionListener(cmd.colCmd);
    }
}

