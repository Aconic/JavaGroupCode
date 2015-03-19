package Apps.AlphaVersions.Delete;
import javax.swing.*;

public class FrameDraw extends JFrame
{

	public FrameDraw () 
	{
		setTitle ("App for insert person");
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setBounds (300, 150, 540, 470);
		
		FSets sets = new FSets();
		PCommands cmd = new PCommands();
		cmd.sets = sets;
		
		PColor pc = new PColor(cmd);
		PanelDraw pd = new PanelDraw();
		PWidth pw = new PWidth(cmd);
		
		
		pd.sets = sets;
		
		pc.setBounds(0, 0, 200, 200);
		pd.setBounds(200, 0, 400, 400);
		pw.setBounds(0,200,200,200);
		
		JPanel pp = (JPanel) getContentPane();
		pp.setLayout(null);
		pp.add(pd);
		pp.add(pc);
		pp.add(pw);
		
		
		
		
		FMenu mnu = new FMenu(cmd);
		setJMenuBar( mnu );
		
		setVisible (true);		

	}		
}
