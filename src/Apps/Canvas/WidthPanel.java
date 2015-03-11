package Apps.Canvas;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class WidthPanel extends JPanel implements MouseListener, MouseMotionListener, MouseWheelListener
{
    JButton btnWeight1 = null;
    JButton btnWeight5 = null;
    JRadioButton radioButtonWeight1 = null;
    JRadioButton radioButtonWeight5 = null;
    JTextField textField = null;
    JSlider slider = null;
    JLabel labelW = null;
    DataSet data = null;

    WidthPanel(Command cmd)
    {
        setLayout(null);
        setBackground(Color.cyan.darker());
        addMouseWheelListener(this);
        data = cmd.data;

        btnWeight1 = new JButton("W=1");
        btnWeight5 = new JButton("W=5");
        radioButtonWeight1 = new JRadioButton("W=1");
        radioButtonWeight5 = new JRadioButton("W=5");
        ButtonGroup buttonGroup = new ButtonGroup();
        textField = new JTextField();
        slider = new JSlider(JSlider.HORIZONTAL, 1, 14, 1);
        labelW = new JLabel();

        textField.setBounds(10, 20, 120, 25);
        btnWeight1.setBounds(10, 50, 60, 25);
        btnWeight5.setBounds(70, 50, 60, 25);

        labelW.setBounds(10, 100, 80, 25);
        slider.setBounds(10, 120, 80, 25);
        radioButtonWeight1.setBounds(10, 160, 50, 25);
        radioButtonWeight5.setBounds(70, 160, 50, 25);
        labelW.setText(data.lw + " px");

        add(btnWeight1);
        add(btnWeight5);
        add(textField);
        add(slider);
        add(labelW);
        buttonGroup.add(radioButtonWeight1);
        buttonGroup.add(radioButtonWeight5);
        add(radioButtonWeight1);
        add(radioButtonWeight5);

        btnWeight1.addActionListener(cmd.lineWCmd_1);
        btnWeight5.addActionListener(cmd.lineWCmd_5);

        radioButtonWeight1.addActionListener(cmd.lineWCmd_1);
        radioButtonWeight5.addActionListener(cmd.lineWCmd_5);

        slider.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent changeEvent)
            {
                data.lw = slider.getValue();
                labelW.setText(data.lw + " px");
            }
        });
    }


    @Override
    public void mouseWheelMoved(MouseWheelEvent e)
    {
        data.lw += e.getWheelRotation();

        if (data.lw < 1)
        {
            data.lw = 1;
        }
        else if (data.lw > 14)
        {
            data.lw = 14;
        }
        slider.setValue(data.lw);
        labelW.setText(data.lw + " px");
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent)
    {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent)
    {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent)
    {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent)
    {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent)
    {
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent)
    {

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent)
    {

    }

}




