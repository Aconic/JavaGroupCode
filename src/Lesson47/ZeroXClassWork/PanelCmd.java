
package Lesson47.ZeroXClassWork;
import javax.swing.*;

public class PanelCmd extends JPanel
{        JList<String> list;
    DefaultListModel<String> listModel;
    JButton cmdConnect;
    JButton cmdDisconnect;
    public PanelCmd(ClientCmd cmd)
    {
        setLayout(null);
        cmd.setCmdPanel(this);
        cmdConnect = new JButton("Connect");
        JButton cmdAuth    = new JButton("Enter");
        JButton cmdInvite  = new JButton("Invite");
        cmdDisconnect  = new JButton("Disconnect");
        listModel = new DefaultListModel<String>();
        list = new JList<String>(listModel);
        list.setLayoutOrientation(JList.VERTICAL);

        cmdConnect.setBounds(10,10,100,20);
        cmdAuth.setBounds(10,40,100,20);
        cmdInvite.setBounds(10,70,100,20);
        cmdDisconnect.setBounds(10,100,100,20);
        cmdDisconnect.setEnabled(false);
        list.setBounds(10,130, 100,180);

        add(cmdConnect);
        add(cmdAuth);
        add(cmdInvite);
        add(cmdDisconnect);
        add(list);
        cmdConnect.addActionListener(cmd.actConn);
        cmdAuth.addActionListener(   cmd.actAuth);
        cmdInvite.addActionListener( cmd.actInvt);
        cmdDisconnect.addActionListener(cmd.actDisconn);
     }

    public void addNameToList(String str)
    {
           listModel.addElement(str);
    }
    public void clearList()
    {
        listModel.removeAllElements();
    }
}
