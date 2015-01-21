package TStrings;

import java.util.Arrays;

/**
  Длина самого короткого слова
 */
public class Task3a
{
    public static void main(String[] args)
    {
        String str1 = "We are javers, ha-ha";
        String[] userAr = str1.trim().split("\\s|\\,\\s|\\.\\s");
        int min = userAr[0].length();
        for (int i = 0; i < userAr.length; i++)
        {
            if (userAr[i].length() < min)
            {
                min = userAr[i].length();
            }
        }
        System.out.print(Arrays.toString(userAr));
        System.out.println();
        System.out.println(min);
    }
}
