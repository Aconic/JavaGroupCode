package com.aconic.lessons.Lesson2;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 19.10.14
 * Time: 16:41
 * To change this template use File | Settings | File Templates.
 */
public class Task4 {

    public static void main (String [] args)
    {
        int count =0, count2 = 0;
        for(int i = 7; i >=1; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i <= 20; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = -10; i <=10; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 20; i <=50; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1; i <= 100; i+=7)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();

        for(int i = 1; i <= 100; i++)
        {
           if (i%2 == 0)
           {
               System.out.print(i + " ");
               count++;
           }
        }
        System.out.println();
        System.out.println(count);
        for(int i = 1; i <= 100; i++)
        {
            if (i%3 == 0 && i%5==0 )
            {
                System.out.print(i + " ");

            }
        }
    }
}
