package Lesson36;

import java.util.Iterator;

public class TreeIterIntern implements Iterator
{
    TreeList.Node current;


    public TreeIterIntern(TreeList.Node root)
    {
        current = root;
    }

    @Override
    public boolean hasNext()
    {
        return current != null;
    }

    @Override
    public Object next()
    {
        while (current != null)
        {
            current = current.left;
        }
        TreeList.Node node = current;
        if (current.right != null)
        {
            current = current.right;
        }
        return node;
    }

    @Override
    public void remove()
    {
    }
}
