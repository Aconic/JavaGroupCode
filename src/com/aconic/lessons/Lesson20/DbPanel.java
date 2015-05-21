/*package com.aconic.lessons.Lesson20;



import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.*;

public class DbPanel extends JPanel
{
    JButton btnAdd = null;
    JButton btnUpdate = null;
    JButton btnDelete = null;


    DbPanel()
    {
        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Apps.AlphaVersions.Delete");
        btnAdd.setBounds(20, 20, 80, 20);
        btnUpdate.setBounds(20, 120, 80, 20);
        btnDelete.setBounds(20, 220, 80, 20);
        add(btnAdd);
        add(btnUpdate);
        add(btnDelete);
         btnAdd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Person np = new Person(Integer.parseInt(idField.getText()), fnameField.getText(), lnameField.getText(), Integer.parseInt(ageField.getText()));
                try
                {
                    PersonFunctions.createPerson(np);
                } catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                } catch (InstantiationException e)
                {
                    e.printStackTrace();
                } catch (SQLException e)
                {
                    e.printStackTrace();
                } catch (ClassNotFoundException e)
                {
                    e.printStackTrace();
                }
            }
        });

    public static void createPerson(np) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException
    {
        Class.forName("org.h2.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement st = conn.createStatement();
        String query = "INSERT INTO PERSON VALUES(" + np.getInt() + ",'" + np.getString() + "','" + np.getString() + "'," + np.getInt() + ")";
        st.executeUpdate(query);
        st.close();
        conn.close();
    }




    public void paintComponent(Graphics g)
    {
        Image im = null;
        try
        {
            im = ImageIO.read(new File("C:\\texture-metal-top.jpg"));
        } catch (IOException e)
        {
        }
        g.drawImage(im, 0, 0, null);
    }

}
           */