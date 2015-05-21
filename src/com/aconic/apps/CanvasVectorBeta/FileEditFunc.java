package com.aconic.apps.CanvasVectorBeta;


import java.awt.*;

public class FileEditFunc
{
    Data data;

    FileEditFunc(Data data)
    {
        this.data = data;
    }

    public void setLw(int lw)
    {
        data.lw = lw;
    }

    public void setColor(Color c)
    {
        data.color = c;
    }
}
