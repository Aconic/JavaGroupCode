
package Lesson47.ZeroXClassWork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static javax.swing.JOptionPane.showInputDialog;


public class ClientCmd
{
    Socket cs = null;
    DataOutputStream out = null;
    DataInputStream in = null;
    Timer tt = null;

    ConnectAction actConn = new ConnectAction();
    AuthAction actAuth = new AuthAction();
    InviteAction actInvt = new InviteAction();
    DisconnectAction actDisconn = new DisconnectAction();
    PanelCmd panelCmd;
    PanelXO panelXO;

    public ClientCmd()
    {
        tt = new Timer(50, new ServerMsgAction());
    }

    public void setCmdPanel(PanelCmd panel)
    {
        this.panelCmd = panel;
    }

    public void setGamePanel(PanelXO panel)
    {
        this.panelXO = panel;
    }

    class ConnectAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                cs = new Socket("localhost", 7777);
                out = new DataOutputStream(cs.getOutputStream());
                in = new DataInputStream(cs.getInputStream());
                tt.start();
                panelCmd.cmdConnect.setEnabled(false);
                panelCmd.cmdDisconnect.setEnabled(true);
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }
    }

    class AuthAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                String name = showInputDialog(null);
                out.writeUTF("auth:" + name);
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }
    }

    class InviteAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                String str = showInputDialog(null);
                out.writeUTF("invite:" + str);
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }
    }

    class ServerMsgAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                if (cs.getInputStream().available() > 0)
                {
                    String str = in.readUTF();
                    String[] input = str.split(":");
                    switch (input[0])
                    {
                        case "inviteFrom":
                            int reply = JOptionPane.showConfirmDialog(null, "Invitation", "Invite", JOptionPane.YES_NO_OPTION);
                            if(reply==JOptionPane.NO_OPTION)
                            {
                              System.exit(0);
                            }

                            break;
                        case "Users":
                            String lineIn = input[1].substring(1, input[1].length() - 2);
                            String[] names = lineIn.split(",");
                            panelCmd.clearList();
                            for (String i : names)
                            {
                                panelCmd.addNameToList(i);
                            }
                            break;
                        case "button":
                            String btnNum = input[1].substring(0, 1);
                            String btnSign = input[1].substring(input[1].length() - 1);
                            panelXO.buttonPressed(btnNum,btnSign);
                            break;
                    }
                }
            } catch (IOException ev)
            {
                ev.printStackTrace();
            }
        }
    }

    private class DisconnectAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try {
                out.writeUTF("exit:");
                tt.stop();
                out.close();
                in.close();
                cs.close();
                panelCmd.cmdConnect.setEnabled(true);
                panelCmd.cmdDisconnect.setEnabled(false);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
