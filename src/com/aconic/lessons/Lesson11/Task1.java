package com.aconic.lessons.Lesson11;

import java.util.Locale;
import java.util.StringTokenizer;

public class Task1
{
    public static void main(String[] args)
    {
        String str = "Hello";
        Locale loc = new Locale("fr-fr");
        System.out.println(str.concat(" me"));
        System.out.println(str.toLowerCase());
        StringTokenizer tokenizer = new StringTokenizer(" ");
        System.out.println(str.replace('e', 'a'));


        for (char i = '0'; i <= '9'; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'а'; i <= 'я'; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        for (char i = 'a'; i <= 'z'; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'Я'; i >= 'А'; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 90; i >= 65; i--)
        {
            System.out.print((char) i + " ");
        }
    }
}