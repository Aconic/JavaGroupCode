package Conditions;

import java.util.Scanner;

/**
Посчитать выражение  макс(а*б*с,а+б+с)+3
 */
public class Task4 {

        public  void main(String[] args)
        {
          Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int max = Maximum(a,b,c);
            System.out.print(max);
        }
            public int Maximum(int a, int b, int c)
    {
            int max =0;
            if (a+b+c < a*b*c)
            {
            max = a*b*c + 3;
            }
            else max = a+b+c + 3;
        return max;
        }

}

