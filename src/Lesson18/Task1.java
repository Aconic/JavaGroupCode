package Lesson18;


public class Task1
{

    public static void main(String[] args)
    {

        int ar[][] = {
                {2, 1, 2, 0, 4, 5, 11},
                {131, 1, 2, 0, 4, 5, 12},
                {2, 3, 2, 0, 4, 5, 18},
                {22, 1, 2, 5, 4, 5, 14},
                {5, 1, 4, 4, 4, 5, 1},
                {4, 1, 2, 0, 4, 5, 4},
                {23, 1, 2, 56, 4, 5, 1},
        };
        int max = ar[0][0];
        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                if (ar[i][j] > max)
                {
                    max = ar[i][j];
                }
            }

        }
        System.out.print(max);
    }

}
