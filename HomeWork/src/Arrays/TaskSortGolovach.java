package Arrays;

import java.util.Arrays;

/**
 * Date: 11.12.14 * Time: 23:19
 * To change this template use File | Settings | File Templates.
 */
public class TaskSortGolovach
{
    public static void main(String[] args)
    {
        int[] ar = {30, 10, 20, 50, 40};

        for (int index = 0; index < ar.length - 1; index++)
        {
            conditionalSwap(ar, index);
        }
        System.out.print(Arrays.toString(ar));
    }

    private static void conditionalSwap(int[] ar, int index)
    {
        if (ar[index] > ar[index + 1])
        {
            swap(ar, index);
        }
    }

    private static void swap(int[] ar, int index)
    {
        int tmp = ar[index];
        ar[index] = ar[index + 1];
        ar[index + 1] = tmp;
    }
}
