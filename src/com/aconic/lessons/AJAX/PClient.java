package com.aconic.lessons.AJAX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class PClient extends JPanel implements AjaxFuncs
{
    JTextArea textArea = null;
    URL url = null;
    JTextField textFieldX = null;
    JTextField textFieldY = null;
    JComboBox<String> comboFieldS = null;

    public PClient()
    {
        setLayout(null);
        setBackground(Color.DARK_GRAY);

        textFieldX = new JTextField();
        textFieldY = new JTextField();
        String [] ss = {"+","-","*","/"};
        comboFieldS = new JComboBox<>(ss);
        textArea = new JTextArea();

        JButton btnSend = new JButton("Calc");
        JButton btnClear = new JButton("Clear");

        textFieldX.setBounds(70, 100, 60, 30);
        comboFieldS.setBounds(140, 100, 40, 30);
        textFieldY.setBounds(180, 100, 60, 30);
        btnClear.setBounds(270, 60, 60, 30);
        btnSend.setBounds(260, 100, 80, 30);
        btnSend.setBackground(Color.GREEN.darker());
        textArea.setBounds(70, 140, 120, 40);

        add(textFieldX);
        add(textFieldY);
        add(comboFieldS);
        add(btnSend);
        add(btnClear);
        add(textArea);
        try
        {
            url = new URL("http://localhost/xampp/test/calc.php");
        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        }

        btnSend.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String params = getData();
                sendPost(url, params);
            }
        });

        textFieldY.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String params = getData();
                sendPost(url, params);
            }
        });
    btnClear.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            textFieldX.setText("");
            textFieldY.setText("");
        }
    });
    }

    public String getData()
    {
        String sign = (String) comboFieldS.getSelectedItem();
        String data="";
        if (sign.equals("+"))
        {
            sign = "p";
        }
        try
        {
             data = "x=" + URLEncoder.encode(textFieldX.getText(), "UTF-8") + "&y=" + URLEncoder.encode(textFieldY.getText(), "UTF-8")
                    + "&sign=" + URLEncoder.encode(sign,"UTF-8");
        } catch (UnsupportedEncodingException e1)
        {
            e1.printStackTrace();
        }
        return data;
    }

    @Override
    public void sendPost(URL url, String params)
    {
        HttpURLConnection conn = null;
        try
        {
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Content-Length", String.valueOf(params.length()));

            DataOutputStream out = new DataOutputStream(conn.getOutputStream());
            System.out.println(params);
            out.writeBytes(params);
            out.flush();
            out.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = in.readLine()) != null)
            {
                response.append(line);
                System.out.println(response);
                textArea.setText(String.valueOf(response));
            }
            in.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            if (conn != null)
            {
                conn.disconnect();
            }
        }
    }
}