package Loops;
/**
 Циклы.
 Проверить простое ли число.
 */

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        int n = 7;
        if (DigitCheck(n) == 0)
        {
            System.out.print("Число - простое");
        } else
        {
            System.out.print("Число не является простым");
        }
    }

    public static int DigitCheck(int n)
    {

        int count = 0;
        if (n == 0)
        {
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <= n/2; i++)
        {

            if (n % i == 0)
            {
                count++;
            }
        }
        if (count <= 2)
        {
            return 0;

        } else
        {
            return 1;
        }

    }
}
