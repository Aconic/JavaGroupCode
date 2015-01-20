package Lesson18;

import java.util.Arrays;

public class Sort
{
    public static void main(String[] args)
    {
        int[] a = {2, 3, 6, 8};
        int[] b = {1, 5, 10, 11};
        int[] res = new int[a.length + b.length];
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        while (a1 + b1 != res.length-1)
        {
            if (a[a1] < b[b1])
            {
             res[c1] = a[a1]; a1++;
            }
            else
            { res[c1] = b[b1];

            }
            b1++;
            c1++;
        }


    System.out.println(Arrays.toString(res));


}
}
