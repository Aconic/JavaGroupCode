package Lesson6;

import java.util.Arrays;

public class Task2
{
    public static void main(String[] args)
    {
        int[] ar1 = {5, 4, 3};
        int[] ar2 = {12, 15};
        System.out.println(Arrays.toString(arrUn(ar1, ar2)));

    }

    public static int[] arrUn(int[] ar1, int[] ar2)
    {
        if (ar1 == null)
        {
            ar1 = new int[0];
        }
        if (ar2 == null)
        {
            ar2 = new int[0];
        }
        int[] arres = new int[ar1.length + ar2.length];
        for (int i = 0; i < arres.length; i++)
        {
            if (i < ar1.length)
            {
                arres[i] = ar1[i];
            } else
            {
                arres[i] = ar2[i - ar1.length];
            }
        }
        return arres;
    }
}
