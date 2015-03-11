package Apps.Tables;

import java.util.Comparator;

public class Commands
{
    PersonById byId = new PersonById();
    PersonByFName byFName = new PersonByFName();
    PersonByLName byLName = new PersonByLName();
    PersonByAge byAge = new PersonByAge();

    public class PersonById implements Comparator <Person>
    {
        @Override
        public int compare(Person p1, Person p2)
        {
            int ret = 0;
            if (p1.getId() == p2.getId())
            {
                ret = 0;
            }
            else if (p1.getId() > p2.getId())
            {
                ret = 1;
            }
            else
            {
                ret = -1;
            }
            return ret;
        }
    }

    public class PersonByFName implements Comparator<Person>
    {
        @Override
        public int compare(Person o1, Person o2)
        {
            return o1.getFName().compareTo(o2.getFName());
        }
    }

    public class PersonByAge implements Comparator<Person>
    {
        @Override
        public int compare(Person p1, Person p2)
        {
            int ret = 0;
            if (p1.getAge() == p2.getAge())
            {
                ret = 0;
            }
            else if (p1.getAge() > p2.getAge())
            {
                ret = 1;
            }
            else
            {
                ret = -1;
            }
            return ret;
        }
    }


    public class PersonByLName implements Comparator<Person>
    {
        @Override
        public int compare(Person p1, Person p2)
        {
            return p1.getLName().compareTo(p2.getLName());
        }
    }

}
