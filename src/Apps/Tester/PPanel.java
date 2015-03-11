package Apps.Tester;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PPanel extends JPanel implements  MouseListener
{
    int x;
    int y;
    public PPanel()
    {
        setLayout(null);
        setBackground(Color.GRAY);
        setBounds(0, 0, 500, 600);
        addMouseListener(this);

        JButton btnJson = new JButton("to JSON");
        btnJson.setBounds(10,10,120,20);
        add(btnJson);

        JButton btnFromJson = new JButton("from JSON");
        btnFromJson.setBounds(10,40,120,20);
        add(btnFromJson);

        JButton btnToXml = new JButton("To XML");
        btnToXml.setBounds(10,70,120,20);
        add(btnToXml);

        JButton btnFromXml = new JButton("From XML");
        btnFromXml.setBounds(10,100,120,20);
        add(btnFromXml);

        btnJson.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String str = "[";
                for(Component cc : getComponents())
                {
                    //System.out.println(cc.getClass().getName());
                    if(cc.getClass().getName().equals("Apps.Tester.PFigs"))
                    {
                        str += ((PFigs)cc).toJSONString() + ", ";
                    }
                }
                str += str.substring(0,str.length()-2);
                str += "]";
                System.out.println(str);
            }
        });

          btnFromJson.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String str = "{\"x\":168, \"y\":94, \"w\":91, \"h\":69, \"type\":2}, {\"x\":298, \"y\":81, \"w\":107, \"h\":82, \"type\":2}";
                String[] fig = str.split("}, ");
                for(String ss : fig)
                {
                    PFigs pf = new PFigs();
                    pf.fromJSONString(ss.trim());
                    PPanel.this.add(pf);
                    repaint();
                }
            }
        });

    btnToXml.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String str ="<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?>\\n\"";
            for(Component c : getComponents())
            {

              }
          }
    });

    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        PFigs pFigs = new PFigs();
        pFigs.setBounds(x, y, e.getX() - x, e.getY() - y);
        this.add(pFigs);
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
     @Override
    public void mouseEntered(MouseEvent e){}
    @Override
    public void mouseExited(MouseEvent e){}
}
