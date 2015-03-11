package Apps.CanvasVectorAlfa;

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

public class Menu extends JMenuBar
{
    JMenu fileMenu;
    JMenuItem fileOpenItem;
    JMenuItem fileSaveItem;

    public Menu(final Data data) throws FileNotFoundException
    {
        fileMenu = new JMenu(" File");
        fileOpenItem = new JMenuItem(" Open");
        fileSaveItem = new JMenuItem(" Save");
        fileMenu.add(fileOpenItem);
        fileMenu.add(fileSaveItem);
        add(fileMenu);


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
                String format = "xml";

                if (res == JFileChooser.APPROVE_OPTION)
                {
                    try
                    {
                        file = new File(fileChooser.getSelectedFile().getAbsolutePath() + "." + format);
                        fileFunc = new FileFunc();

                        ArrayList<PanelFigs> aa = new ArrayList<PanelFigs>();
                        for( Component cc : data.panelVector.getComponents() )
                        {
                            PanelFigs p = (PanelFigs) cc;
                            aa.add(p);
                        }

                        fileFunc.fileSave(file, aa);

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
                        List<PanelFigs> fList =  fileFunc.fileRead(filename);
                        for (PanelFigs c : fList)
                        {
                           data.panelVector.add(c);
                            System.out.println(c.getBounds());
                            System.out.println(c.toString());
                         }
                        data.panelVector.repaint();

                    } catch (FileNotFoundException e1)
                    {
                        e1.printStackTrace();
                    }
                }
            }
        });

    }
}
