package com.aconic.lessons.Lesson45;


public class MyThread implements Runnable
{
    String str = "";
    int ms = 0;

    public MyThread(String str, int ms)
    {
        this.str = str;
        this.ms = ms;
    }

    @Override
    public void run()
    {
        while (true)
        {
            System.out.println(str);
            try
            {
                Thread.sleep(ms);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
