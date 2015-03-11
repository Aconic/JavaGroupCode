package Lesson36;

import java.util.Iterator;

public class TreeIterExtern implements Iterator
{
    TreeList.Node current;


    public TreeIterExtern(TreeList.Node root)
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
        current = current.right;
        return node;
    }

    @Override
    public void remove() {}
}
