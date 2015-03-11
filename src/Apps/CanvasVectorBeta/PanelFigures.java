package Apps.CanvasVectorBeta;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelFigures extends JPanel implements MouseListener, MouseMotionListener, FocusListener
{

    int mX;
    int mY;
    Data data;
    int check;

    public PanelFigures(Data data)
    {
        this.data = data;
        this.check = data.check;
        setLayout(null);
        setOpaque(false);
        addMouseMotionListener(this);
        addMouseListener(this);
        addFocusListener(this);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(data.color);
        g2.setStroke(new BasicStroke(data.lw));

        switch (check)
        {
            case 1:
                g2.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
                break;
            case 2:
                g2.drawOval(1, 1, getWidth() - 2, getHeight() - 2);
                break;
            case 3:
                g2.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 50, 50);
                break;
            case 4:
                g2.drawLine(1, 1, getWidth() - 2, getHeight() - 2);
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        requestFocus();
        setFocusable(true);
        mX = e.getX();
        mY = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        int dx = e.getX() - mX;
        int dy = e.getY() - mY;
        Point pp = getLocation();
        pp.translate(dx, dy);
        setLocation(pp);
    }

    @Override
    public void focusGained(FocusEvent e)
    {
        setOpaque(true);
        setBackground(Color.lightGray);
        new ResizablePanel(this);
        repaint();
    }

    @Override
    public void focusLost(FocusEvent e)
    {
        setOpaque(false);
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

    }



    @Override
    public void mouseExited(MouseEvent e)
    {   }

    @Override
    public void mouseMoved(MouseEvent e)
    {    }

    @Override
    public void mouseReleased(MouseEvent e)
    {    }
}
