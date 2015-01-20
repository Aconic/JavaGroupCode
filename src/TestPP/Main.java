package TestPP;

/**
 * Date: 16.01.15 * Time: 21:30
 * To change this template use File | Settings | File Templates.
 */
import javax.swing.SwingUtilities;

public class Main
{

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {

            @Override
            public void run()
            {
                new FramePaint();
            }
        });

    }

}