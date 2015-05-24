package com.aconic.apps.Calculator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class PanelCalc extends JPanel
{
    private JTextField msgField;
    private String req = "";
    boolean isDone = false;

    public PanelCalc() throws IOException
    {
        setLayout(new GridLayout(4, 4));
        setBackground(Color.GRAY.brighter());

        msgField = new JTextField();
        Font f = new Font("Arial", Font.BOLD, 28);
        JButton[] btn = new JButton[10];
        JButton btnCalc = new JButton("=");
        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnMultiply = new JButton("*");
        JButton btnDivide = new JButton("/");
        msgField.setFont(f);
        btnCalc.setFont(f);
        btnCalc.setBackground(Color.green.darker());

        add(msgField);
        for (int i = 9; i >= 0; i--)
        {
            btn[i] = new JButton(i + "");
            btn[i].setActionCommand(String.valueOf(i));
            btn[i].setFont(f);
            add(btn[i]);
            btn[i].addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    msgField.setText(msgField.getText() + e.getActionCommand());
                }
            });
        }
        add(btnCalc);
        add(btnPlus);
        add(btnMinus);
        add(btnMultiply);
        add(btnDivide);
        JButton[] btnAct = {btnPlus, btnMinus, btnMultiply, btnDivide};

        for (JButton i : btnAct)
        {
            i.setActionCommand(i.getText());
            i.setFont(f);
            i.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    req += "x=" + msgField.getText();
                    if (e.getActionCommand().equals("+"))
                    {
                        req += "&sign=" + "p";
                    }
                    else
                    {
                        req += "&sign=" + e.getActionCommand();
                    }
                    msgField.setText(msgField.getText() + e.getActionCommand());
                }
            });
        }
        btnCalc.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String str = msgField.getText();
                String op = req.substring(req.length() - 1);
                System.out.println("op: " + op);
                String y = "";
                switch (op)
                {
                    case "p":
                        y = str.substring(str.indexOf("+") + 1);
                        break;
                    case "-":
                        y = str.substring(str.indexOf("-") + 1);
                        break;
                    case "*":
                        y = str.substring(str.indexOf("*") + 1);
                        break;
                    case "/":
                        y = str.substring(str.indexOf("/") + 1);
                        break;
                    default:
                        break;
                }
                req += "&y=" + y;
                System.out.println("params: " + req);
                try
                {
                    sendToCalc(req);
                    isDone = true;
                } catch (MalformedURLException e1)
                {
                    e1.printStackTrace();
                }
            }
        });
    }

    public void sendToCalc(String params) throws MalformedURLException
    {
        HttpURLConnection conn = null;

        try
        {
            URL url = new URL("http://localhost/xampp/test/calc.php");
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Content-Length", String.valueOf(params.length()));

            DataOutputStream out = new DataOutputStream(conn.getOutputStream());
            out.writeBytes(params);
            out.flush();
            out.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = in.readLine()) != null)
            {
                response.append(line);
                getResult(response);
            }
        } catch (IOException e1)
        {
            e1.printStackTrace();
        } finally
        {
            if (conn != null)
            {
                conn.disconnect();
            }
        }
    }

    private void getResult(StringBuilder response)
    {


        msgField.setText(String.valueOf(response));
        msgField.setBackground(Color.YELLOW);
        req = "";
    }
}

