package Apps.CanvasVectorBeta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class RTopCentre extends JPanel implements MouseMotionListener, MouseListener
{
    private PanelFigures panelFigures;
    int mY;

    public RTopCentre(PanelFigures panelFigures)
    {
        this.panelFigures = panelFigures;
        setLayout(null);
        setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
        setBackground(Color.YELLOW);
        setBounds(panelFigures.getWidth()/2 - 2, 0, 8, 8);
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
        int dY = e.getY() - mY;
        Point pp = panelFigures.getLocation();
        pp.translate(0,dY);
        panelFigures.setSize(panelFigures.getWidth(), mY - e.getY()  +  panelFigures.getHeight());
        panelFigures.setLocation(pp);
    }

    @Override
    public void mouseClicked(MouseEvent e){}
    @Override
    public void mouseMoved(MouseEvent e){}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e)  {}
}
