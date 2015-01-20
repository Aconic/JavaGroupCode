package Arrays;

/**
   Минимум в массиве
 */
public class Task2 {

    static int MinOfArray ()
    {
        int [] mas = {0,4,-1,12,8};
        int min = mas[0];
        for(int i = 0; i < 4; i++)
        {
            if(mas[i] <= min)
            {
                min = mas[i];
            }
        }
        return(min);
    }

}

