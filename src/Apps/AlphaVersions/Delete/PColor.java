package Apps.AlphaVersions.Delete;
import javax.swing.*;
import java.awt.*;


public class PColor extends JPanel 
{	
	public PColor(PCommands cmd) 
	{
		setLayout(null);
		
		setBackground(Color.BLUE);
		JButton btnColor = new JButton("Color");
		btnColor.setBounds(10, 20, 120, 20);
		add(btnColor);
		
		btnColor.addActionListener(cmd.colCmd);
	}
}
