package Arrays;

/**
индекс мин элемента
 */
public class Task3 {

     int IndexMinOfArray ()
    {
        int [] mas = {0,4,-1,2,8};
        int min = mas[0];
        int tmp = 0;
        for(int i = 0; i < mas.length; i++)
        {
            if(mas[i] <= min)
            {
                min = mas[i];
                tmp = i;
            }
        }
        return(tmp);
    }

}
