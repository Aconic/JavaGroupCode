package com.aconic.lessons.Lesson18;

/**
 * РЕКУРСИЯ
 */
public class Recursion
{
    public static void main(String[] args)
    {
        int[] ar = {1, 2, 3, 4, 5};
        int n = 4;
        int i = 0;
        String str = "Abcd";
        printArray(ar);
        System.out.println();
        printString(str);
        System.out.println();
        recAlhabet(65);

    }

    public static void printArray(int[] a)    //функция для пользователя, паблик
    {
        recPrintArray(a, 0);                    //0 - i-й элемент начала
    }

    private static void recPrintArray(int[] a, int i)     //функция для разработчика, приват, закрыта
    {
        if (i >= a.length)
        {
            return;
        }
        System.out.print(a[i]);
        recPrintArray(a, i + 1);
    }

    public static int factorial(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static int recFactorial(int n)
    {
        if (n == 1|| n==0)

        {
            return 1;
        }
        return n * recFactorial(n - 1);

    }

    public static void printString(String str)
    {
        recPrintString(str, 0);
    }

    private static void recPrintString(String str, int i)
    {
        if (i >= str.length())
        {
            return;
        }
        System.out.print(str.charAt(i));
        recPrintString(str, i + 1);
    }

    static int sumNumber(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int recSumNumber(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return n % 10 + recSumNumber(n / 10);
    }

    private static void recAlhabet(int start)     //вывод алфавита рекурсией
    {
        if (start >= 91)
        {
            if (start + 6 >= 123)
            {
                return;
            }
            System.out.print((char) (start + 6));
            recAlhabet(start + 1);
        }
        else
        {
            System.out.print((char) start);
            recAlhabet(start + 1);
        }
    }
}

