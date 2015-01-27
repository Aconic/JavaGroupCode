package Conditions;

/**
 * Определить к какой четверти принадлежит точка
   */
public class Task2 {
    public  void main (String[] args)
    {
        int a = -34, b  = 160;
        int fin =  coord(a, b);
    }

    public int coord(int x, int y)
    {
        int res= 0;
        if(x > 0 && y > 0)
        {
                res = 1;
        }
         else if(x > 0 && y < 0)
            res = 2;
        else if(x < 0 && y < 0)
            res = 3;
        else if(x < 0 && y > 0)
            res = 4;
        else throw new IllegalArgumentException();
        return res;
    }

}

