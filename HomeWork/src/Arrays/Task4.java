package Arrays;

/**
        Индекс масимального элемента
 */
public class Task4 {

    int IndexMaxOfArray ()
    {
        int [] mas = {4,2,1,12,8};
        int max = mas[0];
        int tmp = 0;
        for(int i = 0; i < mas.length; i++)
        {
            if(mas[i] >= max)
            {
                max = mas[i];
                tmp = i;
            }
        }
        return(tmp);
    }

}

