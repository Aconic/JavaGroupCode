package Apps.BiTreePaint;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class TreePanel extends JPanel
{
    BufferedImage img;
    Graphics2D g;
    BsTree tree;
    TreePanel()
    {
        tree = new BsTree();

        setLayout(null);
        setBounds(20, 40, 400, 300);
        setBackground(Color.ORANGE);
        img = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        img.getGraphics().fillRect(0, 0, 400, 300);
    }

    public void drawNode(Graphics g, int x, int y)
    {
       // g=(Graphics2D) this.getGraphics();
        x = 100;
        y = 100;
        g.setColor(Color.RED);
       // g.setStroke(new BasicStroke(2));
        g.drawOval(x, y, 30, 30);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        drawNode(g, 20, 20);
    }

 /*   @Override
    public void paint(Graphics g)
    {
        super.paint(g);
          drawNode(20, 20);
        g.drawImage(img,0,0, 400,300,null);

    }*/
}
