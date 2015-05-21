package com.aconic.lessons.Lesson05;

import java.util.Scanner;

/**
 * Дни недели
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 8;
        System.out.print(week(n));

    }

    public static String week(int n) {
        String str = "";

        String[] smas = {null, "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};


            str = smas[n];

        return str;
    }

}
