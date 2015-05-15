package Apps.ChatSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class PanelChat extends JPanel
{
    DataOutputStream out;
    JTextField msgField;
    JTextArea textArea;

    public PanelChat() throws IOException
    {
        setLayout(null);
        setBackground(Color.GRAY.brighter());
        textArea = new JTextArea();

        msgField = new JTextField();
        msgField.setText("Enter your name");
        JButton btnSend = new JButton("Send");

        textArea.setBounds(10, 10, 300, 200);
        msgField.setBounds(10, 220, 300, 40);
        btnSend.setBounds(150, 300, 120, 30);

        add(textArea);
        add(msgField);
        add(btnSend);

        btnSend.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    getClientText();
                } catch (IOException e1)
                {
                    e1.printStackTrace();
                }

            }
        });

        msgField.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    getClientText();
                } catch (IOException e1)
                {
                    e1.printStackTrace();
                }
            }
        });
        startClient();
    }


    private void getClientText() throws IOException
    {
        out.writeUTF(msgField.getText());
        msgField.setText("");
    }


    private void startClient() throws IOException
    {
        Socket cs = new Socket("LocalHost", 7777);
        out = new DataOutputStream(cs.getOutputStream());
        ClientListener cl = new ClientListener(new Socket("LocalHost", 7777), this);
        cl.setDaemon(true);
        cl.start();
    }

}

