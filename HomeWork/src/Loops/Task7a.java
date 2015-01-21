package Loops;

/**
 Нарисовать треугольники цмклами
 */
public class Task7a {

    public static void main(String[] args)
    {

        System.out.println("7)");
        TriangleSmall_1();
        System.out.println("8)");
        TriangleSmall_4();
        System.out.println("9)");
        TriangleSmall_2();
        System.out.println("10)");
        TriangleSmall_3();
        System.out.println("11)");
        Diagonal();
    }

     static String TriangleSmall_1()                      // 7 равнобедренный маленький низ
    {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--)
            {
                if (i >= (n + 1) / 2)
                {
                    if (i == n || i == j || i + j == n + 1)
                    {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
            }
            System.out.println();

        }
        return (null);

    }

    static String TriangleSmall_4()                      // 7 равнобедренный маленький верх
    {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--)
            {
                if (i <= (n + 1) / 2)
                {
                    if (i == 1 || i == j || i + j == n + 1)
                    {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
            }
            System.out.println();

        }
        return (null);

    }

    static String TriangleSmall_2()                      // 8 равнобедренный маленький  левый
    {
        int n = 7;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if(j <= (n + 1)/2)
                {
                if (j == 1 || i == j || i + j == n + 1)
                {
                System.out.print("*");
                }
                else System.out.print(" ");
            }
            }
        System.out.println();
        }


        return (null);
    }

    static String TriangleSmall_3()                      //  9 равнобедренный маленький  правый
    {
       int n = 7;
       for (int i =1; i <= n; i++)
       {
        for (int j = 1; j <= n; j++)
        {
            if(j >= (n + 1)/2)
            {
                if (j == n || i == j || i + j == n + 1)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
        }
        System.out.println();
        }
        return (null);
    }


    static String Diagonal()                              //10
    {
        for (int i = 1; i <= 7; i++)
        {
            for (int j = 1; j <= 7; j++)
            {
                if (i == j || i + j == 7 + 1)
                {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }

        return (null);
    }
}
