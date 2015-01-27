package Lesson6;

import java.util.Arrays;

public class Task1
{
  public static void main (String[] args)
{
    int [] ar = {1, 4, 6, 7,8};
    System.out.print(Arrays.toString(showAr(ar)));
}

    public static int[] showAr(int []ar)
    {
        if (ar == null)
        {
         ar = new int[0];
        }
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i]%2 ==0)
            {
                ar[i] = 0;
            }

        }
        return ar;
    }


}