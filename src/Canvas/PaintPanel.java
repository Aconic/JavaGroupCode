package Canvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintPanel extends JPanel implements MouseListener, MouseMotionListener
{

    Graphics2D g = (Graphics2D) this.getGraphics();
    Color col = Color.BLACK;
    int x = 0;
    int y = 0;

    DataSet data = null;
    JPopupMenu popupMenu = null;
    MenuContext menuContext = null;
    Command cmd = null;

    PaintPanel(Command cmd)
    {
        this.cmd= cmd;
        setLayout(null);
        setBackground(Color.darkGray);
        addMouseListener(this);
        addMouseMotionListener(this);
        menuContext = new MenuContext(cmd);
        popupMenu = new JPopupMenu();

        popupMenu.add(menuContext.lwMenu);
        popupMenu.add(menuContext.colMenu);
        setComponentPopupMenu(popupMenu);
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent)
    {
        g = (Graphics2D) this.getGraphics();
        g.setStroke(new BasicStroke(data.lw));
        g.setColor(data.col);
        g.fillRect(0, 0, 20, 20);
        g.drawLine(x, y, mouseEvent.getX(), mouseEvent.getY());
        x = mouseEvent.getX();
        y = mouseEvent.getY();
        data.x = x;
        data.y = y;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(col);
        g.fillRect(0, 0, 20, 20);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent)
    {
        x = mouseEvent.getX();
        y = mouseEvent.getY();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent)
    {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent)
    {
        //textField.setText("X: " + data.x + " " + "Y: " + data.y);
    }

}

