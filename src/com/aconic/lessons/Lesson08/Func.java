package com.aconic.lessons.Lesson08;


public class Func
{
        static int calc (int a, int b, String op)
        {
            int res = 0;
            if (op.equals("+"))
            {
                res = a + b;
            }
            else if (op.equals( "-"))
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
