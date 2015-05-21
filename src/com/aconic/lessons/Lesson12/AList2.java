package com.aconic.lessons.Lesson12;

/**
 * Функции для работы с массивами Index
 */

public class AList2 implements ExList
{
    private int[] ar = new int[100];
    private int front = ar.length / 2;
    private int rear = front;

    @Override
    public void setArray(int[] a)
    {
        init(a);
    }

    @Override
    public void init(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            ar[rear++] = a[i];
        }
    }

    @Override
    public int size()
    {
        return (rear - front);
    }

    @Override
    public void clear()
    {
        rear = front;
    }

    //функции возращения массива- в массив, в строку
    @Override
    public int[] toArray()
    {
        int[] arMod = new int[size()];
        for (int i = 0; i < size(); i++)
        {
            arMod[i] = ar[front + i];
        }
        return arMod;
    }

    @Override
    public int[] getArray()
    {
        return new int[rear - front];
    }

    @Override
    public void set(int pos, int val)
    {
        if ((size()) == 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        ar[front + pos] = val;
    }

    @Override
    public int get(int pos)
    {
        if ((size()) == 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        return ar[front + pos];
    }

    @Override
    public String toString()     //массив в строку
    {
        String str = "";
        for (int i = 0; i < size(); i++)
        {
            str += ar[front + i] + ", ";
        }
        return str;
    }

    @Override
    public void addStart(int val)
    {

        ar[--front] = val;
    }

    @Override
    public void addEnd(int val)
    {
        ar[rear++] = val;
    }

    @Override
    public void addPos(int pos, int val)
    {
        rear++;
        int i = rear;
        while (i > front + pos)
        {
            ar[i] = ar[i - 1];
            i--;
        }
        ar[front + pos] = val;
    }

    @Override
    public void delStart()
    {
        if (size() == 0)
        {
            throw new NegativeArraySizeException();
        }
        front++;
    }

    @Override
    public void delEnd()
    {
        if (size() == 0)
        {
            throw new NegativeArraySizeException();
        }
        rear--;
    }

    @Override
    public void delPos(int pos)
    {
        if (size() == 0)
        {
            throw new NegativeArraySizeException();
        }
        for (int i = pos; i < size(); i++)
        {
            ar[front + i] = ar[front + i + 1];
        }
        rear--;
    }

    @Override
    public int maxOfArray()
    {
        if (front == 0)
        {
            throw new IllegalArgumentException();
        }
        int max = ar[front];
        for (int i = 0; i < size(); i++)
        {
            if (ar[front + i] >= max)
            {
                max = ar[front + i];
            }
        }
        return max;
    }

    @Override
    public int minOfArray()
    {
        if (size() == 0)
        {
            throw new NullPointerException();
        }
        int res = ar[front];
        for (int i = 0; i < size(); i++)
        {
            if (ar[front + i] < res)
            {
                res = ar[front + i];
            }
        }
        return res;
    }

    @Override
    public int indexOfMin()
    {
        if (size() == 0)
        {
            throw new NullPointerException();
        }
        int res = 0;
        for (int i = 0; i < size(); i++)
        {
            if (ar[front + i] < ar[front])
            {
                res = i;
            }
        }
        return res;
    }

    @Override
    public int indexOfMax()     //индекс максимума
    {
        if (size() == 0)
        {
            throw new NullPointerException();
        }
        int indRes = 0;
        int elMax = ar[front];
        for (int i = 0; i < size(); i++)
        {
            if (ar[front + i] > elMax)
            {
                elMax = ar[front + i];
                indRes = i;
            }
        }
        return indRes;
    }

    @Override
    public void reverse()        //reverse
    {
        int[] rev = new int[size()];
        for (int i = size() - 1, j = 0; i >= 0; i--, j++)
        {
            rev[j] = ar[front + i];
        }
        clear();
        init(rev);
    }

    @Override
    public void bubbleSort()
    {
        int tmp = 0;
        for (int j = 0; j < size()-1; j++)
        {
            for (int i = 0; i < size()-j-1; i++)
            {
                if (ar[front + i] >= ar[front + i + 1])
                {
                    tmp = ar[front + i];
                    ar[front + i] = ar[front + i + 1];
                    ar[front + i + 1] = tmp;
                }
            }
        }
    }
}

