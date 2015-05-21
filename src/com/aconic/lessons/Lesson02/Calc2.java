package com.aconic.lessons.Lesson02;

import javax.swing.*;

/**
 * Калькулятор через Swing-консоль
 */
public class Calc2
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите первое число "));
        String s = JOptionPane.showInputDialog(null, "Действие над числами ");
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите второе число "));
        int res = Calc1.calc(a, s, b);
        JOptionPane.showMessageDialog(null, res+"");
    }
}

