package Functions;

import java.util.Scanner;

public class Task1
{

    public String week(int n)
    {
        String str = "";
        String[] smas = {null, "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        if (n < 1 || n > 7)
        {
            throw new IllegalArgumentException();
        }

        str = smas[n];
        return str;
    }
}

