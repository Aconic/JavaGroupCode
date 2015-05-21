package com.aconic.lessons.Lesson45;

/**
 * Date: 05.04.15 * Time: 15:43
 * To change this template use File | Settings | File Templates.
 */
public class Main
{
    public static void main(String[] args)
    {
        Thread mt1 = new Thread(new MyThread("1", 100));
        Thread mt2 = new Thread(new MyThread("2", 300));
        Thread mt3 = new Thread(new MyThread("3", 400));

        mt1.start();
        mt2.start();
        mt3.start();

    }

}
