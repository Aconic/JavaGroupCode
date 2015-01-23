package Canvas;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public abstract class FigureSelect implements MouseListener,
        MouseMotionListener
{
    PaintPanel paintFigurePanel;
    int firstX;
    int firstY;
    int lastX;
    int lastY;

    FigureSelect(PaintPanel paintPanel)
    {
        paintFigurePanel = paintPanel;
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        firstX = e.getX();
        firstY = e.getY();
    }


    @Override
    public void mouseDragged(MouseEvent e)
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
    public void mouseClicked(MouseEvent e)
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
