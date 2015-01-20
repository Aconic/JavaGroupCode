package DbApp;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PersonFrame extends JFrame

{
     PersonFrame(ActionEvent e )
     {
         setTitle("Database");
         setBounds(700,200,300,300);
         setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         add(new PersonPanel(e));
         setVisible(true);
         setResizable(false);
      }
}
