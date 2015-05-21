package com.aconic.lessons.Lesson02;


/**
 * Определить к какой четверти принадлежит точка
 */
public class Task1 {
    public static void main (String[] args)
    {
        int a = -34, b  = 160, fin = 0;

        fin =  coord(a, b);
    }

    public static int coord(int x, int y)
    {
        int res= 0;
        if(x > 0)
        {
            if(y >= 0)
            {
                res = 1;
            }
            res = 2;
        }

        else if (x < 0)
        {
            if(y >=0)
            {
                res = 4;
            }
            else res = 3;
        }
        return res;
    }

}

