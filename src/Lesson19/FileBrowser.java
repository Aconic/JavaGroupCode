package Lesson19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class FileBrowser implements Runnable
{
     private DefaultMutableTreeNode root;
     private DefaultTreeModel treeModel;
     private JTree tree;
    private JTextField textField;
    private  JList list;
    private  JScrollPane scrollPane;
    @Override
    public void run()
    {
        JFrame frame = new JFrame("File Browser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        File fileRoot = new File("C:\\Documents and Settings\\Admin\\Рабочий стол\\Паспорта");
        textField = new JTextField("C:\\Documents and Settings\\Admin\\Рабочий стол\\Паспорта");
        list = new JList();
        scrollPane = new JScrollPane(tree);
        scrollPane.setBounds(20, 60, 250, 120);

        textField.setColumns(20);
        textField.setBounds(20, 5, 350, 20);
        list.setBounds(20, 60, 260, 120);

        root = new DefaultMutableTreeNode(new FileNode(fileRoot));
        treeModel = new DefaultTreeModel(root);
        tree = new JTree(treeModel);
        tree.setShowsRootHandles(true);

        JScrollPane scrollPane = new JScrollPane(tree);
        JButton btn1 = new JButton("Show");
        frame.add(btn1);
        btn1.setBounds(20, 240, 120, 20);
        frame.add(scrollPane);
        frame.setLocationByPlatform(true);
        frame.setSize(640, 480);
        frame.setVisible(true);
        frame.add(textField);
        frame.add(list);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              run();
            }
        });

    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new FileBrowser());
    }

    public class CreateChildNodes implements Runnable
    {

        private DefaultMutableTreeNode root;

        private File fileRoot;

        public CreateChildNodes(File fileRoot,
                                DefaultMutableTreeNode root)
        {
            this.fileRoot = fileRoot;
            this.root = root;
        }

        @Override
        public void run()
        {
            createChildren(fileRoot, root);
        }

        private void createChildren(File fileRoot,
                                    DefaultMutableTreeNode node)
        {
            File[] files = fileRoot.listFiles();
            if (files == null)
            {
                return;
            }

            for (File file : files)
            {
                DefaultMutableTreeNode childNode =
                        new DefaultMutableTreeNode(new FileNode(file));
                node.add(childNode);
                if (file.isDirectory())
                {
                    createChildren(file, childNode);
                }
            }
        }
    }

    public class FileNode
    {

        private File file;

        public FileNode(File file)
        {
            this.file = file;
        }

        @Override
        public String toString()
        {
            String name = file.getName();
            if (name.equals(""))
            {
                return file.getAbsolutePath();
            }
            else
            {
                return name;
            }
        }
    }

}