package com.aconic.lessons.Lesson7;

public class Task3
{
    public static void main(String[] args)
    {
        for (int i = 30; i <= 70; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println(divide_2());
        System.out.println(divide_35());
        System.out.println(sum_divide2());
        System.out.println(sum_divide7());
        System.out.println(digCount(0));
        System.out.println(digCount_2(0));
        System.out.println(digCount_3(0));
    }

    static int divide_2()
    {
        int count = 0;
        for (int i = 30; i <= 70; i++)
        {
            if (i % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }

    static int divide_35()
    {
        int count = 0;
        for (int i = 30; i <= 70; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                count++;
            }
        }
        return count;
    }

    static int sum_divide2()
    {
        int sum = 0;
        for (int i = 30; i <= 70; i++)
        {
            if (i % 2 == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

    static int sum_divide7()
    {
        int sum = 0;
        for (int i = 30; i <= 70; i++)
        {
            if (i % 7 == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

    static int digCount(int n)
    {
        int count = 0;
        if (n == 0)
        {
            count = 1;
        }
        while (n != 0)
        {
            count++;
            n = n / 10;
        }

        return count;
    }

    static int digCount_2(int n)
    {
        int count = 0;
        if (n == 0)
        {
            count = 1;
        }
        for (; n != 0; )
        {

            n /= 10;
            count++;
        }
        return count;
    }

    static int digCount_3(int n)
    {
        int count = 0;

        do
        {
            count++;
            n = n / 10;
        }
        while (n != 0);

        return count;
    }
}
