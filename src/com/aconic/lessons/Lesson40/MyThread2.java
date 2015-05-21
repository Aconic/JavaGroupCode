package com.aconic.lessons.Lesson40;

/**
 * Date: 18.03.15 * Time: 20:08
 * To change this template use File | Settings | File Templates.
 */
public class MyThread2 extends Thread
{
    public void run()
    {
        while (true)
        {
            System.out.println("New Pot 2");
            try
            {
                sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
}