package com.aconic.apps.CanvasVectorBeta;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class MenuCommands extends JMenuBar
{
    JMenu fileMenu;
    JMenu fileEdit;
    JMenuItem fileOpenItem;
    JMenuItem fileSaveItem;
    JMenu fileColorMenu;
    JMenuItem fileColorItemRed;
    JMenuItem fileColorItemGreen;
    JMenuItem fileColorItemBlue;
    JMenu fileLineMenu;
    JMenuItem fileLineItem_1;
    JMenuItem fileLineItem_5;
    Data data;

    public MenuCommands(Data d) throws FileNotFoundException
    {
        this.data = d;
        fileMenu = new JMenu(" File");
        fileEdit = new JMenu("Edit");
        fileOpenItem = new JMenuItem(" Open");
        fileSaveItem = new JMenuItem(" Save");
        fileColorMenu = new JMenu("Color");
        fileColorItemRed = new JMenuItem("Red");
        fileColorItemGreen = new JMenuItem("Green");
        fileColorItemBlue = new JMenuItem("Blue");
        fileLineMenu = new JMenu("Line W");
        fileLineItem_1 = new JMenuItem(" 1 ");
        fileLineItem_5 = new JMenuItem(" 5 ");

        fileMenu.add(fileOpenItem);
        fileMenu.add(fileSaveItem);

        fileColorMenu.add(fileColorItemRed);
        fileColorMenu.add(fileColorItemGreen);
        fileColorMenu.add(fileColorItemBlue);

        fileLineMenu.add(fileLineItem_1);
        fileLineMenu.add(fileLineItem_5);

        fileEdit.add(fileColorMenu);
        fileEdit.addSeparator();
        fileEdit.add(fileLineMenu);

        add(fileMenu);
        add(fileEdit);

        fileSaveItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                FileFunc fileFunc;
                File file;
                JFileChooser fileChooser = new JFileChooser();
                FileFilter filterXML = new FileNameExtensionFilter("*.XML", "*.xml");
                FileFilter filterJSON = new FileNameExtensionFilter("*.JSON", "*.json");
                fileChooser.setFileFilter(filterXML);
                fileChooser.addChoosableFileFilter(filterXML);
                fileChooser.addChoosableFileFilter(filterJSON);
                int res = fileChooser.showSaveDialog(null);

                if (res == JFileChooser.APPROVE_OPTION)
                {
                    try
                    {
                        fileFunc = new FileFunc();
                        ArrayList<PanelFigures> listFigs = new ArrayList<>();
                        for (Component cc : data.panelDraw.getComponents())
                        {
                            PanelFigures pf = (PanelFigures) cc;
                            listFigs.add(pf);
                        }

                        String extension = fileChooser.getFileFilter().getDescription();
                        String ext;
                        System.out.println(extension);
                        if (extension.equals("*.XML"))
                        {
                            ext = ".xml";
                            file = new File(fileChooser.getSelectedFile().getAbsolutePath() + ext);
                            fileFunc.fileXMLSave(file, listFigs);
                        }
                        if (extension.equals("*.JSON"))
                        {
                            ext = ".json";
                            file = new File(fileChooser.getSelectedFile().getAbsolutePath() + ext);
                            fileFunc.fileJsonSave(file, listFigs);
                        }
                    } catch (IOException | IllegalAccessException e1)
                    {
                        e1.printStackTrace();
                    }
                }
            }
        });

        fileOpenItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                FileFunc fileFunc = new FileFunc();
                JFileChooser fileChooser = new JFileChooser();

                int res = fileChooser.showOpenDialog(null);

                if (res == JFileChooser.APPROVE_OPTION)
                {
                    String filename = String.valueOf(fileChooser.getSelectedFile());
                    File file = fileChooser.getSelectedFile();
                    System.out.println(file.getAbsolutePath());
                    try
                    {
                        ArrayList<PanelFigures> fList = new ArrayList<>();

                        if (file.getAbsolutePath().endsWith(".xml"))
                        {
                            fList = fileFunc.fileXMLRead(filename);
                        }
                        if (file.getAbsolutePath().endsWith(".json"))
                        {
                            fList = (ArrayList<PanelFigures>) fileFunc.fileJsonRead(filename);
                        }

                        for (PanelFigures c : fList)
                        {
                            data.panelDraw.add(c);
                        }
                        data.panelDraw.repaint();

                    } catch (Exception e1)
                    {
                        e1.printStackTrace();
                    }
                }
            }
        });

        fileLineItem_1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                FileEditFunc fileEditFunc = new FileEditFunc(data);
                fileEditFunc.setLw(1);
            }
        });

        fileLineItem_5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                FileEditFunc fileEditFunc = new FileEditFunc(data);
                fileEditFunc.setLw(5);
            }
        });

        fileColorItemRed.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                FileEditFunc fileEditFunc = new FileEditFunc(data);
                fileEditFunc.setColor(Color.red);
            }
        });


        fileColorItemGreen.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                FileEditFunc fileEditFunc = new FileEditFunc(data);
                fileEditFunc.setColor(Color.GREEN);
            }
        });


        fileColorItemBlue.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                FileEditFunc fileEditFunc = new FileEditFunc(data);
                fileEditFunc.setColor(Color.BLUE);
            }
        });

    }
}
