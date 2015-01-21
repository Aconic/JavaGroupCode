package Conditions;


import javax.swing.*;



import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Task1b
{
    public static void main(String[] args) throws Exception
    {

        JFrame frame = new JFrame("");
        JPanel panel = new JPanel();
        panel.add(new JTextField(10));
        panel.add(new JLabel("Число 1"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("Число 2"));
        panel.add(new JButton("Посчитать"));
        JOptionPane.showMessageDialog(null,panel);
             //  int a = panel.add(JOptionPane(null,"введите число"));
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

