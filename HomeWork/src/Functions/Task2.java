package Functions;

import javax.swing.*;import javax.swing.JOptionPane;

import java.lang.Integer;import java.lang.String;import java.lang.System;import static javax.swing.JOptionPane.showMessageDialog;

public class Task2
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt((JOptionPane.showInputDialog(null, "Введите число")));
        JOptionPane.showMessageDialog(null, numString(n));
    }

    public static String numString(int n)
    {
        String[] strX = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] strXX = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
                "семнадцать", "восемнадцать", "девятнадцать"};
        String[] strX10 = {"", "десять ", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ",
                "восемьдесят ", "девяносто "};
        String[] strX100 = {"", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ", "шестьсот ", "семьсот ",
                "восемьсот ", "девятьсот "};
        String res = "";
        String space = " ";
        if (n > 99 && n % 100 == 0 && n != 0)
        {
            res = strX100[n / 100];
        }
        else if (n == 99)
        {
            res = strX10[n / 10] + strX[n % 10];
        }
        else if (n > 99 && n % 10 == 0 && n != 0)
        {
            res = strX100[n / 100] + strX10[(n / 10 % 10)];
        }
        else if (n > 99 && n % 100 <= 9 && n != 0)
        {
            res = strX100[n / 100] + strX[(n % 10)];
        }
        else if (n > 99 && n / 10 % 10 < 2 && n != 0)
        {
            res = strX100[n / 100] + strXX[(n / 10 % 10)];
        }
        else if (n > 99 && n != 0)
        {
            res = strX100[n / 100] + strX10[(n / 10 % 10)] + strX[n % 10];
        }
        else if (n % 10 == 0 && n != 0 && n < 99)
        {
            res = strX10[n / 10];
        }
        else if (n % 10 != 0 && n > 20 && n < 99)
        {
            res = strX10[n / 10] + strX[n % 10];
        }
        else if (n > 10 && n < 20)
        {
            res = strXX[n / 10];
        }
        else if (n == 0 || n < 10)
        {
            res = strX[n];
        }
         System.out.print(res);
        return res;
     }
}