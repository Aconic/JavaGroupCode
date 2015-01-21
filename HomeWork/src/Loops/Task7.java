package Loops;

/**
 * Нарисовать фигуры циклами
 */
public class Task7
{
    public static void main(String[] args)
    {

        System.out.println("1)");
        Triangle1();
        System.out.println("2)");
        Triangle2();
        System.out.println("3)");
        Triangle3();
        System.out.println("4)");
        Triangle4();
        System.out.println("5)");
        Triangle5();

    }

    static String Triangle1()
    {
        for (int i = 1; i <= 7; i++)
        {
            for (int j = 7; j >= 1; j--)
            {
                if (i == j || i == 1 || j == 7)
                {
                    System.out.print("* ");
                }
                else System.out.print("  ");

            }
            System.out.println();
        }
        return (null);
    }

    static String Triangle2()
    {
        for (int i = 1; i <= 7; i++)
        {
            for (int j = 1; j <= 7; j++)
            {
                if (i == j || i == 7 || j == 1)
                {
                    System.out.print("* ");
                }
                else System.out.print("  ");

            }
            System.out.println();

        }
        return (null);

    }

    static String Triangle3()
    {
        for (int i = 1; i <= 7; i++)
        {
            for (int j = 1; j <= 7; j++)
            {
                if (i == j || i == 1 || j == 7)
                {
                    System.out.print("* ");
                }
                else System.out.print("  ");

            }
            System.out.println();

        }
        return (null);
    }

    static String Triangle4()
    {
        for (int i = 7; i >= 1; i--)
        {
            for (int j = 1; j <= 7; j++)
            {
                if (i == 7 || i ==j  || j==1)
                {
                    System.out.print("* ");
                }
                else System.out.print("  ");

            }
            System.out.println();

        }
        return (null);
    }

    static String Triangle5()                      // 6 равнобедренный большой
    {
        int n = 7;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= 2*n-1; j++)
            {

                if (i == n || (i + j) == n + 1 || j == (n -1) + (2*i+1)/2)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");

            }
            System.out.println();

        }
        return (null);

    }

}


