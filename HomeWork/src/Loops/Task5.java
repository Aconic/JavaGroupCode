package Loops;

/**
Посчитать сумму цифр заданного числа
 */
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
        System.out.print(Sum(n));
    }
    static int Sum (int n)
    {
     int tmp = n;
     int  sum = 0;
        if (tmp<0)
        {
         n*=(-1);
        }
     while (tmp > 0)
     {
         sum += tmp%10;
         tmp= tmp/10;
    }
    return sum;
    }
}
