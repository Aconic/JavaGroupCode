package Apps.Canvas;

import java.awt.*;
import java.awt.event.MouseEvent;


public class FigurePen extends FigureSelect
    {

        public FigurePen(PaintPanel paintPanel)
        {
            super(paintPanel);
        }


        @Override
        public void mouseDragged(MouseEvent e)
        {
            Graphics2D g = (Graphics2D) paintFigurePanel.getGraphics();
            g.setColor(paintFigurePanel.data.col);
            g.setStroke(new BasicStroke(paintFigurePanel.data.lw));
            g.drawLine(firstX, firstY, e.getX(), e.getY());
            firstX = e.getX();
            firstY = e.getY();
        }
    }

