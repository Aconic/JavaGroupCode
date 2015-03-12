package Apps.CanvasVectorBeta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class RTopLeft extends JPanel implements MouseMotionListener, MouseListener
{
    int mX;
    int mY;
    PanelFigures panelFigures;

    public RTopLeft(PanelFigures panelFigures)
    {
        this.panelFigures = panelFigures;
        setLayout(null);
        setCursor(Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR));
        setBackground(Color.BLACK);
        setBounds(0, 1, 8, 8);
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        mX = e.getX();
        mY = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        Point pp = panelFigures.getLocation();
        int dX = e.getX() - mX;
        int dY = e.getY() - mY;
        pp.translate(dX, dY);
        panelFigures.setSize(mX- e.getX() + panelFigures.getWidth(), mY - e.getY()+ panelFigures.getHeight());
        panelFigures.setLocation(pp);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
    }

    @Override
    public void mouseReleased(MouseEvent e)
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

