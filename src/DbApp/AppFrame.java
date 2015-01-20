package DbApp;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame

{
     AppFrame()
     {

         setTitle("DB Editor");
         setBounds(200,200,700,300);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         new BorderLayout();
         add(new TablePanel(), BorderLayout.CENTER);
         add(new BtnPanel(), BorderLayout.EAST);
         setVisible(true);
         setResizable(true);
      }
}

