package com.aconic.apps.Canvas;

import javax.swing.*;

public class MenuContext extends JMenu
{
    JMenu lwMenu = null;
    JMenu colMenu = null;
    JMenuItem lwItem1 = null;
    JMenuItem lwItem5 = null;
    JMenuItem lwItem7 = null;
    JMenuItem colItemRed = null;
    JMenuItem colItemGreen = null;
    JMenuItem colItemBlue = null;


    MenuContext(Command cmd)
    {
        lwMenu = new JMenu("LineWeight");
        colMenu = new JMenu("Color");
        lwItem1 = new JMenuItem("1");
        lwItem5 = new JMenuItem("5");
        lwItem7 = new JMenuItem("7");
        colItemRed = new JMenuItem("Red");
        colItemGreen = new JMenuItem("Green");
        colItemBlue = new JMenuItem("Blue");

        lwMenu.add(lwItem1);
        lwMenu.addSeparator();
        lwMenu.add(lwItem5);
        lwMenu.addSeparator();
        lwMenu.add(lwItem7);
        colMenu.add(colItemRed);
        colMenu.add(colItemGreen);
        colMenu.add(colItemBlue);
        add(lwMenu);
        add(colMenu);

        lwItem1.addActionListener(cmd.lineWCmd_1);
        lwItem5.addActionListener(cmd.lineWCmd_5);
        lwItem7.addActionListener(cmd.lineWCmd_7);
        colItemRed.addActionListener(cmd.colCmdRed);
        colItemGreen.addActionListener(cmd.colCmdGreen);
        colItemBlue.addActionListener(cmd.colCmdBlue);
    }
}
