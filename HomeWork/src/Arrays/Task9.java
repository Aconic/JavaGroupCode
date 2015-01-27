package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Сортировка пузырьком
 */
public class Task9
{
     void BubbleSort()
    {
        int[] mas = new int[]{3, 2, 5, 4};
        int tmp = 0;
        for (int j =0; j < mas.length;j++)
        {
        for (int i = 0; i < mas.length - i - 1; i++)
        {
            if (mas[i] >= mas[i + 1])
            {
                tmp = mas[i + 1];
                mas[i + 1] = mas[i];
                mas[i] = tmp;
            }
        }
        }
        System.out.println("Пузырек");
        System.out.println(Arrays.toString(mas));
    }

    static void SelectSort()                             //Выбором
    {
        int[] mas = new int[]{3, 2, 5, 4};
        int indexMax = 0;
        int tmp = 0;
        for (int i = 0; i < mas.length - 1; i++)        // поиск индекса макс элемента
        {

            if (mas[i] >= mas[i + 1])
            {
                indexMax = i;
            }
            else
            {
                indexMax = i + 1;
            }
        }
        tmp = mas[mas.length - 1];
        mas[mas.length - 1] = mas[indexMax];
        mas[indexMax] = tmp;
        for (int i = 0; i < mas.length - 1 - 1; i++)        // сортировка выбором
        {

            if (mas[i] <= mas[indexMax])
            {
                indexMax = i;
            }
            else
            {
                indexMax = i + 1;
            }

        }
        System.out.println("Выбор");
        //вывод
        System.out.println(Arrays.toString(mas));
    }
}