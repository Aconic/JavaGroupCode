package Arrays;

/**
Поменять местами эл-ты массива. Например 1234 получить 3412
 */
public class Task8 {
     public void ArrayReloc()
    {
        int [] mas = new int[] {1,2,3,4};
        int tmp = 0;
        for (int i = 0; i < (mas.length)/2; i++)
        {
            tmp = mas[i];
            mas[i] = mas [(mas.length)/2 + i];
            mas [(mas.length)/2+i] = tmp;
        }

        for (int i = 0; i < mas.length; i++)
        {
            System.out.print(mas[i]);
        }
    }
}
