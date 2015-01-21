package Loops;

/**
 Вывести матрицы циклами
 */
public class Task7b {

    public static void main(String[] args)
    {

        Matrix1();
        System.out.println();
        Matrix4();
        System.out.println();
        Matrix2();
        System.out.println();
        Matrix3();
        System.out.println();
    }

    static int Matrix1()
    {
        for (int i = 1; i <= 7; i++)
        {

            for (int j = 1; j <= 7; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
        return (0);
    }

    static int Matrix2()
    {
        for (int i = 1; i <= 7; i++)
        {

            for (int j = 1; j <= 7; j++)
            {
                System.out.print(i);
            }

            System.out.println();
        }
        return (0);
    }

    static int Matrix3()
    {
        for (int i = 7; i >= 1; i--)
        {

            for (int j = 1; j <= 7; j++)
            {
                System.out.print(i);
            }

            System.out.println();
        }
        return (0);
    }

    static int Matrix4()
    {
        for (int i = 1; i <= 7; i++)
        {

            for (int j = 7; j >= 1; j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }

        return (0);

    }
}
