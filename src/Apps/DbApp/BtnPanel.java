package Apps.DbApp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;


public class BtnPanel extends JPanel
{
    JButton btnAdd = null;
    JButton btnUpdate = null;
    JButton btnDelete = null;
    PersonFunctions func = null;

    BtnPanel()
    {

        func = new PersonFunctions();
        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Apps/AlphaVersions/Delete");
        btnAdd.setBounds(20, 230, 80, 25);
        btnUpdate.setBounds(20, 370, 80, 25);
        btnDelete.setBounds(20, 310, 80, 25);
        add(btnAdd);
        add(btnUpdate);
        add(btnDelete);
        btnAdd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new PersonFrame(e);

            }

        });

        btnUpdate.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new PersonFrame(e);
            }
        });

        btnDelete.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new PersonFrame(e);
            }

        });
    }


    //графика

    public void paintComponent(Graphics g)
    {
        Image im = null;
        try
        {
            im = ImageIO.read(new File("C:\\texture-metal.jpg"));
        } catch (IOException e)
        {
        }
        g.drawImage(im, 0, 0, null);
    }

    protected ImageIcon createIcon(String path)
    {
        URL imgURL = AppFrame.class.getResource(path);
        if (imgURL != null)
        {
            return new ImageIcon(imgURL);
        }
        else
        {
            System.err.println("File not found " + path);
            return null;
        }
    }
}

