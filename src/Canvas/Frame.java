package Canvas;


import javax.swing.*;

public class Frame extends JFrame

{
     Frame()
     {
         setTitle("Paint");
         setLayout(null);
         setBounds(200,200,700,500);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setResizable(false);

         DataSet data = new DataSet();
         Command command = new Command();
         command.data = data;

         ColorPanel colorPanel = new ColorPanel(command);
         WidthPanel widthPanel = new WidthPanel(command);
         PaintPanel paintPanel = new PaintPanel(command);
         JToolBar toolbar = new Toolbar(command);

         paintPanel.data = data;

         colorPanel.setBounds(0,40,150, 80);
         widthPanel.setBounds(0,100,150,400);
         paintPanel.setBounds(150,40,550,600);
         toolbar.setBounds(0,0,700,40);

         add(widthPanel);
         add(colorPanel);
         add(paintPanel);
         add(toolbar);

         MenuTop mnu = new MenuTop(command);
         setJMenuBar(mnu);
         setVisible(true);
     }
}

