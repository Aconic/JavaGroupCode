package Lesson21;

import javax.swing.*;

public class PersonFrame extends JFrame

{
     PersonFrame()
     {
         setTitle("Database");
         setBounds(700,200,300,300);
         setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         add(new PersonPanel());
         setVisible(true);
         setResizable(false);
      }
}
