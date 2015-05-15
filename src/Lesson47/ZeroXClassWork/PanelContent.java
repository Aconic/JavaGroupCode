package Lesson47.ZeroXClassWork;

import javax.swing.*;


public class PanelContent extends JPanel
{
	public PanelContent(ClientCmd cmd)
	{
		setLayout(null);
		PanelCmd pcmd = new PanelCmd(cmd);
		PanelXO pxo = new PanelXO(cmd);
		
		pcmd.setBounds(0, 0, 150, 320);
		pxo.setBounds(150, 12, 320, 300);
		add(pcmd);
		add(pxo);
	}
}


