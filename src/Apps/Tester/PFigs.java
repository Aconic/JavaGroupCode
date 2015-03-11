package Apps.Tester;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class PFigs extends JPanel implements MouseListener, MouseMotionListener
{
    int mX;
    int mY;
    int deltaX;
    int deltaY;
    int type = 2;

    public PFigs()
    {
        setLayout(null);
        setBackground(Color.BLUE);
        //setOpaque(true);
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(Color.yellow);
        switch(type)
        {
            case 1: gg.drawRect(1, 1, getWidth()-2, getHeight()-2); break;
            case 2: gg.drawOval(1, 1, getWidth()-2, getHeight()-2); break;
            case 3: gg.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 50, 50); break;
            case 4: gg.drawLine(1, 1, getWidth() - 2, getHeight() - 2); break;
        }
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
        int dx = e.getX() - mX;
        int dy = e.getY() - mY;
        Point pp = getLocation();
        pp.translate(dx, dy);
        setLocation(pp);
    }



    public String toJSONString()
    {
        String str = "{";
        str += "\"x\":" + getX() + ", ";
        str += "\"y\":" + getY() + ", ";
        str += "\"w\":" + getWidth() + ", ";
        str += "\"h\":" + getHeight() + ", ";
        str += "\"type\":" + type;
        str += "}";
        return str;
    }

    public void fromJSONString(String str)
    {
        if(str.charAt(str.length()-1) == '}')
        {
            str = str.substring(0, str.length() - 1);
        }

        String[] pp = str.split(",");
        String t = pp[0].split(":")[1];
        int x = Integer.parseInt(t);
        t = pp[1].split(":")[1];
        int y = Integer.parseInt(t);
        t = pp[2].split(":")[1];
        int w = Integer.parseInt(t);
        t = pp[3].split(":")[1];
        int h = Integer.parseInt(t);
        t = pp[4].split(":")[1];
        this.type = Integer.parseInt(t);
        setBounds(x, y, w, h);
    }


    @Override
    public void mouseReleased(MouseEvent e){}
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e){}
    @Override
    public void mouseExited(MouseEvent e){}
    @Override
    public void mouseMoved(MouseEvent e){}
}
