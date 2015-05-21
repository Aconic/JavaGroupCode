package com.aconic.apps.BallsBeta;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PanelBall extends JPanel implements MouseListener, MouseMotionListener, FocusListener, ComponentListener
{
    Data data;
    int lw;
    Color color;

    public PanelBall()
        {}

    public PanelBall(Data data)
    {
        this.data = data;
        this.lw = data.lw;
        setBallColor();

        setLayout(null);
        setOpaque(false);
        addMouseMotionListener(this);
        addMouseListener(this);
        addFocusListener(this);
        addComponentListener(this);
    }

    public void setBallColor()
    {
        float hue = (float) Math.random();
        int rgb = Color.HSBtoRGB(hue,1,1);
        color = new Color(rgb);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.setStroke(new BasicStroke(lw));
        g2.fillOval(1, 1, 30, 30);
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        data.ball = new Ball(this);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
    }

    @Override
    public void focusGained(FocusEvent e)
    {
     }

    @Override
    public void focusLost(FocusEvent e)
    {

    }

    @Override
    public void componentResized(ComponentEvent e)
    {

    }

    @Override
    public void componentMoved(ComponentEvent e)
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
    @Override
    public void mouseMoved(MouseEvent e)
    {

    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
    @Override
    public void componentShown(ComponentEvent e)  {

    }
     @Override
    public void componentHidden(ComponentEvent e) {

    }
}
