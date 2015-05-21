package com.aconic.lessons.Lesson30;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main implements Comparable
{

    Person p1;
    Person p2;

    public static void main(String[] args)
    {
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1);
        System.out.println(p1.hashCode());
        System.out.println(p1.equals(p2));
          //получить поля и функции класса
        Class x = p1.getClass();
        System.out.println(x.getCanonicalName());
        System.out.println(x.getName());
        Field[] fields = x.getDeclaredFields();
        Method[] methods = x.getDeclaredMethods();

        for (Field f : fields)
        {
            System.out.println(f.getName() + ", " +  f.getGenericType());
        }
        System.out.println();
        for (Method m : methods)
        {
            System.out.println(m.getName() + " " +  m.getGenericReturnType());
        }
    }


    @Override
    public int compareTo(Object o)
    {
        int res = 0;
        if (p1.getAge() > p2.getAge())
        {
            res = 1;
        }
        return res;
    }
}
