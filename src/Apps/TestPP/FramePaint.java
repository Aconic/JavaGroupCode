package Apps.TestPP;


 import javax.swing.JFrame;
 import javax.swing.JMenuBar;

 public class FramePaint extends JFrame {
 public FramePaint() {
 setTitle("Apps.Test PersonDB");
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setBounds(100, 100, 800, 600);

 PanelPaint panel = new PanelPaint();
 MyMenuItem menuItem = new MyMenuItem(panel);
 menuItem.setText("Menu");
 JMenuBar menuBar = new JMenuBar();
 menuBar.add(menuItem);
 setJMenuBar(menuBar);
 add(panel);

 setVisible(true);
 }
 }