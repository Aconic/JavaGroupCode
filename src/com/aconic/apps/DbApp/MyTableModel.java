package com.aconic.apps.DbApp;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;


public class MyTableModel extends AbstractTableModel
{

    ArrayList<Person> pp = new ArrayList<Person>();

    public MyTableModel()
    {
        pp.add(new Person(1, "NewIvan", "NewDurak", 23));
        pp.add(new Person(2, "NewPetr", "NewNeDurak", 27));
        pp.add(new Person(3, "NewPetr", "S", 37));
        pp.add(new Person(5, "NewA", "T", 47));
        pp.add(new Person(6, "NewB", "R", 56));
    }

    @Override
    public int getRowCount()
    {
        return pp.size();
    }

    @Override
    public int getColumnCount()
    {
        return 4;
    }


    public String getColumnName(int column)
    {
        String[] nameColumn = {"Id", "Fname", "Lname", "Age"};
        return nameColumn[column];
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Object res = null;
        Person p = pp.get(rowIndex);
        switch (columnIndex)
        {
            case  0:
          res = p.getId();
            break;
            case  1:
                res = p.getFName();
                break;
            case  2:
                res = p.getLName();
                break;
            case  3:
                res = p.getAge();
                break;
            default:break;

        }
        return res;
    }
}

