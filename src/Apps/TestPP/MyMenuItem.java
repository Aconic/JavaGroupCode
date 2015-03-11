package Apps.TestPP;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MyMenuItem extends JMenu {
    private PanelPaint panel;

    private JMenu colorMenu;
    private JMenu depthMenu;

    private JCheckBoxMenuItem colorRed;
    private JCheckBoxMenuItem colorBlue;
    private JCheckBoxMenuItem colorYellow;

    public MyMenuItem(PanelPaint panele) {
        this.panel = panele;

        colorMenu = new JMenu("Цвет");
        depthMenu = new JMenu("Толщина");

        JMenuItem redColorItem = new JMenuItem("Красный");
        colorMenu.add(redColorItem);

        JMenuItem blueColorItem = new JMenuItem("Синий");
        colorMenu.add(blueColorItem);

        JMenuItem yellowColorItem = new JMenuItem("Желтый");
        colorMenu.add(yellowColorItem);

        JMenuItem depthItem1 = new JMenuItem("1");
        depthMenu.add(depthItem1);

        JMenuItem depthItem5 = new JMenuItem("5");
        depthMenu.add(depthItem5);

        JMenuItem depthItem8 = new JMenuItem("8");
        depthMenu.add(depthItem8);

        colorRed = new JCheckBoxMenuItem("Red");
        colorBlue = new JCheckBoxMenuItem("Blue");
        colorYellow = new JCheckBoxMenuItem("Yellow");

        JMenuItem exitItem = new JMenuItem("Exit");

        add(colorMenu);
        add(depthMenu);
        addSeparator();
        add(colorRed);
        add(colorBlue);
        add(colorYellow);
        addSeparator();
        add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        redColorItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setColor(Color.RED);
            }
        });
        blueColorItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setColor(Color.BLUE);
            }
        });
        yellowColorItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setColor(Color.YELLOW);
            }
        });
        depthItem1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setWl(1);
            }
        });
        depthItem5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setWl(5);
            }
        });
        depthItem8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setWl(8);
            }
        });
        colorRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorRed.setSelected(true);
                colorBlue.setSelected(false);
                colorYellow.setSelected(false);
                panel.setColor(Color.RED);
            }
        });
        colorBlue.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                colorRed.setSelected(false);
                colorBlue.setSelected(true);
                colorYellow.setSelected(false);
                panel.setColor(Color.BLUE);

            }
        });
        colorYellow.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                colorRed.setSelected(false);
                colorBlue.setSelected(false);
                colorYellow.setSelected(true);
                panel.setColor(Color.YELLOW);

            }
        });
    }

    public JMenu getColorMenu() {
        return colorMenu;
    }

    public JMenu getDepthMenu() {
        return depthMenu;
    }

    public JCheckBoxMenuItem getColorRed() {
        return colorRed;
    }

    public JCheckBoxMenuItem getColorBlue() {
        return colorBlue;
    }

    public JCheckBoxMenuItem getColorYellow() {
        return colorYellow;
    }
}