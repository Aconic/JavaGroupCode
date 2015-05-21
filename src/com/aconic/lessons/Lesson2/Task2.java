package com.aconic.lessons.Lesson2;

import java.util.Scanner;
/**
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter your rating:");
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        String res = Rating(grade);
        System.out.print("Your rate is - " + res);
    }

    static String Rating(int grade) {
        String rate = null;
        if (grade > 0) {
            if (grade <= 19) {
                rate = "F";
            }
            if (grade > 19 && grade <= 39) {
                rate = "E";
            }
            if (grade > 39 && grade <= 59) {
                rate = "D";
            }
            if (grade > 59 && grade <= 74) {
                rate = "C";
            }
            if (grade > 74 && grade <= 89) {
                rate = "B";
            }
            if (grade > 89 && grade <= 100) {
                rate = "A";
            }
        }
        return rate;
    }
}







