package Lesson17;

/**
 * ООП подход. Функции для работы с массивами
 */
public class AList0
{
    private int[] ar = {};

    public void setArray(int[] a)
    {
        init(a);
    }

    public void init(int[] a)
    {
        if (a == null || a.length == 0)
        {
            ar = new int[0];
            return;
        }
        int[] tmp = new int[a.length];
        for (int i = 0; i < a.length; i++)
        {
            tmp[i] = a[i];
        }
        ar = tmp;
    }

    //функции возращения массива- в массив, в строку
    public int[] toArray()
    {
        int[] arMod = new int[ar.length];
        for (int i = 0; i < ar.length; i++)
        {
            arMod[i] = ar[i];
        }
        return arMod;
    }

    public int[] getArray()
    {
        return this.toArray();
    }

    @Override
    public String toString()     //массив в строку
    {
        String str = "";
        for (int i = 0; i < ar.length; i++)
        {
            str += ar[i] + ", ";
        }
        return str;
    }
    ///

    public int maxOfArray()
    {
        if (ar == null || ar.length == 0)
        {
            throw new IllegalArgumentException();
        }
        int max = ar[0];
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] >= max)
            {
                max = ar[i];
            }
        }
        return max;
    }

    public int minOfArray()
    {
        if (ar.length == 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        int res = ar[0];
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] < res)
            {
                res = ar[i];
            }
        }
        return res;
    }

    public int indexOfMax()
    {
        if (ar.length == 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }

        int res = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] > ar[res])
            {
                res = i;
            }
        }
        return res;
    }

    public int indexOfMin()
    {
        if (ar.length == 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        int res = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] < ar[res])
            {
                res = i;
            }
        }
        return res;
    }

    void reverse()
    {
        if (ar.length == 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        int tmp = 0;
        for (int i = 0; i < (ar.length) / 2; i++)
        {
            tmp = ar[i];
            ar[i] = ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = tmp;
        }
    }

    void BubbleSort()
    {
        if (ar.length == 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        int tmp = 0;
        for (int j = 0; j < ar.length; j++)
        {
            for (int i = 0; i < ar.length - 1; i++)
            {
                if (ar[i] >= ar[i + 1])
                {
                    tmp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = tmp;
                }
            }
        }
    }

    void addEnd(int val)
    {
        int[] addAr = new int[ar.length + 1];

        for (int i = 0; i < ar.length; i++)
        {
            addAr[i] = ar[i];
        }
        addAr[addAr.length - 1] = val;
        ar = addAr;
    }

    void delEnd()
    {
        if (ar.length == 0)
        {
            throw new NullPointerException();
        }
        int[] delAr = new int[ar.length - 1];

        for (int i = 0; i < delAr.length; i++)
        {
            delAr[i] = ar[i];
        }

        ar = delAr;
    }

    void addStart(int val)
    {
        int[] addAr = new int[ar.length + 1];

        addAr[0] = val;
        for (int i = 0; i < ar.length; i++)
        {
            addAr[i + 1] = ar[i];
        }
        ar = addAr;
    }

    void delStart()
    {
        if (ar.length == 0)
        {
            throw new IndexOutOfBoundsException();
        }
        int[] addAr = new int[ar.length - 1];

        for (int i = 0; i < addAr.length; i++)
        {
            addAr[i] = ar[i + 1];
        }
        ar = addAr;
    }

    void addPos(int pos, int val)
    {
        int[] addAr = new int[ar.length + 1];
        if (pos > ar.length - 1)
        {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < ar.length; i++)
        {
            if (i < pos)
            {
                addAr[i] = ar[i];
            }
            else
            {
                addAr[i + 1] = ar[i];
            }
        }
        addAr[pos] = val;
        ar = addAr;
    }

    void delPos(int pos)
    {
        int[] delAr = new int[ar.length - 1];
        if (pos > ar.length - 1)
        {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < delAr.length; i++)
        {
            if (i < pos)
            {
                delAr[i] = ar[i];
            }
            else
            {
                delAr[i] = ar[i + 1];
            }
        }
        ar = delAr;
    }

    void set(int pos, int val)
    {
        if (pos > ar.length - 1)
        {
            throw new IndexOutOfBoundsException();
        }
        ar[pos] = val;
    }

    int get(int pos)
    {
        if (pos > ar.length - 1)
        {
            throw new IndexOutOfBoundsException();
        }
        return ar[pos];
    }
}

