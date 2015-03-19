package Apps.AlphaVersions.Test;

import java.util.Arrays;

public class PersonMain
{
    public static Person[] pp = new Person[7];

    public static void main(String[] args)
    {

        pp[0] = new Person(1, "Vasia", "Pupkin", 24);
        pp[1] = new Person(21, "Ivan", "Duren", 34);
        pp[2] = new Person(45, "Petr", "Repka", 53);
        pp[3] = new Person(2, "Petr", "Kolpak", 45);
        pp[4] = new Person(40, "Misha", "Kopka", 25);
        pp[5] = new Person(23, "Anna", "Durenko", 11);
        pp[6] = new Person(7, "Valya", "Pupkon", 72);
         /*for (int i = 0; i < 7; i++)
        {
            if (pp[i].getAge() >= 18 && pp[i].getAge() <= 24)
            {
                System.out.println(pp[i].toString());
            }
        }         */
        idSort();
        System.out.println(Arrays.toString(pp));
        ageSortDown();
        System.out.println(Arrays.toString((pp)));
        //nameSort();
        ageMore65();
        System.out.println(Arrays.toString(lNameKo()));
    }

    public static void idSort()
    {
        Person tmp;
        for (int j = 0; j < pp.length; j++)
        {
            for (int i = 0; i < pp.length - 1; i++)
            {
                if (pp[i].getId() >= pp[i + 1].getId())
                {
                    tmp = pp[i + 1];
                    pp[i + 1] = pp[i];
                    pp[i] = tmp;
                }
            }
        }
    }

    public static void ageSortDown()
    {
        Person tmp;
        for (int j = 0; j < pp.length; j++)
        {
            for (int i = 0; i < pp.length - 1 - j; i++)
            {
                if (pp[i].getAge() <= pp[i + 1].getAge())
                {
                    tmp = pp[i + 1];
                    pp[i + 1] = pp[i];
                    pp[i] = tmp;
                }
            }
        }
    }

  /*  public static void nameSort()
    {
        String[] temp = new String[pp.length];
        Person tmp;
        for (int i = 0; i < temp.length; i++)
        {
            temp[i] = pp[i].getLName();
        }
        Arrays.sort(temp);

        for (int j = 0; j < temp.length; j++)
        {
            for (int i = 0; i < temp.length; i++)
            {
                if (temp[j].equals(pp[i].getLName()) == true  )
                {
                    tmp = pp[i];
                    pp[j] = pp[i];
                    pp[i] = tmp;
                }
            }
        }

    }     */

    public static void ageMore65()
    {
        for (int i = 0; i < pp.length; i++)
        {
            if (pp[i].getAge() >= 65)
            {
                System.out.println(pp[i].toString());
            }
        }
    }

    public static String[] lNameKo()
    {
        int index = 0;
        String[] tmp = new String[pp.length];
        for (int i = 0; i < pp.length; i++)
        {
            if ((pp[i].getLName().endsWith("ko")))
            {
                tmp[index] = pp[i].getLName();
                index++;
            }
        }
        String[] namesKo = new String[index];
        for (int i = 0; i < index; i++)
        {
            namesKo[i] = tmp[i];
        }
        return namesKo;
    }

    public static void print()
    {
        for (int i = 0; i < pp.length; i++)
        {
            System.out.println(pp[i]);
        }
    }

}






