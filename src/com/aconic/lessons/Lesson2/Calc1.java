package com.aconic.lessons.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
Калькулятор
 */
public class Calc1
{

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        String c = in.readLine();
        int b = Integer.parseInt(in.readLine());
        int res = calc(a,c,b);
        System.out.print(res);
    }
    static int calc (int a, String op,  int b)
    {
        int res = 0;
        if (op.equals("+"))
        {
         res = a + b;
        }
       else if (op.equals("-"))
        {
            res = a - b;
        }
        else if (op.equals("/"))
        {
            res = a/b;
        }
        else if (op.equals("*"))
        {
            res = a*b;
        }
        return res;
    }
}
