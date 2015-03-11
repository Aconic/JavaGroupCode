package Lesson35;

import java.util.Comparator;

/**
 * Date: 01.03.15 * Time: 17:01
 * To change this template use File | Settings | File Templates.
 */
public class PersonByFName implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2)
    {
        return o1.getFName().compareTo(o2.getFName());
    }
}
