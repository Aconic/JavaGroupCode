package TStrings;

/**
 * удалить последенне слово в строке
 */
public class Task3h
{
    public static void main(String[] args)
    {
        String str1 = "We are javers. tra-lala";
        delLastWordPrint(delLastWord(str1));
    }

    static String[] delLastWord(String str)
    {
        String[] userAr = str.trim().split("\\s");
        userAr[userAr.length - 1] = "";
        return userAr;
    }

    static void delLastWordPrint(String[] userAr)
    {
        for (int i = 0; i < userAr.length; i++)
        {
            System.out.print(userAr[i] + " ");
        }
    }
}
