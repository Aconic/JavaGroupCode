package com.aconic.lessons.Lesson36;

import com.aconic.lessons.Lesson17.ExList;

import java.util.Iterator;

/**
 * Связные списки - iterator
 */

public class LList1 implements ExList, Iterable<Integer>
{

    public class Node
    {
        int data;
        Node next = null;

        public Node(int val)
        {
            data = val;
        }
    }

    Node root = null; //переменная-ссылка, указывающая на первый элемент в списке(null - указывает что список пуст, его нет)
    boolean flagLength0 = false;

    @Override
    public Iterator<Integer> iterator()
    {
        return new LListIterIntern(root);
    }


    @Override
    public void init(int[] ar)
    {
        if (ar.length == 0)
        {
            addStart(0);
        }
        for (int i = ar.length - 1; i >= 0; i--)
        {
            addStart(ar[i]);
        }
    }

    @Override
    public int size()
    {
        int count = 0;
        Node tmp = root;
        while (tmp != null)
        {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    @Override
    public void clear()
    {
        root = null;
    }

    @Override
    public void addStart(int val)
    {
        if (flagLength0)
        {
            root.data = val;
            flagLength0 = false;
        } else
        {
            Node tmp = new Node(val);
            tmp.next = root;
            root = tmp;
        }
    }

    @Override
    public void addEnd(int val)
    {
        Node tmp = root;
        while (tmp.next != null)
        {
            tmp = tmp.next;
        }
        tmp.next = new Node(val);
    }

    @Override
    public void addPos(int pos, int val)
    {
        if (pos >= size() && !flagLength0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (flagLength0)
        {
            root.data = val;
            flagLength0 = false;
        }
        if(pos==0)
        {
            addStart(val);
        }
        else
        {
            Node tmp = root;
            Node tmpVal = new Node(val);
            for (int i = 1; i < pos; i++)
            {
                tmp = tmp.next;
            }
            tmpVal.next = tmp.next;
            tmp.next = tmpVal;
        }
    }

    @Override
    public void delStart()
    {
        if (size() == 0)
        {
            return;
        }
        root = root.next;
    }

    @Override
    public void delEnd()
    {
        if (size() == 0)
        {
            return;
        }
        Node tmp = root;
        Node tmpPrev = null;
        while (tmp.next != null)
        {
            tmpPrev = tmp;
            tmp = tmp.next;
        }
        tmpPrev.next = null;
    }

    @Override
    public void delPos(int pos)
    {
        Node tmp = root;
        Node tmpPrev = null;
        int i = 0;
        while (i < pos)
        {
            tmpPrev = tmp;
            tmp = tmp.next;
            i++;
        }
        tmpPrev.next = tmp.next;
    }

    @Override
    public int maxOfArray()
    {
        Node tmp = root;
        int res = root.data;
        while (tmp != null)
        {
            if (tmp.data > res)
            {
                res = tmp.data;
            }
            tmp = tmp.next;
        }
        return res;
    }

    @Override
    public int minOfArray()
    {
        Node tmp = root;
        int res = root.data;
        while (tmp != null)
        {
            if (tmp.data < res)
            {
                res = tmp.data;
            }
            tmp = tmp.next;
        }
        return res;
    }


    @Override
    public int indexOfMin()
    {
        if (size() == 0)
        {
            throw new IndexOutOfBoundsException();
        }
        int minVal = root.data;
        int minIndex = 0;
        int count = 0;
        Node tmp = root.next;
        while (tmp != null)
        {
            count++;
            if (tmp.data < minVal)
            {
                minIndex = count;
                minVal = tmp.data;
            }
            tmp = tmp.next;

        }
        return minIndex;
    }

    @Override
    public int indexOfMax()
    {
        if (size() == 0)
        {
            throw new IndexOutOfBoundsException();
        }
        int maxVal = root.data;
        int maxIndex = 0;
        int count = 0;
        Node tmp = root.next;
        while (tmp != null)
        {
            count++;
            if (tmp.data > maxVal)
            {
                maxIndex = count;
                maxVal = tmp.data;
            }
            tmp = tmp.next;

        }
        return maxIndex;
    }

    @Override
    public void reverse()
    {
        Node tmp = root;
        root = null;
        while (tmp != null)
        {
            addStart(tmp.data);
            tmp = tmp.next;
        }
    }

    @Override
    public void bubbleSort()
    {
        for (int i = size() - 1; i >= 1; i--)
        {
            boolean sorted = true;
            for (int j = 0; j < i; j++)
            {
                if (get(j) > get(j + 1))
                {
                    int temp = get(j);
                    set(j, get(j + 1));
                    set(j + 1, temp);
                    sorted = false;
                }
            }
            if (sorted)
            {
                break;
            }
        }
    }

    @Override
    public int[] toArray()
    {
        int[] ar;
        if (flagLength0)
        {
            ar = new int[0];
        }
        else
        {
            ar = new int[size()];
            Node tmp = root;
            int i = 0;
            while (tmp != null)
            {
                ar[i++] = tmp.data;
                tmp = tmp.next;
            }
        }
      return ar;
    }

    @Override
    public int[] getArray()
    {
        return new int[0];
    }

    @Override
    public void set(int pos, int val)
    {
        Node tmp = root;
        for (int i = 0; i < pos; i++)
        {
            tmp = tmp.next;
        }
        tmp.data = val;
    }

    @Override
    public int get(int pos)
    {
        Node tmp = root;
        int res = 0;
        int count = 0;
        while (tmp != null)
        {
            if (count == pos)
            {
                res = tmp.data;
            }
            tmp = tmp.next;
            count++;
        }
        return res;
    }

    @Override
    public void setArray(int[] a)
    {

    }



}

