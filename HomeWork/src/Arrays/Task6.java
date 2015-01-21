package Arrays;

import java.util.Arrays;

/**
Сделать реверс массива
 */
public class Task6 {

    int[] ArrayReverse(int[] mas)
    {

        int tmp = 0;
        for (int i = 0; i < (mas.length)/2; i++)
        {
            tmp = mas[i];
            mas[i] = mas [mas.length-1-i];
            mas [mas.length-1-i] = tmp;
         }

        return mas;
    }
}