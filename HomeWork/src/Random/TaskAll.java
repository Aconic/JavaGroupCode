package Random;

import java.util.Arrays;
import java.util.Random;

/**
 * Вывести на консоль случайные числа
 */
public class TaskAll
{
  public    int [] randomDig(int n)      //n - кол-во случайных чисел , без диапазона
    {
        Random random = new Random();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++)
        {
            int i = random.nextInt();
            arr[j] = i;
        }
        return  arr;
    }

    public  int [] randomDig(int startDiap, int endDiap, int n)    //начало, конец диапазон, кол-во случайных чисел
    {
        Random random = new Random();
        int range = endDiap - startDiap + 1;
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++)
        {
            int i = random.nextInt(range) + startDiap;
            arr[j] = i;
        }
        return  arr;
    }

    public  int [] randomDig(int startDiap, int endDiap)//начало, конец диапазона, кол-во чисел в массиве случайное, от 3 до 15
    {
        Random random = new Random();
        int range = endDiap - startDiap + 1;
        int rangeLoop = 15 - 3 + 1;
        int n = random.nextInt(rangeLoop) + 3;  //cлучайная длина массива
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++)
        {
            int i = random.nextInt(range) + startDiap;
            arr[j] = i;
        }
        return  arr;
    }

    public  void randomArrayPrint(int []arr)            //вывод массива
    {
        System.out.print(Arrays.toString(arr));
    }
}




