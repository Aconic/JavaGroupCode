package Apps.CanvasVectorBeta;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

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
        this.data =d;
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
                FileFilter filter = new FileNameExtensionFilter("*.XML", "xml");
                fileChooser.setFileFilter(filter);
                fileChooser.addChoosableFileFilter(filter);
                int res = fileChooser.showSaveDialog(null);

                if (res == JFileChooser.APPROVE_OPTION)
                {
                    try
                    {
                        file = new File(fileChooser.getSelectedFile().getAbsolutePath() + ".xml");
                        fileFunc = new FileFunc();

                        ArrayList<PanelFigures> listFigs = new ArrayList<>();
                        for (Component cc : data.panelDraw.getComponents())
                        {
                            PanelFigures pf = (PanelFigures) cc;
                            listFigs.add(pf);
                            System.out.println(listFigs.toString());
                        }
                        fileFunc.fileSave(file, listFigs);

                    } catch (FileNotFoundException e1)
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
                FileFilter filter = new FileNameExtensionFilter("*.XML", "xml");
                fileChooser.addChoosableFileFilter(filter);
                fileChooser.setFileFilter(filter);
                int res = fileChooser.showOpenDialog(null);
                if (res == JFileChooser.APPROVE_OPTION)
                {
                    String filename = String.valueOf(fileChooser.getSelectedFile());
                    try
                    {
                        List<PanelFigures> fList = fileFunc.fileRead(filename);
                        for (PanelFigures c : fList)
                        {
                            data.panelDraw.add(c);
                            System.out.println(c.getBounds());
                            System.out.println(c.toString());
                        }
                        data.panelDraw.repaint();

                    } catch (FileNotFoundException e1)
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
