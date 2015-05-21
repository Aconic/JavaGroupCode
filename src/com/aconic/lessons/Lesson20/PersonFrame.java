package com.aconic.lessons.Lesson20;


import javax.swing.*;

public class PersonFrame   extends JFrame

{
     PersonFrame()
     {
         setTitle("Database");
         setBounds(400,200,300,300);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         add(new PersonPanel());
        // insert(new DbPanel(), BorderLayout.NORTH);
         setVisible(true);
         setResizable(false);
      }
}
