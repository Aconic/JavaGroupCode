package Canvas;

import java.awt.*;


public class DataSet
{
    int lw = 1;
    Color col = Color.BLACK;
    int x = 0;
    int y = 0;
    FigureSelect figureSelect = null;

    void setLineWidth(int lw)
    {
        this.lw = lw;
    }

    void setColor(Color col)
    {
        this.col = col;
    }

}
