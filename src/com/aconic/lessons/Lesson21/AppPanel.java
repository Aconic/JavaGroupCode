package com.aconic.lessons.Lesson21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppPanel extends JPanel
{
    JButton btnOpen;
    JButton btnSave;
    JButton btnColor;
    JButton btnPerson;
    JButton btnConfDia;
    JButton btnAlertDia;
    JButton btnOkDia;
    JTextField fieldOpen;
    JTextField fieldSave;
    JTextField fieldColor;
    JTextField fieldPerson;
    JScrollPane scrollPane;
    JTable table;

    AppPanel()
    {
        setLayout(null);
        btnOpen = new JButton("Open");
        btnSave = new JButton("Save");
        btnColor = new JButton("Color");
        btnPerson = new JButton("Person");
        btnConfDia = new JButton("Conf");
        btnAlertDia = new JButton("Alert");
        btnOkDia = new JButton("Info");
        fieldOpen = new JTextField();
        fieldSave = new JTextField();
        fieldColor = new JTextField();
        fieldPerson = new JTextField();
        table = new TestTable().table;


        scrollPane = new JScrollPane(table);
       // table.setPreferredScrollableViewportSize(new Dimension(500,130));

        btnOpen.setBounds(20, 20, 80, 20);
        btnSave.setBounds(20, 60, 80, 20);
        btnColor.setBounds(20, 100, 80, 20);
        btnPerson.setBounds(20, 140, 80, 20);
        btnConfDia.setBounds(20, 180, 80, 20);
        btnAlertDia.setBounds(120, 180, 80, 20);
        btnOkDia.setBounds(220, 180, 60, 20);

        fieldOpen.setBounds(120, 20, 140, 20);
        fieldSave.setBounds(120, 60, 140, 20);
        fieldColor.setBounds(120, 100, 140, 20);
        fieldPerson.setBounds(120, 140, 140, 20);
        scrollPane.setBounds(20, 220, 280, 120);

        add(btnOpen);
        add(btnSave);
        add(btnColor);
        add(btnPerson);
        add(btnConfDia);
        add(btnAlertDia);
        add(btnOkDia);
        add(fieldOpen);
        add(fieldSave);
        add(fieldColor);
        add(fieldPerson);
        add(scrollPane);



        btnOpen.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JFileChooser fileOpen = new JFileChooser();
                int ret = fileOpen.showDialog(null, "Открыть файл");
                if (ret == JFileChooser.APPROVE_OPTION)
                {
                    File file = fileOpen.getSelectedFile();
                    fieldOpen.setText(file.getName());
                }
            }
        });

        btnSave.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JFileChooser fileSave = new JFileChooser();
                int ret = fileSave.showDialog(null, "Сохранить файл");
                if (ret == JFileChooser.APPROVE_OPTION)
                {
                    File file = fileSave.getSelectedFile();
                    fieldSave.setText(file.getAbsolutePath());
                }
            }
        });

        btnColor.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Color c = JColorChooser.showDialog(null, "Choose a Color", Color.black);
                if (c != null)
                {
                    fieldColor.setBackground(c);

                }
            }
        });
        btnPerson.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new PersonFrame();
                fieldPerson.setText("");
            }
        });

        btnConfDia.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JOptionPane jp = new JOptionPane();
                Object[] options = {"OK", "CANCEL","Kill this App"};
                jp.showOptionDialog(null, "Click OK to continue", "Info",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[0]);
            }
        });
        btnAlertDia.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JOptionPane jp = new JOptionPane();
                jp.showMessageDialog(null, "You pressed it!", "Warning!!", JOptionPane.ERROR_MESSAGE);
            }
        });
        btnOkDia.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JOptionPane.showMessageDialog(null, "Ok");
            }
        });
      }

    public String getPerson()
    {
        String str = "";
        str += "";
        return str;
    }
}
