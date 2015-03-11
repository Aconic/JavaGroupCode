package Apps.BiTreePaint;

import javax.swing.*;

public class TreeFrame extends JFrame
{
    JButton btn;
    TreePanel panel;
    int x = 0;
    int y = 0;

    TreeFrame()
    {
        setLayout(null);

        setBounds(300, 300, 600, 400);
        btn = new JButton("Show tree");
        btn.setBounds(10, 10, 120, 20);
        panel = new TreePanel();
        add(panel);
     /*   btn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                panel.drawNode( x, y);
            }
        });  */
        add(btn);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
