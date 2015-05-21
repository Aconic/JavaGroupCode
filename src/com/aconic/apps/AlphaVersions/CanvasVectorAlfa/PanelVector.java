package com.aconic.apps.AlphaVersions.CanvasVectorAlfa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PanelVector extends JPanel implements MouseListener, MouseMotionListener
{
    Data data;
    PanelFigs figures;

    public PanelVector(Data data)
    {
        this.data = data;
      //  data.list = new ArrayList<PanelFigs>();
        addMouseListener(this);
        setBounds(0, 0, 200, 600);
         setBackground(Color.GRAY.brighter());
        setLayout(null);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        super.paintComponent(g);
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        figures = new PanelFigs(data);
        figures.x = e.getX();
        figures.y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        figures.setX(e.getX());
        figures.setY(e.getY());
        figures.createBounds();
        add(figures);
       // data.list.add(0,figures);
        repaint();
       }

    @Override
    public void mouseDragged(MouseEvent mouseEvent)
    {

    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
