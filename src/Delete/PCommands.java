package Delete;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PCommands 
{
	FSets sets = null;
	
	ColorCmd      colCmd      = new ColorCmd();
	ColorCmdRed   colCmdRed   = new ColorCmdRed();
	ColorCmdGreen colCmdGreen = new ColorCmdGreen();
	ColorCmdBlue  colCmdBlue  = new ColorCmdBlue();
	
	WidthCmd_1  wCmd1  = new WidthCmd_1();
	WidthCmd_3  wCmd3  = new WidthCmd_3();
	WidthCmd_7  wCmd7  = new WidthCmd_7();
	WidthCmd_10 wCmd10 = new WidthCmd_10();
	
	class ColorCmd implements ActionListener
	{	
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			sets.col =  JColorChooser.showDialog(null, "Select Color", sets.col);
		}
	}
	class ColorCmdRed implements ActionListener
	{	
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			sets.col =  Color.red;
		}
	}
	class ColorCmdGreen implements ActionListener
	{	
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			sets.col =  Color.green;
		}
	}
	class ColorCmdBlue implements ActionListener
	{	
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			sets.col =  Color.blue;
		}
	}
	
	class WidthCmd_1 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			sets.width = 1;
		}
	}
	class WidthCmd_3 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			sets.width = 3;
		}
	}
	class WidthCmd_7 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			sets.width = 7;
		}
	}
	class WidthCmd_10 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			sets.width = 10;
		}
	}
}
