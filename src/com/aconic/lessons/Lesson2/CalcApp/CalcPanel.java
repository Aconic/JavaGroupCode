package com.aconic.lessons.Lesson2.CalcApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcPanel extends JPanel
{
    JButton btn0 = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnPlus = new JButton("+");
    JButton btnMinus = new JButton("-");
    JButton btnMult = new JButton("*");
    JButton btnDiv = new JButton("/");
    JButton btnRes = new JButton("=");
    JButton btnCancel = new JButton("С");
    JTextField display = new JTextField();
    int a = 0;
    int b = 0;
    String op = null;

    public CalcPanel()
    {
        setLayout(null);

        btn0.setBounds(10, 200, 100, 30);
        btnCancel.setBounds(110, 200, 50, 30);
        btn1.setBounds(10, 160, 50, 30);
        btn2.setBounds(60, 160, 50, 30);
        btn3.setBounds(110, 160, 50, 30);
        btn4.setBounds(10, 120, 50, 30);
        btn5.setBounds(60, 120, 50, 30);
        btn6.setBounds(110, 120, 50, 30);
        btn7.setBounds(10, 80, 50, 30);
        btn8.setBounds(60, 80, 50, 30);
        btn9.setBounds(110, 80, 50, 30);
        btnPlus.setBounds(170, 80, 50, 30);
        btnMinus.setBounds(170, 120, 50, 30);
        btnMult.setBounds(170, 160, 50, 30);
        btnDiv.setBounds(170, 200, 50, 30);
        btnRes.setBounds(230, 80, 45, 150);
        display.setBounds(10, 30, 150, 40);
        add(display);
        add(btn0);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btnPlus);
        add(btnMinus);
        add(btnMult);
        add(btnDiv);
        add(btnRes);
        add(btnCancel);

        btn0.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                display.setText(display.getText() + "0");
            }
        });

        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                display.setText(display.getText() + "1");
            }
        });

        btn2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                display.setText(display.getText() + "2");
            }
        });

        btn3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                display.setText(display.getText() + "3");
            }
        });

        btn4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                display.setText(display.getText() + "4");
            }
        });

        btn5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                display.setText(display.getText() + "5");
            }
        });

        btn6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                display.setText(display.getText() + "6");
            }
        });

        btn7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                display.setText(display.getText() + "7");
            }
        });

        btn8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                display.setText(display.getText() + "8");
            }
        });

        btn9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                display.setText(display.getText() + "9");
            }
        });

        btnPlus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                a = Integer.valueOf(display.getText());
                op = "+";
                display.setText(display.getText());
                display.setText("");
            }
        });

        btnMinus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                a = Integer.valueOf(display.getText());
                op = "-";
                display.setText(display.getText());
                display.setText("");
            }
        });

        btnMult.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                a = Integer.valueOf(display.getText());
                op = "*";
                display.setText(display.getText());
                display.setText("");
            }
        });

        btnDiv.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                a = Integer.valueOf(display.getText());
                op = "/";
                display.setText("");
            }
        });

        btnRes.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                int b = Integer.valueOf(display.getText());
                int res = CalcFunc.calc(a, b, op);
                display.setText("" + res);

            }
        });
        btnCancel.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                a = 0;
                b =0 ;
                op = null;
                display.setText("0");
            }
        });
    }
}


