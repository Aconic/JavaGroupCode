package Conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task1
{

    public  void main(String[] args) throws Exception
    {
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите первое число ");
        a = sc.nextInt();
        System.out.println("Ввведите второе число ");
        b = sc.nextInt();
        System.out.print("Результат - "+ count(a, b));
    }

    public  int count(int a, int b)
    {
        int res = 0;
        if (a % 2 == 0)
        {
            res = a * b;
        }
        else
        {
            res = a + b;
        }
        return res;
    }



}
