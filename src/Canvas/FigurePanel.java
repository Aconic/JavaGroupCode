package Canvas;

import javax.swing.*;
import java.awt.*;

public class FigurePanel extends JPanel
{
    Command cmd = null;
    JButton btnRect = null;
    JButton btnCircle = null;
    JButton btnPen = null;

    FigurePanel(Command cmd)
    {
        setBackground(Color.red.darker());
        setLayout(null);
        btnPen = new JButton("Pen");
        btnRect = new JButton("Rect");
        btnCircle = new JButton("Circle");

        btnPen.setBounds(10, 20, 80, 25);
        btnRect.setBounds(10, 50, 80, 25);
        btnCircle.setBounds(10, 80, 80, 25);

        add(btnPen);
        add(btnRect);
        add(btnCircle);

        btnPen.addActionListener(cmd.penCommand);
        btnRect.addActionListener(cmd.rectangleCommand);
        btnCircle.addActionListener(cmd.circleCommand);

     }
}
