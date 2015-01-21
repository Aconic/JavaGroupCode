package Conditions;

/**
 Рейтинг студентов.
 */

import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        System.out.println("Enter your rating:");
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        String res = rating(grade);
        System.out.print("Your rate is - " + res);
    }

    static String rating(int grade)
    {
        String rate = null;
        if (grade >= 0)
        {
            if (grade <= 19)
            {
                rate = "F";
            }
            else if (grade > 19 && grade <= 39)
            {
                rate = "E";
            }
            else if (grade > 39 && grade <= 59)
            {
                rate = "D";
            }
            else if (grade > 59 && grade <= 74)
            {
                rate = "C";
            }
            else if (grade > 74 && grade <= 89)
            {
                rate = "B";
            }
            else if (grade > 89 && grade <= 100)
            {
                rate = "A";
            }
        }
        return rate;
    }
}







