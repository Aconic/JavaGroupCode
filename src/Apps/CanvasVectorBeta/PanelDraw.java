package Apps.CanvasVectorBeta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelDraw extends JPanel implements MouseListener
{
    PanelFigures pFigs;
    Data data;
    int check;
    int x;
    int y;

    public PanelDraw(Data data)
    {
        this.data = data;
        this.check = data.check;
        setLayout(null);
        addMouseListener(this);
        setBackground(Color.white.darker());

    }

      @Override
    public void mousePressed(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        pFigs = new PanelFigures(data);
     }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        pFigs.setBounds(x, y, e.getX() - x, e.getY() - y);
        this.add(pFigs);
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
    }
}
