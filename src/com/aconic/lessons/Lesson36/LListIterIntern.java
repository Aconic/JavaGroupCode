package com.aconic.lessons.Lesson36;

import java.util.Iterator;

public class LListIterIntern implements Iterator<Integer>
{
    LList1.Node p;

    public LListIterIntern(LList1.Node root)
    {
        p = root;
    }

    @Override
    public boolean hasNext()
    {
        return p != null;
    }

    @Override
    public Integer next()
    {
        int data = p.data;
        p = p.next;
        return data;
    }

    @Override
    public void remove()
    {}
}
