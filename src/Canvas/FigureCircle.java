package Canvas;


import java.awt.*;
import java.awt.event.MouseEvent;

public class FigureCircle extends FigureSelect
{
    FigureCircle(PaintPanel paintPanel)
    {
        super(paintPanel);
    }


    @Override
    public void mouseReleased(MouseEvent e)
    {
        lastX = e.getX();
        lastY = e.getY();
        Graphics2D g = (Graphics2D) paintFigurePanel.getGraphics();
        g.setColor(paintFigurePanel.data.col);
        g.setStroke(new BasicStroke(paintFigurePanel.data.lw));

        int width = Math.abs(firstX - lastX);
        int height = Math.abs(firstY - lastY);

        if (firstX < lastX && firstY < lastY)
        {
            g.drawOval(firstX, firstY, width, height);
        }
        else if (firstX > lastX && firstY > lastY)
        {
            g.drawOval(lastX, lastY, width, height);
        }
        else if (firstX < lastX && firstY > lastY)
        {
            g.drawOval(firstX, lastY, width, height);
        }
        else if (firstX > lastX && firstY < lastY)
        {
            g.drawOval(lastX, firstY, width, height);
        }
    }

}
