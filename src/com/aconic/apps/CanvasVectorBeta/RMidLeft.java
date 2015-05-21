package com.aconic.apps.CanvasVectorBeta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class RMidLeft extends JPanel implements MouseMotionListener, MouseListener, SizeMoveListener
{
    int mX;
    int mY;
    PanelFigures panelFigures;

    public RMidLeft( PanelFigures panelFigures)
    {
        this.panelFigures = panelFigures;
        setLayout(null);
        setCursor(Cursor.getPredefinedCursor(Cursor.W_RESIZE_CURSOR));
        setBackground(Color.YELLOW);
        setBounds(0, panelFigures.getHeight() / 2 - 4, 8, 8);
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
        pp.translate(dX, 0);
        panelFigures.setSize(mX - e.getX() + panelFigures.getWidth(), panelFigures.getHeight());
        panelFigures.setLocation(pp);
     }

    @Override
    public void checkMove()
    {
        JPanel parent = (JPanel) getParent();
        this.setLocation(0, parent.getHeight()/2 - 4);
    }

    @Override
    public void mouseClicked(MouseEvent e){
    }
    @Override
    public void mouseMoved(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
    @Override
    public void mouseEntered(MouseEvent e) { }
    @Override
    public void mouseExited(MouseEvent e) {
    }

}
