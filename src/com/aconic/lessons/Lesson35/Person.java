package com.aconic.lessons.Lesson35;

public class Person implements Comparable<Person>
{
    private int Id;
    private String FName;
    private String LName;
    private int Age;

    public Person()
    {

    }

    public void init(int Id, String FName, String LName, int Age)
    {
        this.Id = Id;
        this.FName = FName;
        this.LName = LName;
        this.Age = Age;
    }

    public Person(int Id, String FName, String LName, int Age)           // конструктор public для XMLEncoder
    {
        this.Id = Id;
        this.FName = FName;
        this.LName = LName;
        this.Age = Age;
    }

    @Override
    public String toString()
    {
        String str = String.valueOf(Id) + " " + FName + " " + LName + " " + String.valueOf(Age);
        return str;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int age)
    {
        Age = age;
    }

    public String getLName()
    {
        return LName;
    }

    public void setLName(String LName)
    {
        this.LName = LName;
    }

    public String getFName()
    {
        return FName;
    }

    public void setFName(String FName)
    {
        this.FName = FName;
    }

    @Override
    public int compareTo(Person o)
    {
        int ret = 0;
        if (this.Age == o.Age)
        {
            ret = 0;
        }
        else if (this.Age > o.Age)
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
