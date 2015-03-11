package Apps.CanvasVectorBeta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelButton extends JPanel
{
    Data data;

    public PanelButton(Data d)
    {
        this.data = d;
        JButton btnRect = new JButton("Квадрат");
        JButton btnRound = new JButton("Круг");
        JButton btnRectR = new JButton("Квадрат уг.");
        JButton btnLine = new JButton("Линия");
        JButton btnClear = new JButton("Очистить");

        btnRect.setBounds(20,20,100,30);
        btnRound.setBounds(20,60,100,30);
        btnRectR.setBounds(20,100,100,30);
        btnLine.setBounds(20,140,100,30);
        btnClear.setBounds(20,180,100,30);

        btnRect.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                   data.check = 1;
            }
        });
        btnRound.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                data.check = 2;
            }
        });
        btnRectR.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                data.check = 3;
            }
        });
        btnLine.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                data.check = 4;
            }
        });

        btnClear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (data.panelDraw.getComponentCount()>0)
                {
                    data.panelDraw.remove(0);
                    data.panelDraw.repaint();
                }
            }
        });
        add(btnRect);
        add(btnRound);
        add(btnRectR);
        add(btnLine);
        add(btnClear);
        setLayout(null);
    }

}
