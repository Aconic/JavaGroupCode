package Conditions;

import javax.swing.*;
import java.util.Scanner;

public class Task1a
{
    public static void main(String[] args) throws Exception
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите первое число"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите второе число"));
        int res = count(a,b);
        JOptionPane.showMessageDialog(null, "Результат = "+ res);
    }

    public static int count(int a, int b)
    {
        int res = 0;
        if (a % 2 == 0)
        {
            res = a * b;
        }
        else
        {
            res = a + b;
        }
        return res;
    }


}
