package com.aconic.apps.Canvas;

import java.awt.*;
import java.awt.image.BufferedImage;


public class DataSet
{
    int lw = 1;
    Color col = Color.BLACK;
    int x = 0;
    int y = 0;
    BufferedImage img;
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
