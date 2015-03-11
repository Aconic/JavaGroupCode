package Apps.Tester;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PButton extends JPanel
{
    JButton btnToXML;
    JButton btnfromXML;
    PPanel pPanel;

      public PButton(PPanel p)
    {
        this.pPanel = p;
        setBounds(500, 0, 300, 600);
        setBackground(Color.BLACK);
        btnToXML = new JButton("ToXML");
        btnfromXML = new JButton("FromXML");
        btnToXML.setBounds(10,10,120,30);
        btnfromXML.setBounds(10,50,120,30);
        add(btnToXML);
        add(btnfromXML);
        setLayout(null);

        btnToXML.addActionListener(new ActionListener()
        {
            @Override

            public void actionPerformed(ActionEvent e)
            {
                String str="";
                 for(Component c : pPanel.getComponents())
                 {
                 //str+=
                 }
            }
        });
    }





}
