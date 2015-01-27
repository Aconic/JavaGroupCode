package TestPP;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PanelPaint extends JPanel implements MouseListener,
        MouseMotionListener, ActionListener, MouseWheelListener
{
    JButton button;
    JButton buttonSize1;
    JButton buttonSize2;
    JLabel field;
    JSlider slider;
    JPopupMenu popupMenu;
    private int x = 0;
    private int y = 0;
    Graphics2D g;
    private Color col;
    private int lw = 1;

    public void setColor(Color col)
    {
        this.col = col;
    }

    public void setWl(int lw)
    {
        this.lw = lw;
    }

    public PanelPaint()
    {
        setLayout(null);
        field = new JLabel();
        button = new JButton("Color");
        buttonSize1 = new JButton("1");
        buttonSize2 = new JButton("5");
        slider = new JSlider(1, 50, 1);
        MyMenuItem myMenuItem = new MyMenuItem(this);
        popupMenu = new JPopupMenu();
        popupMenu.add(myMenuItem.getColorMenu());
        popupMenu.add(myMenuItem.getDepthMenu());
        popupMenu.addSeparator();
        popupMenu.add(myMenuItem.getColorRed());
        popupMenu.add(myMenuItem.getColorBlue());
        popupMenu.add(myMenuItem.getColorYellow());
        setComponentPopupMenu(popupMenu);

        field.setBounds(10, 10, 150, 30);
        button.setBounds(10, 50, 150, 30);
        buttonSize1.setBounds(170, 10, 150, 30);
        buttonSize2.setBounds(170, 50, 150, 30);
        slider.setBounds(10, 90, 320, 20);

        add(field);
        add(button);
        add(buttonSize1);
        add(buttonSize2);
        add(slider);

        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
        buttonSize1.addActionListener(this);
        buttonSize2.addActionListener(this);
        slider.addChangeListener(new ChangeListener()
        {

            @Override
            public void stateChanged(ChangeEvent e)
            {
                JSlider qwe = (JSlider) e.getSource();
                lw = qwe.getValue();
                field.setText("" + lw);
            }
        });

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                col = JColorChooser.showDialog(null, "Color", Color.BLACK);
            }
        });
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
        g = (Graphics2D) this.getGraphics();
        g.setColor(col);
        g.setStroke(new BasicStroke(lw));
        g.drawLine(x, y, e.getX(), e.getY());
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        x = Integer.parseInt(e.getActionCommand());
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e)
    {

        x += e.getUnitsToScroll();
        if (x < 1)
        {
            x = 1;
        }
        else if (x > 50)
        {
            x = 50;
        }
        field.setText("" + x);
        slider.setValue(x);
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        // TODO Auto-generated method stub

    }
}