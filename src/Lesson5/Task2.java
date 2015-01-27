package Lesson5;

public class Task2 {

    public static  void main(String[] args)
    {
      int n = 10;

      print(n);
    }

    public static void  print(int n)
    {
      for (int i = 1; i <=n; i++)
      {
          if(i % 2== 0)
          {
              System.out.print(i + " ");
          }
      }
    }
}
