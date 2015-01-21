package TStrings;

/**
 * Вывести в одну тсроку символы
 */
public class Task1
{
    public static void main(String[] args)
    {
        for (int i = 65; i <= 90; i++)
        {
            System.out.print((char) i + " ");
        }
        System.out.println();
        for (int i = 122; i >= 97; i--)
        {
            System.out.print((char) i + " ");
        }
        System.out.println();
        for (char i = 'а'; i <= 'я'; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = '0'; i <= '9'; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 32; i <= 255; i++)
        {
            System.out.print((char)i + " ");
        }
    }
}