package Apps.Canvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class PaintPanel extends JPanel implements MouseListener, MouseMotionListener
{

    Graphics2D g = (Graphics2D) this.getGraphics();
    Color col = Color.BLACK;
    int x = 0;
    int y = 0;

    DataSet data = null;
    JPopupMenu popupMenu = null;
    MenuContext menuContext = null;
    BufferedImage img;

    PaintPanel(Command cmd)
    {
        data = cmd.data;
        data.figureSelect = new FigurePen(this);
        cmd.paintPanel = this;
        addMouseListener(data.figureSelect);
        addMouseMotionListener(data.figureSelect);

        setLayout(null);
        setBackground(Color.darkGray);
        menuContext = new MenuContext(cmd);
        popupMenu = new JPopupMenu();
        popupMenu.add(menuContext.lwMenu);
        popupMenu.add(menuContext.colMenu);
        setComponentPopupMenu(popupMenu);
        img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_ARGB);
        img.getGraphics().fillRect(0, 0, 600, 400);

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
   public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(data.img,0,0, 600,400,null);
    }


    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(col);
        g.fillRect(0, 0, 20, 20);
    }

    void addMListener(MouseListener mListener)
    {
        MouseListener[] ml = getMouseListeners();

        if (ml != null)
        {
            for (MouseListener myMl : ml)
            {
                removeMouseListener(myMl);
            }
        }
        addMouseListener(mListener);
    }

    void addMyMotionListener(MouseMotionListener mListener)
    {
        MouseMotionListener[] mml = getMouseMotionListeners();
        if (mml != null)
        {
            for (MouseMotionListener myMl : mml)
            {
                removeMouseMotionListener(myMl);
            }
        }
        addMouseMotionListener(mListener);
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

