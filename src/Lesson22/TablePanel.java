package Lesson22;

import javax.swing.*;
import java.awt.*;


public class TablePanel extends JPanel
{
    JScrollPane scrollPane;
    MyTableModel tm;
    JTable table;
     TablePanel()
    {
        setLayout(null);
        tm = new MyTableModel();
        table = new JTable(tm);
        scrollPane = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(500,240));
        scrollPane.setBounds(20, 20, 350, 240);
        add(scrollPane);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }
}
