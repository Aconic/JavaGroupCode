package Functions;

import javax.swing.*;

import java.util.Arrays;

public class Task3
{
    public static void main(String[] args)
    {
        String userStr = JOptionPane.showInputDialog(null, "Число прописью:");
        userStr = userStr.toLowerCase();
        JOptionPane.showMessageDialog(null, stringToNum(userStr));
        System.out.print(stringToNum(userStr));
    }

    public static int stringToNum(String userStr)
    {
        int num = 0;
        String[] userStrAr = userStr.trim().split("\\s");
        String[] strX = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] strXX = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
                "семнадцать", "восемнадцать", "девятнадцать"};
        String[] strX10 = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
                "восемьдесят", "девяносто"};
        String[] strX100 = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
                "восемьсот", "девятьсот"};

        for (int i = 1; i < strX.length; i++)
        {
            for (int j = 0; j < userStrAr.length; j++)
            {
                if (userStrAr[j].equals(strX100[i]))
                {
                    num += i * 100;
                }
                if (userStrAr[j].equals(strX10[i]))
                {
                    num += i * 10;
                }
                if (userStrAr[j].equals(strXX[i]))
                {
                    num += i + 10;
                }
                if (userStrAr[j].equals(strX[i]))
                {
                    num += i;
                }
              }
          }
        if (userStr.equals(""))
        {
            throw new IllegalArgumentException();
        }
        else
        {
            return num;
        }
    }
}
