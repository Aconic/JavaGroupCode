package Apps.CanvasClassEdition;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel
{
    JToolBar toolBar = null;
    JButton btnLineWeight_1 = null;
    JButton btnLineWeight_3 = null;

    public Toolbar(Command cmd)
    {
        setLayout(null);
        setBackground(Color.RED.darker());

        toolBar = new JToolBar("TOOLPOOL");
        toolBar.setFloatable(true);
        toolBar.setRollover(true);

        btnLineWeight_1 = new JButton("W=1");
        btnLineWeight_3 = new JButton("W=3");

        btnLineWeight_1.setBounds(5, 5, 60, 25);
        btnLineWeight_3.setBounds(70, 5, 60, 25);

        toolBar.add(btnLineWeight_1);
        toolBar.add(btnLineWeight_3);


    }
}
