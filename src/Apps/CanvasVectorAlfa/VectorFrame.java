package Apps.CanvasVectorAlfa;

import javax.swing.*;
import java.io.FileNotFoundException;

public class VectorFrame extends JFrame
{
    public VectorFrame() throws FileNotFoundException
    {
        setLayout(null);
        setBounds(100, 100, 600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Data data = new Data();
        JPanel pb = new PanelButton(data);
        JPanel pv = new PanelVector(data);
        data.panelVector = (PanelVector) pv;
        JMenuBar menuBar = new Menu(data);

        pb.setBounds(0, 0, 150, 600);
        pv.setBounds(150, 0, 600, 600);

        add(pb);
        add(pv);

        setJMenuBar(menuBar);
        setVisible(true);
    }

}
