package Arrays;

/**

 Максимум массива

 */
public class Task1
{
      int MaxOfArray (int []mas)
     {

         if (mas==null || mas.length == 0)
         {
             throw new IllegalArgumentException();
         }

         int max = mas[0];
     for(int i = 0; i < mas.length; i++)
     {
         if(mas[i] >= max)
         {
         max = mas[i];
         }

     }
     return(max);
     }

}
