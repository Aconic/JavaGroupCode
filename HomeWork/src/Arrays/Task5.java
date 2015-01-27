package Arrays;
  import javax.swing.*;
  import javax.swing.JOptionPane;

/**
посчитать сумму элементов с нечетными индексами
 */
public class Task5 {

        int[] ArrInput(int n)
    {
        int [] mas = new int [n];
        for (int i = 0; i < n; i++)
        {
           mas[i]= (int) (Math.random()*10 + 1);
            System.out.print(mas[i]+ " ");
        }
        return mas;
    }

       int ArrIndexSum(int mas[])
          {

            int sum = 0;
              for (int i = 0; i < mas.length; i++)
              {
                  if (i%2 != 0)
                  {
                      sum+=mas[i];
                  }
              }
              System.out.print("Сумма - ");
              return (sum);
           }
}
