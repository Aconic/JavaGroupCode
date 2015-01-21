package Canvas;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Command
{
    DataSet data = null;

    ColorCommand colCmd = new ColorCommand();
    ColorCommandRed colCmdRed = new ColorCommandRed();
    ColorCommandGreen colCmdGreen = new ColorCommandGreen();
    ColorCommandBlue colCmdBlue = new ColorCommandBlue();

    LineWCommand_1 lineWCmd_1 = new LineWCommand_1();
    LineWCommand_5 lineWCmd_5 = new LineWCommand_5();
    LineWCommand_7 lineWCmd_7 = new LineWCommand_7();

    SliderCommand sldCmd = new SliderCommand();

    class ColorCommand implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            data.col = JColorChooser.showDialog(null, "Select Color", data.col);
        }
    }

    class ColorCommandRed implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            data.col = Color.RED;
        }
    }

    class ColorCommandGreen implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            data.col = Color.GREEN;
        }
    }

    class ColorCommandBlue implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            data.col = Color.BLUE;
        }
    }

    class LineWCommand_1 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            data.lw = 1;
        }
    }


    class LineWCommand_5 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            data.lw = 5;
        }
    }

    class LineWCommand_7 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            data.lw = 7;
        }
    }


    class SliderCommand implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent changeEvent)
        {
            //  data.lw = wp.slider.getValue();
            //    wp.labelW.setText(data.lw + " px");
        }
    }
}
