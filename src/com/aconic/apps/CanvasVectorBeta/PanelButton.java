package com.aconic.apps.CanvasVectorBeta;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;


public class PanelButton extends JPanel  implements MouseWheelListener
{
    Data data;
    JSlider slider;
    JLabel labelLw;

    public PanelButton(Data d)
    {
        this.data = d;
        setBackground(Color.DARK_GRAY.darker());
        JButton btnRect = new JButton("Квадрат");
        JButton btnRound = new JButton("Круг");
        JButton btnRectR = new JButton("Квадрат уг.");
        JButton btnLine = new JButton("Линия");
        JButton btnClear = new JButton("Очистить");

        slider = new JSlider(JSlider.HORIZONTAL, 1, 14, 1);

        labelLw = new JLabel(String.valueOf(data.lw)+ " px");
        labelLw.setForeground(Color.white);
        JButton btnColor = new JButton("Цвет");

        btnRect.setBounds(20,20,100,30);
        btnRound.setBounds(20,60,100,30);
        btnRectR.setBounds(20,100,100,30);
        btnLine.setBounds(20,140,100,30);
        btnClear.setBounds(20,180,100,30);

        labelLw.setBounds(60,220,50,30);
        slider.setBounds(20,250,100,30);
        btnColor.setBounds(20,300,100,30);


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



        slider.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                data.lw = slider.getValue();
                labelLw.setText(data.lw + " px");
            }
        });

        btnColor.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                data.color = JColorChooser.showDialog(null, "Select Color", data.color);
            }
        });

        add(btnRect);
        add(btnRound);
        add(btnRectR);
        add(btnLine);
        add(btnClear);
        add(labelLw);
        add(slider);
        add(btnColor);
        setLayout(null);
        addMouseWheelListener(this);
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e)
    {
        data.lw += e.getWheelRotation();

        if (data.lw < 1)
        {
            data.lw = 1;
        }
        else if (data.lw > 14)
        {
            data.lw = 14;
        }
        slider.setValue(data.lw);
        labelLw.setText(data.lw + " px");
    }

}
