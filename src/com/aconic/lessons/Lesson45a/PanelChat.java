package com.aconic.lessons.Lesson45a;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelChat extends JPanel
{
    JTextField txt1 = null;
    JButton    btn1 = null;
    JTextArea textArea = null;
    ChatClient cln = null;

    public PanelChat()
    {
        setLayout(null);

        txt1 = new JTextField();
        btn1 = new JButton("Send");
        textArea = new JTextArea();

        txt1.setBounds(70, 200, 350, 20);
        btn1.setBounds(160, 250, 120, 20);
        textArea.setBounds(70, 10, 350, 180);

        add(txt1);
        add(btn1);
        add(textArea);

        cln = new ChatClient(textArea);

        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                cln.sendMessage(txt1.getText());
            }
        });

        cln.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea.append(e.getActionCommand());
            }
        });

    }
}