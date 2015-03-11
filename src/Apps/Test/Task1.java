package Apps.Test;

import java.util.Arrays;

/**
 * Date: 30.11.14 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 */
public class Task1
{
    public static void main(String[] args)

    {
        int tmp = 0;
        int a = 1234;
        while (a != 0)
        {
            tmp = tmp * 10 + a % 10;
            a /= 10;
        }
        System.out.println(tmp);
    String str = "08/11/14";
       String [] str1= str.split("/");

        System.out.println(Arrays.toString(str1));

    }




}
