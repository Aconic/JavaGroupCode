package Lesson1;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 15.10.14
 * Time: 20:54
 * To change this template use File | Settings | File Templates.
 */
public class Task1
{

    public static void main(String[] args)
    {
        int a = 2, b =-1, c = 7, sum = 0;
        if (a > 0)
        {
           sum = a;
        }
        if (b > 0)
        {
            sum += b;
        }
        if (c > 0)
        {
            sum += c;
        }

         else
        {
            System.out.println("Положительных нет");
        }
        System.out.println(sum);

    }
}
