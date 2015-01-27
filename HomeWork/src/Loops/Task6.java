package Loops;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.rint;

import javax.swing.*;

/**
 * Вывести зеркальное отображение числа
 */

public class Task6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(JOptionPane.showInputDialog("Введите число"));
        int usernum = in.nextInt();
        NumReverse(usernum);
        JOptionPane.showMessageDialog(null, NumReverse(usernum));
    }

    static int NumReverse(int usernum)
    {
        int tmp = 0;
        if (usernum < 0)
        {
            throw new IllegalArgumentException();
        }
        while (usernum > 0)
        {
            tmp = tmp * 10 + usernum % 10;
            usernum /= 10;
        }
        return tmp;
    }
}


