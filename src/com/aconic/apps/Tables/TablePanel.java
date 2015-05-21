package com.aconic.apps.Tables;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TablePanel extends JPanel
{
    TableModel tm;
    JTable table;
    JScrollPane scrollPane;
    JButton btnById;
    JTableHeader header;
    List<Person> persons;

    public TablePanel(final Commands cmd)
    {
        setLayout(null);
        persons = new ArrayList<Person>();
        persons.add(new Person(1, "Klon", "Dupkin", 20));
        persons.add(new Person(11, "Lila", "Cosmos", 18));
        persons.add(new Person(9, "Ira", "Poliv", 100));
        persons.add(new Person(6, "Vasya", "Roko", 25));
        persons.add(new Person(10, "Alex", "Lolo", 24));
        persons.add(new Person(20, "Anna", "Orkina", 17));
        persons.add(new Person(4, "Olga", "Popovkin", 66));

        tm = new MyTableModel(persons);
        table = new JTable(tm);
        btnById = new JButton("By Id");
        scrollPane = new JScrollPane(table);
        header = table.getTableHeader();

        table.setPreferredScrollableViewportSize(new Dimension(500, 240));
        scrollPane.setBounds(20, 40, 350, 150);
        btnById.setBounds(20, 10, 80, 20);
        header.setBackground(Color.BLUE.darker().darker());
        header.setForeground(Color.white);
        add(scrollPane);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        header.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent arg0)
            {
                int i = table.columnAtPoint(arg0.getPoint());
                String string = table.getColumnName(i);
                switch (string)
                {
                    case "Id":
                        Collections.sort(persons, cmd.byId);
                        break;
                    case "FName":
                        Collections.sort(persons, cmd.byFName);
                        break;
                    case "LName":
                        Collections.sort(persons, cmd.byLName);
                        break;
                    case "Age":
                        Collections.sort(persons, cmd.byAge);
                        break;
                    default:
                        break;
                }
            }
      /*
      //table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setSortable(0, true);
        sorter.setSortable(1, true);
        sorter.setSortable(2, true);
        sorter.setSortable(3, false);
        sorter.toggleSortOrder(0);   */


            @Override
            public void mousePressed(MouseEvent e)
            {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                //To change body of implemented methods use File | Settings | File Templates.
            }
        }
        );
    }
}