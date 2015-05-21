package com.aconic.lessons.Lesson16;

import java.sql.*;

public class mainPersonDB
{

    public static Person[] pp = new Person[8];


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException
    {
        pp[0] = new Person(1, "Vasia", "Pupkin", 24);
        pp[1] = new Person(2, "Ivan", "Duren", 34);
        pp[2] = new Person(3, "Petr", "Repka", 53);
        pp[3] = new Person(4, "Petr", "Kolpak", 45);
        pp[4] = new Person(5, "Misha", "Kopka", 25);
        pp[5] = new Person(6, "Anna", "Durenko", 11);
        pp[6] = new Person(7, "Valya", "Pupkon", 72);
        pp[7] = new Person(8, "Boris", "Johnson", 56);

        Person np = new Person(10, "Mike", "Tyson", 43);
        createPerson(np);
        readPerson();
        updatePerson(np);
        deletePerson(np);
    }

    public static void createPerson(Person np) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException
    {
        Class.forName("org.h2.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement st = conn.createStatement();
        String query = "INSERT INTO PERSON VALUES(" + np.getId() + ",'" + np.getFName() + "','" + np.getLName() + "'," + np.getAge() + ")";
        st.executeUpdate(query);
        st.close();
        conn.close();
    }

    public static void readPerson() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        Class.forName("org.h2.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from PERSON");
        while (rs.next())
        {
            Person p = new Person(rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getInt(4));
            System.out.println(p);
        }
        st.close();
        conn.close();
    }

    public static void updatePerson(Person np) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException
    {
        Class.forName("org.h2.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement st = conn.createStatement();
        String query = "Update PERSON set Fname = '" + np.getFName()
                + "',Lname = '" + np.getLName() + "',Age = " + np.getAge()
                + " where id=" + np.getId();
        st.executeUpdate(query);
        st.close();
        conn.close();
    }

    public static void deletePerson(Person np) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        Class.forName("org.h2.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement st = conn.createStatement();
        String query = "Delete From PERSON where id=" + np.getId();
        st.executeUpdate(query);
        st.close();
        conn.close();
    }


}
