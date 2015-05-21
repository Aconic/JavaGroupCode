package com.aconic.lessons.Lesson21;


import javax.swing.JTable;

public class TestTable extends JTable
{
  public JTable table;
    TestTable()
    {
         String[] columnNames = {
                "Id",
                "Last modified",
                "Type",
                "Size"
        };

        String[][] data = {
                {"AppPatch", "02.11.2006 19:15", "Folder", ""},
                {"AppPatch", "03.10.2006 14:10", "Folder", ""},
                {"assembly", "02.11.2006 14:20", "Folder", ""},
                {"Boot", "13.10.2007 10:46", "Folder", ""},
                {"Branding", "13.10.2007 12:10", "Folder", ""},
                {"Cursors", "23.09.2006 16:34", "Folder", ""},
                {"Debug", "07.12.2006 17:45", "Folder", ""},
                {"Fonts", "03.10.2006 14:08", "Folder", ""},
                {"Help", "08.11.2006 18:23", "Folder", ""},
                {"explorer.exe", "18.10.2006 14:13", "File", "2,93MB"},
                {"helppane.exe", "22.08.2006 11:39", "File", "4,58MB"},
                {"twunk.exe", "19.08.2007 10:37", "File", "1,08MB"},
                {"nsreg.exe", "07.08.2007 11:14", "File", "2,10MB"},
                {"avisp.exe", "17.12.2007 16:58", "File", "12,67MB"},
        };

         table = new JTable(data, columnNames);
         table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }
}
