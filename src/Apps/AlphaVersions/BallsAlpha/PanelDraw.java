package Apps.AlphaVersions.BallsAlpha;



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelDraw extends JPanel implements MouseListener
{
    PanelBall ball;
    Data data;
    int x;
    int y;

    public PanelDraw(Data data)
    {
        this.data = data;
        setLayout(null);
        addMouseListener(this);
        setBackground(Color.white.darker());
    }

    @Override
    public void mouseClicked(MouseEvent e)     {

      }

    @Override
    public void mousePressed(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
     }
    @Override
    public void mouseReleased(MouseEvent e)
    {
        ball = new PanelBall(data);
        ball.setBounds(x-20, y-20, 40, 40);
        this.add(ball);
        repaint();
    }
      @Override
    public void mouseEntered(MouseEvent e)    {
    }
    @Override
    public void mouseExited(MouseEvent e)     {
    }
}
