package com.aconic.apps.CanvasVectorBeta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class RBotCentre extends JPanel implements MouseMotionListener, MouseListener,SizeMoveListener
{
    PanelFigures panelFigures;
    int mY;

    public RBotCentre(PanelFigures panelFigures)
    {
        this.panelFigures = panelFigures;
        setLayout(null);
        setCursor(Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
        setBackground(Color.YELLOW);
        setBounds(panelFigures.getWidth()/2 - 4, panelFigures.getHeight() - 8, 8, 8);
        addMouseMotionListener(this);
        addMouseListener(this);
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
        mY = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        panelFigures.setSize(panelFigures.getWidth(), e.getY() - mY +  panelFigures.getHeight());
    }

    @Override
    public void checkMove()
    {
        JPanel parent = (JPanel) getParent();
        this.setLocation(parent.getWidth()/2 - 4, parent.getHeight() - 8);
    }

    @Override
    public void mouseClicked(MouseEvent e)      {
    }
    @Override
    public void mouseMoved(MouseEvent e)        {
    }
    @Override
    public void mouseReleased(MouseEvent e)       {
    }
    @Override
    public void mouseEntered(MouseEvent e)      {
    }
    @Override
    public void mouseExited(MouseEvent e)      {
    }
}
