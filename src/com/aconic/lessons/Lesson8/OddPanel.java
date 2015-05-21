package com.aconic.lessons.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OddPanel extends JPanel
{
    JTextField txt1 = null;
    JTextField txt2 = null;
    JTextField txt3 = null;
    JTextField txtR = null;

    JLabel lbl1 = null;
    JLabel lbl2 = null;
    JLabel lbl3 = null;
    JLabel lblRes = null;
    JButton btn1 = null;
    String[] elements = {"+", "-", "*", "/"};
    JComboBox list = new JComboBox(elements);

    JRadioButton boxPlus = new JRadioButton("+");
    JRadioButton boxMinus = new JRadioButton("-");
    JRadioButton boxMult = new JRadioButton("*");
    JRadioButton boxDiv = new JRadioButton("/");

    ButtonGroup group = new ButtonGroup();
    int a = 0;
    int b = 0;
    String s = null;

    public OddPanel()
    {
        setLayout(null);
        lbl1 = new JLabel("Введите первое число: ");
        lbl2 = new JLabel("Операция");
        lbl3 = new JLabel("Введите второе число:");
        lblRes = new JLabel("Результат:");
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        txtR = new JTextField();
        btn1 = new JButton("Calc Func");
        lbl1.setBounds(10, 10, 150, 18);
        lbl2.setBounds(10, 40, 150, 18);
        lbl3.setBounds(10, 70, 150, 18);
        lblRes.setBounds(10, 100, 150, 18);
        lblRes.setForeground(Color.BLUE);
        txt1.setBounds(160, 10, 120, 20);
        txt2.setBounds(160, 40, 120, 20);
        txt3.setBounds(160, 70, 120, 20);
        txtR.setBounds(160, 100, 120, 20);
        btn1.setBounds(160, 180, 120, 20);
        list.setBounds(160, 220, 120, 20);
        boxPlus.setBounds(160, 260, 50, 30);
        boxMinus.setBounds(160, 290, 50, 30);
        boxMult.setBounds(160, 320, 50, 30);
        boxDiv.setBounds(160, 350, 50, 30);


        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lblRes);
        add(txt1);
        add(txt2);
        add(txt3);
        add(txtR);
        add(btn1);
        add(list);
        group.add(boxPlus);
        group.add(boxMinus);
        group.add(boxMult);
        group.add(boxDiv);
        add(boxPlus);
        add(boxMinus);
        add(boxDiv);
        add(boxMult);

        boxPlus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                s = "+";
            }
        });
        boxMinus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                s = "-";
            }
        });
        boxMult.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                s = "*";
            }
        });
        boxDiv.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                s = "/";
            }
        });


        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                a = Integer.parseInt(txt1.getText());
                //s = txt2.getText();                     //для поля
                int index = list.getSelectedIndex();
                // s = elements[index];                         //для списка
                b = Integer.parseInt(txt3.getText());
                int res = Func.calc(a, b, s);
                txtR.setText(res + "");
            }
        });
    }

}
