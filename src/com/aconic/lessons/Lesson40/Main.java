package com.aconic.lessons.Lesson40;

/**
 * Date: 18.03.15 * Time: 19:57
*/

public class Main
{

    public static void main(String[] args)
    {
        MyThread tt = new MyThread();
        MyThread2 tt2 = new MyThread2();
        MyThread3 tt3 = new MyThread3();
        tt.start();
        tt2.start();
        tt3.start();
    }
}
