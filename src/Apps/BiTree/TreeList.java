package Apps.BiTree;

public class TreeList implements ETreeList
{
    private Node root = null;
    int[] ar;
    int index = 0;

    class Node
    {
        Node left;
        Node right;
        int value;

        public Node(int value)
        {
            this.value = value;
        }
    }

    public void clear()
    {
        root  = null;
    }

    @Override
    public void init(int[] arIn)
    {
        if (arIn.length == 0)
        {
            arIn = new int[0];
        }
        for (int i : arIn)
        {
            add(i);
        }
    }

    ///////////
    private void addPrivate(Node node, int value)
    {
        if (root == null)
        {
            root = new Node(value);
            System.out.println("Корень " + root.value);
            return;
        }
        if (node.value > value)
        {
            if (node.left == null)
            {
                node.left = new Node(value);
               // System.out.println("Корень " + node.value + " left " + value);
            }
            addPrivate(node.left, value);
        }
        else if (node.value < value)
        {
            if (node.right == null)
            {
                node.right = new Node(value);
                //System.out.println("Корень " + node.value + " right " + value);
            }
            else
            {
                addPrivate(node.right, value);
            }
        }
    }

    @Override
    public void add(int value)
    {
        addPrivate(root, value);
    }

    ///////////
    private int sizePrivate(Node node)
    {
        if (node == null)
        {
            return 0;
        }
        return (sizePrivate(node.left) + 1 + sizePrivate(node.right));
    }

    @Override
    public int size()
    {
        return sizePrivate(root);
    }

    private void toArrayPrivate(Node node)
    {

        if (node.left != null)
        {
            toArrayPrivate(node.left);
        }
        ar[index++] = node.value;
        if (node.right != null)
        {
            toArrayPrivate(node.right);
        }
    }

    @Override
    public int[] toArray()
    {
        if (root == null || size() == 0)
        {
            ar = new int[0];
        }
        else
        {
            ar = new int[size()];
            toArrayPrivate(root);

        }
        return ar;
    }


    private int countLeavesPrivate(Node node)     //кол-во листьев
    {
        int count = 1;
        if (node != null)
        {
            if (node.left != null && node.right != null)
            {
                countLeavesPrivate(node.left);
                countLeavesPrivate(node.right);
                count++;
            }
        }
        return count;
    }

    @Override
    public int countLeaves()
    {
        return (countLeavesPrivate(root));
    }

    private void showTreePrivate(Node node)
    {
        if (node == null)
        {
            return;
        }
        String left = (node.left == null ? "нет" : node.left.value + "");
        String right = (node.right == null ? "нет" : node.right.value + "");
        System.out.println("Корень-" + node.value + " Левый ребенок-" + left + " Правый ребенок - " + right);
        showTreePrivate(node.left);
        showTreePrivate(node.right);
    }

    @Override
    public void showTree()
    {
        showTreePrivate(root);
    }

    private void showLeavesPrivate(Node node)
    {
        if (node != null)
        {
            if (node.left == null && node.right == null)
            {
                System.out.println(node.value);
            }
            else
            {
                showLeavesPrivate(node.left);
                showLeavesPrivate(node.right);
            }
        }
    }

    @Override
    public void showLeaves()
    {
        showLeavesPrivate(root);
    }
}

