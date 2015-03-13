package Lesson35;

import java.util.Comparator;


public class PersonByFName implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2)
    {
        return o1.getFName().compareTo(o2.getFName());
    }
}
