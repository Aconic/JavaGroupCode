package Lesson32;

/**
 * Бинарное дерево
 */
public class BsTree
{
    Node root = null;

    private class Node
    {
        Node left;
        Node right;
        int data;

        public Node(int val)
        {
            data = val;
        }
    }

    public void clear()
    {
        root = null;
    }

    public void add(int val)
    {
        if (root == null)
        {
            root = new Node(val);
        }
        else
        {
            addNode(root, val);
        }
    }

    private void addNode(Node node, int val)
    {
        if (val < node.data)
        {
            if (node.left == null)
            {
                node.left = new Node(val);
            }
            else
            {
                addNode(node.left, val);
            }
        }
        else
        {
            if (node.right == null)
            {
                node.right = new Node(val);
            }
            else
            {
                addNode(node.right, val);
            }
        }
    }

    public void print()
    {
        printNode(root);
    }

    private void printNode(Node node)
    {
        if (node == null)
        {
            return;
        }
        printNode(node.left);
        System.out.print(node.data + ", ");
        printNode(node.right);
    }

    public int size()
    {
        return sizeTree(root);
    }

    private int sizeTree(Node node)
    {
        int count = 0;
        if (node == null)
        {
            return count;
        }
        count += sizeTree(node.left);
        count++;
        count += sizeTree(node.right);
        return count;
    }

    public int sizeLeaf()
    {
        return (sizeLeafTree(root));
    }

    private int sizeLeafTree(Node node)
    {
        int count = 0;
        if (node == null)
        {
            return count;
        }
        count += sizeLeafTree(node.left);
        if (node.left == null && node.right == null)
        {
            count++;
        }
        count += sizeLeafTree(node.right);
        return count;
    }


    public int sizeNode()
    {
        return (sizeNodeTree(root));
    }

    private int sizeNodeTree(Node node)
    {
        int count = 0;
        if (node == null)
        {
            return 0;
        }
        count += sizeLeafTree(node.left);
        if (node.left != null && node.right != null)
        {
            count++;
        }
        count += sizeLeafTree(node.right);
        return count;
    }


}
