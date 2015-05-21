package com.aconic.lessons.Lesson36;

import java.util.Iterator;

public class AListIterIntern implements Iterator<Integer>
{
    int index=0;
    int [] arr;
    int top=0;

    public AListIterIntern(int[] arr, int index)
    {
        this.arr =arr;
        top = index;
    }

    @Override
    public boolean hasNext()
    {
        return index<top;
    }

    @Override
    public Integer next()
    {
        return arr[index++];
    }

    @Override
    public void remove()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}


