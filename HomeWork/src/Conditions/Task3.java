package Conditions;

import java.util.Scanner;

/**
 * Найти суммы положительных из трех чисел
 */
public class Task3
{
    public void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.print(Sum(a, b, c));
    }

    public int Sum(int a, int b, int c)
    {
        int res = 0;
        if (a > 0)
        {
            res += a;
        }
        if (b > 0)
        {
            res += b;
        }
        if (c > 0)
        {
            res += c;
        }

        return res;
    }
}
