package com.aconic.apps.Tables;

import javax.swing.table.AbstractTableModel;
import java.util.List;


public class MyTableModel extends AbstractTableModel
{
    public List<Person> personList;
    String[] nameColumn = {"Id", "FName", "LName", "Age"};

    public MyTableModel(List<Person> pp)
    {
      this.personList = pp;
    }

    @Override
    public int getRowCount()
    {
        return personList.size();
    }

    @Override
    public int getColumnCount()
    {
        return  nameColumn.length;
    }

    @Override
    public String getColumnName(int column)
    {
        return nameColumn[column];
    }

    @Override
    public Class<?> getColumnClass(int column)
    {
        if(personList.isEmpty())
        {
            return Object.class;
        }
         return getValueAt(0, column).getClass() ;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Object res = null;
        Person p = personList.get(rowIndex);
        switch (columnIndex)
        {
            case 0:
                res = p.getId();
                break;
            case 1:
                res = p.getFName();
                break;
            case 2:
                res = p.getLName();
                break;
            case 3:
                res = p.getAge();
                break;
            default:
                break;
          }
        return res;
    }
}


