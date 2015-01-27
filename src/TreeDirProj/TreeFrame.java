package TreeDirProj;

import javax.swing.*;


public class TreeFrame extends JFrame
{
   public TreeFrame()
   {
       setBounds(100,100,800,600);
       setDefaultCloseOperation(EXIT_ON_CLOSE);

       add(new TreePanel());
       setVisible(true);
       setResizable(false);


   }


}
