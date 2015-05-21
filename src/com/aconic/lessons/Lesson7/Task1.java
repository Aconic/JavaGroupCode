package com.aconic.lessons.Lesson7;


import java.text.SimpleDateFormat;
import java.util.Date;

//Вывести дату прописью
public class Task1
{

    public static void main(String[] args)
    {
        int day = 2;
        int month = 3;
        int year = 1;
        System.out.print(getDate(day, month, year));

    }

    public static String getDate(int day, int month, int year)
    {
        String str = "";
        str += Task1a.numString(day) + " ";
        //str += toMonth(month) + " ";
        str += Task1a.numString(year) + " год, ";
        str += toWeekDay();      //алгоритм в интернете

        return str;
    }
    public static String toWeekDay()
    {
        String res =  new SimpleDateFormat("EEEE").format(new Date()) ;
        return res;
    }
}
