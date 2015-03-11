package Apps.TreeDirProj;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class TreePanel extends JPanel
{
    private DefaultMutableTreeNode root;
    private DefaultTreeModel treeModel;
    private JTree tree;
    private DefaultListModel listModel = new DefaultListModel();
    private JLabel selectedLabel;

    public TreePanel()
    {
        setLayout(null);

        JButton btn = new JButton("Fill");
        btn.setBounds(20, 20, 120, 20);
        add(btn);
        btn.addActionListener(new ButtonAction());
        //вывод списка файлов в папке
        JList list = new JList(listModel);
        list.setSelectedIndex(0);
        add(list);
        list.setBounds(440, 50, 320, 300);
        list.setBackground(Color.decode("#F0F8FF"));

        JScrollPane scrollList = new JScrollPane();

        list.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

        //дерево
        root = new DefaultMutableTreeNode();
        treeModel = new DefaultTreeModel(root);
        tree = new JTree(treeModel);
        tree.setShowsRootHandles(true);
        tree.addTreeSelectionListener(new TreeListener());
        JScrollPane scrollPane = new JScrollPane(tree);
        scrollPane.setBounds(20, 50, 380, 300);
        add(scrollPane);
    }


    public void paintComponent(Graphics g)
    {
        Image im = null;
        try
        {
            im = ImageIO.read(new File("C:\\Users\\RudinA\\Dropbox\\!Code_Rudin\\texture-metal.jpg"));
        } catch (IOException e)
        {
        }
        g.drawImage(im, 0, 0, null);
    }


    private class ButtonAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            File fileRoot = new File("C:\\Users\\RudinA\\Dropbox\\");
            listOfFiles(fileRoot);
        }
    }

    private class TreeListener implements TreeSelectionListener
    {
        @Override
        public void valueChanged(TreeSelectionEvent treeSelectionEvent)
        {
            tree.addTreeSelectionListener(new TreeSelectionListener()
            {
                public void valueChanged(TreeSelectionEvent e)
                {
                    DefaultMutableTreeNode node = (DefaultMutableTreeNode) e
                            .getPath().getLastPathComponent();
                    System.out.println("You selected " + node);

                }
            });
        }
    }


   /* private class TreeListener implements TreeSelectionListener
    {
        @Override
        public void valueChanged(TreeSelectionEvent treeSelectionEvent)
        {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
            selectedLabel.setText(selectedNode.getUserObject().toString());

         //File fileRoot = new File("C:\\Users\\RudinA\\Dropbox\\!Code_Rudin\\Group");

        }
    }       */


    public void listOfFiles(File fileRoot)
    {
        File[] pathList = fileRoot.listFiles();

        for (File i : pathList)
        {
            if (i.isDirectory())
            {
                listOfFiles(i);
            }
            TreePanel.this.listModel.addElement(i.getName());
            DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(i.getName());
            TreePanel.this.root.add(childNode);
        }
    }
}

