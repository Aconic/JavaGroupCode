package Lesson36;

import java.util.Iterator;


public class AListIterExtern implements Iterator<Integer>
{
    int index = 0;
    int[] arr;

    public AListIterExtern(int[] arr)
    {
        this.arr = arr;
    }

    @Override
    public boolean hasNext()
    {

        return index < arr.length;
    }

    @Override
    public Integer next()
    {
        return arr[index++];
    }

    @Override
    public void remove()
    {

    }
}


