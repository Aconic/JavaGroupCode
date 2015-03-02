package Canvas;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Command
{
    DataSet data = null;
    PaintPanel paintPanel = null;

    ColorCommand colCmd = new ColorCommand();
    ColorCommandRed colCmdRed = new ColorCommandRed();
    ColorCommandGreen colCmdGreen = new ColorCommandGreen();
    ColorCommandBlue colCmdBlue = new ColorCommandBlue();

    LineWCommand_1 lineWCmd_1 = new LineWCommand_1();
    LineWCommand_5 lineWCmd_5 = new LineWCommand_5();
    LineWCommand_7 lineWCmd_7 = new LineWCommand_7();


    PenCommand penCommand = new PenCommand();
    RectangleCommand rectangleCommand = new RectangleCommand();
    CircleCommand circleCommand = new CircleCommand();
    RectangleRoundedCommand rectangleRoundedCommand = new RectangleRoundedCommand();
    FileOpenCommand fileOpenCommand = new FileOpenCommand();
    FileSaveCommand fileSaveCommand = new FileSaveCommand();

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


    class RectangleCommand implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent arg0)
        {
            data.figureSelect = new FigureRect(paintPanel);
            paintPanel.addMListener(data.figureSelect);
            paintPanel.addMyMotionListener(data.figureSelect);
        }
    }

    class PenCommand implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent arg0)
        {
            data.figureSelect = new FigurePen(paintPanel);
            paintPanel.addMListener(data.figureSelect);
            paintPanel.addMyMotionListener(data.figureSelect);
        }
    }

    class CircleCommand implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent arg0)
        {
            data.figureSelect = new FigureCircle(paintPanel);
            paintPanel.addMListener(data.figureSelect);
            paintPanel.addMyMotionListener(data.figureSelect);
        }
    }

    class RectangleRoundedCommand implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            data.figureSelect = new FigureRectRounded(paintPanel);
            paintPanel.addMListener(data.figureSelect);
            paintPanel.addMyMotionListener(data.figureSelect);
        }
    }

    class FileOpenCommand implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            JFileChooser fileChooser = new JFileChooser();
            int res = fileChooser.showOpenDialog(null);
            if (res == JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    data.img = ImageIO.read(fileChooser.getSelectedFile());
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
                paintPanel.img.getGraphics().drawImage(data.img, 0, 0, 400, 400, null);
                paintPanel.repaint();
            }
        }
    }

    class FileSaveCommand implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            JFileChooser fileChooser = new JFileChooser();
            FileFilter imageFilter = new FileNameExtensionFilter("Image", ImageIO.getReaderFileSuffixes());
            FileFilter imageFilterJpg = new FileNameExtensionFilter("*.JPG", "jpg");
            FileFilter imageFilterBmp = new FileNameExtensionFilter("*.BMP", "bmp");
            fileChooser.setFileFilter(imageFilter);
            fileChooser.addChoosableFileFilter(imageFilterJpg);
            fileChooser.addChoosableFileFilter(imageFilterBmp);
            int res = fileChooser.showSaveDialog(null);
            if (res == JFileChooser.APPROVE_OPTION)
            {
                  try
                {
                    ImageIO.write(data.img, "JPG", fileChooser.getSelectedFile());
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}





