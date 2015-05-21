package com.aconic.lessons.Lesson35;


import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        Integer[] ar = {1, 4, 6, 7, 5};
        Person[] pp = new Person[7];
        pp[0] = new Person(1, "Klon", "Dupkin", 20);
        pp[1] = new Person(11, "Lila", "Cosmos", 18);
        pp[2] = new Person(9, "Ira", "Poliv", 100);
        pp[3] = new Person(6, "Vasya6", "Roko", 25);
        pp[4] = new Person(10, "Alex", "Lolo", 24);
        pp[5] = new Person(20, "Anna", "Orkina", 17);
        pp[6] = new Person(4, "Olga", "Popovkin", 66);

        List<Person> list = Arrays.asList(pp);

        for (int i = 0; i < ar.length; i++)
        {
           // System.out.print(ar[i] + " ");
        }

        for (Integer i : ar)
        {
           // System.out.print(i + " ");
        }

        Iterator<Integer> ii = Arrays.asList(ar).iterator();
        while (ii.hasNext())
        {
            Integer i = ii.next();
          //  System.out.print(i);
        }
        //System.out.println(Arrays.toString(pp));
        //Arrays.sort(pp);
        //System.out.println(Arrays.toString(pp));
        Arrays.sort(pp, new PersonById());
        System.out.println(Arrays.toString(pp));
        Arrays.sort(pp, new PersonByLName());
        System.out.println(Arrays.toString(pp));
        Arrays.sort(pp, new PersonByFName());
        System.out.println(Arrays.toString(pp));
        Arrays.sort(pp, new PersonByAge());
        System.out.println(Arrays.toString(pp));
        Collections.sort(Arrays.asList(pp), new PersonByFName());
        System.out.println(Arrays.toString(pp));

        Collections.sort(list, new PersonByFName());
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(list.toString());
    }
}

