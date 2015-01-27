package Canvas;


import java.awt.*;
import java.awt.event.MouseEvent;

public class FigureRectRounded extends FigureSelect
{
    FigureRectRounded(PaintPanel paintPanel)
    {
        super(paintPanel);
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {

        lastX = e.getX();
        lastY = e.getX();
        Graphics2D g = (Graphics2D) paintFigurePanel.getGraphics();
        g.setColor(paintFigurePanel.data.col);
        g.setStroke(new BasicStroke(paintFigurePanel.data.lw));
        int width = Math.abs(firstX - lastX);
        int height = Math.abs(firstY - lastY);

        if (firstX < lastX && firstY < lastY)
        {
            g.drawRect(firstX, firstY, width, height);
        }
        else if (firstX > lastX && firstY > lastY)
        {
            g.drawRect(lastX, lastY, width, height);
        }
        else if (firstX < lastX && firstY > lastY)
        {
            g.drawRect(firstX, lastY, width, height);
        }
        else if (firstX > lastX && firstY < lastY)
        {
            g.drawRect(lastX, firstY, width, height);
        }
    }
}
