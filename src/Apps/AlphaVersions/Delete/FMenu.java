package Apps.AlphaVersions.Delete;
import javax.swing.*;


public class FMenu extends JMenuBar
{	
	public FMenu(PCommands cmd)
	{
		JMenu mnuColor = new JMenu("Color");
		add(mnuColor);
		JMenuItem mnuRed   = new JMenuItem("Red");
		JMenuItem mnuGreen = new JMenuItem("Green");
		JMenuItem mnuBlue  = new JMenuItem("Blue");
		
		mnuRed.addActionListener(cmd.colCmdRed);
		mnuGreen.addActionListener(cmd.colCmdGreen);
		mnuBlue.addActionListener(cmd.colCmdBlue);
		
		mnuColor.add(mnuRed);
		mnuColor.add(mnuGreen);
		mnuColor.add(mnuBlue);
		
		
		
		
		JMenu mnuWidth = new JMenu("Width");
		add(mnuWidth);
		mnuWidth.add(new JMenuItem("1"));
		mnuWidth.add(new JMenuItem("3"));
		mnuWidth.add(new JMenuItem("5"));
		mnuWidth.add(new JMenuItem("7"));
		
		
		
	}
}
