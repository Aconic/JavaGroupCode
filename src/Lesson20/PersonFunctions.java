package Lesson20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonFunctions
{
    public  void createPerson(Person np) throws IllegalAccessException, InstantiationException, SQLException, ClassNotFoundException
    {
        Class.forName("org.h2.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement st = conn.createStatement();
        String query = "INSERT INTO PERSON VALUES(" + np.getId() + ",'" + np.getFName() + "','" + np.getLName() + "'," + np.getAge() + ")";
        st.executeUpdate(query);
        st.close();
        conn.close();
    }

    public  void updatePerson(Person np) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException
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

    public  void deletePerson(Person np) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException
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
