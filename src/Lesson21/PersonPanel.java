package Lesson21;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

public class PersonPanel extends JPanel
{
    JButton btnOk = null;
    JButton btnCanc = null;
    JButton btnAdd = null;
    JButton btnUpdate = null;
    JButton btnDelete = null;
    JLabel lbId = null;
    JLabel lbFname = null;
    JLabel lbLname = null;
    JLabel lbAge = null;
    JTextField idField = null;
    JTextField fnameField = null;
    JTextField lnameField = null;
    JTextField ageField = null;
    PersonFunctions func = new PersonFunctions();

    public PersonPanel()
    {
        setLayout(null);
        btnOk = new JButton("OK");
        btnCanc = new JButton("Cancel");
        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        lbId = new JLabel("Id");
        lbFname = new JLabel("Fname");
        lbLname = new JLabel("Lname");
        lbAge = new JLabel("Age");
        idField = new JTextField();
        fnameField = new JTextField();
        lnameField = new JTextField();
        ageField = new JTextField();

        btnOk.setBounds(60, 180, 80, 20);
        btnCanc.setBounds(160, 180, 80, 20);
        btnAdd.setBounds(20, 230, 80, 25);
        btnUpdate.setBounds(110, 230, 80, 25);
        btnDelete.setBounds(200, 230, 80, 25);

        lbId.setBounds(45, 20, 80, 20);
        lbFname.setBounds(45, 60, 80, 20);
        lbLname.setBounds(45, 100, 80, 20);
        lbAge.setBounds(45, 140, 80, 20);
        lbId.setForeground(Color.WHITE);
        lbFname.setForeground(Color.WHITE);
        lbLname.setForeground(Color.WHITE);
        lbAge.setForeground(Color.WHITE);
        idField.setBounds(90, 20, 120, 25);
        fnameField.setBounds(90, 60, 120, 25);
        lnameField.setBounds(90, 100, 120, 25);
        ageField.setBounds(90, 140, 120, 25);
        add(btnOk);
        add(btnCanc);
        add(btnAdd);
        add(btnUpdate);
        add(btnDelete);
        add(lbId);
        add(lbFname);
        add(lbLname);
        add(lbAge);
        add(idField);
        add(fnameField);
        add(lnameField);
        add(ageField);


        //иконки на кнопки
        ImageIcon icon1 = createIcon("images\\addicon.png");
        btnAdd.setIcon(icon1);
        ImageIcon icon2 = createIcon("images\\delicon.png");
        btnDelete.setIcon(icon2);
        ImageIcon icon3 = createIcon("images\\editicon.png");
        btnUpdate.setIcon(icon3);


        btnOk.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("ID - " + idField.getText());
                System.out.println("FName - " + fnameField.getText());
                System.out.println("LName - " + lnameField.getText());
                System.out.println("Age - " + ageField.getText());
             }
        });

        btnCanc.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {

                idField.setText(null);
                fnameField.setText(null);
                lnameField.setText(null);
                ageField.setText(null);
            }
        });

        btnAdd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Person np = new Person(Integer.parseInt(idField.getText()), fnameField.getText(), lnameField.getText(), Integer.parseInt(ageField.getText()));
                try
                {
                    func.createPerson(np);
                    idField.setText(null);
                    fnameField.setText(null);
                    lnameField.setText(null);
                    ageField.setText(null);
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

        btnUpdate.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Person np = new Person(Integer.parseInt(idField.getText()), fnameField.getText(), lnameField.getText(), Integer.parseInt(ageField.getText()));
                try
                {
                    func.updatePerson(np);
                    idField.setText(null);
                    fnameField.setText(null);
                    lnameField.setText(null);
                    ageField.setText(null);
                } catch (ClassNotFoundException e)
                {
                    e.printStackTrace();
                } catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                } catch (InstantiationException e)
                {
                    e.printStackTrace();
                } catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        });

        btnDelete.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Person np = new Person();
                np.setId(Integer.parseInt(idField.getText()));

                try
                {
                    func.deletePerson(np);
                } catch (SQLException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                } catch (ClassNotFoundException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                } catch (IllegalAccessException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                } catch (InstantiationException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
                idField.setText(null);

            }
        });
    }
    //графика
    public void paintComponent(Graphics g)
    {
        Image im = null;
        try
        {
            im = ImageIO.read(new File("C:\\texture-metal.jpg"));
        } catch (IOException e)
        {
        }
        g.drawImage(im, 0, 0, null);
    }

    protected static ImageIcon createIcon(String path)
    {
        URL imgURL = PersonFrame.class.getResource(path);
        if (imgURL != null)
        {
            return new ImageIcon(imgURL);
        }
        else
        {
            System.err.println("File not found " + path);
            return null;
        }
    }
}
