package Loops;

/**
 Вычислить факториал числа
 */

import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(Factor(n));
    }

    public static int Factor(int n)
    {
        int fact = 20;
        if (n < 0)
        {
            throw new IllegalArgumentException();
        }

        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }
}
