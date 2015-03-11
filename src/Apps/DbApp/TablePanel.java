package Apps.DbApp;

import javax.swing.*;
import java.awt.*;


public class TablePanel extends JPanel
{
    JScrollPane scrollPane;
    MyTableModel tm;
    JTable table;
    TablePanel()
    {

        tm = new MyTableModel();
        table = new JTable(tm);
        scrollPane = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(400,230));
        scrollPane.setBounds(20, 20, 500, 240);
        add(scrollPane);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }
}
