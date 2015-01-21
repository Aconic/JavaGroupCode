package TStrings;

/**
 * Функции преобразования
 */
public class Task2
{
    public static void main(String[] args)
    {
        Task2 obj = new Task2();
        System.out.println(obj.intToString(5));
        System.out.println(obj.doubleToString(2.4245));
        System.out.println(obj.strToInt("25"));
        System.out.println(obj.strToDouble("25.91"));
    }

     String intToString(int a)
    {
        String str = String.valueOf(a);
        return str;
    }

     String doubleToString(double a)
    {
        String str = Double.toString(a);
        return str;
    }
     int strToInt(String str)
    {
        int a = Integer.parseInt(str);
        return a;
    }
     double strToDouble(String str)
    {
        double a = Double.parseDouble(str);
        return a;
    }
}
