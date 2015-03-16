package Lesson36;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TreeIntern implements Iterator<Integer>
{
    TreeList.Node current;

    public TreeIntern(TreeList.Node root)
    {
        current = root;
        if (current == null)
        {
            return;
        }
        while (current.left != null)
            current = current.left;
    }

    public boolean hasNext()
    {
        return current != null;
    }

    public Integer next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        TreeList.Node root = current;
        // if you can walk right, walk right, then fully left.
        // otherwise, walk up until you come from left.
        if (current.right != null)
        {
            current = current.right;
            while (current.left != null)
                current = current.left;
            return root.value;
        }
        else
        {
            while (true)
            {
                if (current.parent == null)
                {
                    current = null;
                    return root.value;
                }
                if (current.parent.left == current)
                {
                    current = current.parent;
                    return root.value;
                }
                current = current.parent;
            }
        }
    }


    @Override
    public void remove()
    {
    }
}
