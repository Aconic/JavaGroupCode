package Apps.CanvasVectorBeta;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PanelFigures extends JPanel implements MouseListener, MouseMotionListener, FocusListener, ComponentListener
{
    int mX;
    int mY;
    Data data;
    int check;
    int lw;
    Color color;

    ArrayList<SizeMoveListener> sml = new ArrayList<SizeMoveListener>();

    public PanelFigures(Data data)
    {
        this.data = data;
        this.check = data.check;
        this.lw = data.lw;
        this.color = data.color;
        setLayout(null);
        setOpaque(false);
        addMouseMotionListener(this);
        addMouseListener(this);
        addFocusListener(this);
        addComponentListener(this);
    }

    public void addSizeChangeListener(SizeMoveListener ss)
    {
        sml.add(ss);
    }

    public void SizeChangeAction()
    {
        for(SizeMoveListener s : sml )
        {
            s.checkMove();
        }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.setStroke(new BasicStroke(lw));

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
        repaint();
    }

    @Override
    public void focusGained(FocusEvent e)
    {
        setOpaque(true);
        setBackground(Color.lightGray);
        new RContainer(this);
        repaint();
    }

    @Override
    public void focusLost(FocusEvent e)
    {
        setOpaque(false);
        for(Component i: getComponents())
        {
            remove(i);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        sml.removeAll(sml);
        repaint();
    }

    @Override
    public void componentResized(ComponentEvent e)
    {
        SizeChangeAction();
    }

    @Override
    public void componentMoved(ComponentEvent e)
    {
        SizeChangeAction();
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
    }

    @Override
    public void mouseEntered(MouseEvent e){}
    @Override
    public void mouseExited(MouseEvent e){}
    @Override
    public void mouseMoved(MouseEvent e){}
    @Override
    public void mouseReleased(MouseEvent e){
    }



    @Override
    public void componentShown(ComponentEvent e)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void componentHidden(ComponentEvent e)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
