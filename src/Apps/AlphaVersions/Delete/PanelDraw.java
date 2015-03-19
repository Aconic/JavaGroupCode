package Apps.AlphaVersions.Delete;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class PanelDraw extends JPanel implements MouseListener, MouseMotionListener
{
	int x = 0;
	int y = 0;
	
	FSets sets = null;

	public PanelDraw() 
	{
		setLayout(null);
		setBackground(Color.yellow);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) 
	{
		Graphics2D g = (Graphics2D) this.getGraphics();
		g.setColor(sets.col);
		g.setStroke(new BasicStroke (sets.width));
		g.drawLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
}

