package Apps.CanvasVectorBeta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class RBotRight extends JPanel implements MouseMotionListener, MouseListener, SizeMoveListener
{
    int mX;
    int mY;
    PanelFigures panelFigures;

    public RBotRight(PanelFigures panelFigures)
    {
        this.panelFigures = panelFigures;
        setLayout(null);
        setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));
        setBackground(Color.YELLOW);
        setBounds(panelFigures.getWidth() - 8, panelFigures.getHeight() - 8, 8, 8);
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
        panelFigures.setSize(e.getX() - mX + panelFigures.getWidth(), e.getY() - mY + panelFigures.getHeight());
    }

    @Override
    public void checkMove()
    {
        JPanel parent = (JPanel) getParent();
        this.setLocation(parent.getWidth() - 8, parent.getHeight() - 8);
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