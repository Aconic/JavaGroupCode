package com.aconic.lessons.Lesson40;


public class MyThread extends Thread
{
    public void run()
    {
        int i =0;
        while (true)
       {
           System.out.println("New thread 1");

           try
           {
               sleep(500);
           } catch (InterruptedException e)
           {
               e.printStackTrace();
           }
       }

    }
}
