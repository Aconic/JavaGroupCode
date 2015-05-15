package Apps.CanvasVectorAlfa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PanelFigs extends JPanel implements MouseListener, MouseMotionListener

{
    int x = 0;
    int y = 0;
    int height = 0;
    int width = 0;

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getxDelta()
    {
        return xDelta;
    }

    public void setxDelta(int xDelta)
    {
        this.xDelta = xDelta;
    }

    public int getyDelta()
    {
        return yDelta;
    }

    public void setyDelta(int yDelta)
    {
        this.yDelta = yDelta;
    }

    public int getDataCheck()
    {
        return dataCheck;
    }

    public void setDataCheck(int dataCheck)
    {
        this.dataCheck = dataCheck;
    }

    int xDelta = 0;
    int yDelta = 0;
    Data data;
    int dataCheck;

    public PanelFigs()    {        }

    public PanelFigs(Data data)
    {
        this.data = data;
        dataCheck = data.check;
        addMouseListener(this);
        addMouseMotionListener(this);
        setOpaque(false);
    }

    public void setX(int lastX)
    {
        width = Math.abs(x - lastX);
        if (x > lastX)
        {
            x = lastX;
        }
    }

    public void setY(int lastY)
    {
        height = Math.abs(y - lastY);
        if (y > lastY)
        {
            y = lastY;
        }
    }

    public void createBounds()
    {
        setBounds(x, y, width, height);
        setBackground(Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
      //  super.paintComponent(g);
       // int dataCheck = 1;
        g.setColor(Color.yellow);
       switch (dataCheck)
        {
            case 1:
                g.drawRect(1, 1, getWidth() -2, getHeight() - 2);
                System.out.println("qwee");
                break;
            case 2:
                g.drawOval(0, 0, getWidth()-1, getHeight()-1);
                break;

            case 3:
                g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, getWidth() / 2, getHeight() / 2);
                break;
            case 4:
                g.drawLine(0, 0, getWidth(), getHeight());
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        x += e.getX() - xDelta;
        y += e.getY() - yDelta;
        setBounds(x, y, width, height);
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        xDelta = e.getX();
        yDelta = e.getY();
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e)
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


    @Override
    public void mouseMoved(MouseEvent e)
    {

    }
}

