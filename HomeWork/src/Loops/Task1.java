package Loops;

import javax.swing.*;

/**
 * Найти сумму четных чисел от 1 до 99
 */
public class Task1
{
    public static void main(String[] args)
    {
        int n = 99;
        JOptionPane.showMessageDialog(null, "Сумма  = " + sumFunc(n));
    }

    static int sumFunc(int n)
    {
        int res = 0;

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
                res += i;
        }
        if (res > 0)
            return res;
        else throw new IllegalArgumentException();
    }

}
