package Arrays;

/**
Посчитать кол-во нечетных элементов в массиве
 */
public class Task7 {

    int  ArrayCount(int []mas)
    {

        int count = 0;
        for (int i = 0; i < mas.length; i++)
        {
          if ((mas[i])%2 != 0)
          {
              count++;
          }
        }
            return (count);
    }
}





