package BiTree;

public class TreeList implements ETreeList
{
    private Node root = null;

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

    @Override
    public void init(int[] ar)
    {
        for (int i = 0; i < ar.length; i++)
        {
            insert(root, ar[i]);
        }
    }


    private void insert(Node root, int value)
    {

        if (root == null)
        {
            root = new Node(value);
            System.out.println("Корень " + root.value);
            return;
        }
        if (root.value == value)
        {
            root.value = value;
        }
        else if (root.value > value)
        {
            if (root.left == null)
            {
                root.left = new Node(value);
                System.out.println("Корень " + root.value + "left" + value);
            }
            else
            {
                insert(root.left, value);
            }
        }
        else if (root.value < value)
        {
            if (root.right == null)
            {
                root.right = new Node(value);
                System.out.println("Корень " + root.value + "right" + value);
            }
            else
            {
                insert(root.right, value);
            }
        }
    }

    @Override
    public void add(int value)
    {
        insert(root, value);

    }

    ///////////
    @Override
    public int size()
    {
        int countr = 0;
        int countl = 0;
        Node tmp = root;
        return 0;
    }


    private void showTreePrivate(Node root)
    {
        if (root == null)
        {
            System.out.println("NULL");
            return;
        }
        String left = (root.left == null ? "нет" : "" + root.left.value);
        String right = (root.right == null ? "нет" : "" + root.right.value);
        System.out.println("Корень-  " + root.value + "Левый ребенок - " + left + "Правый ребенок - " + right);
        showTreePrivate(root.left);
        showTreePrivate(root.right);
    }

    public void showTree()
    {
        showTreePrivate(root);
    }


    private void showLeavesPrivate(Node root)
    {
        if (root != null)
        {
            if (root.left == null && root.right == null)
            {
                System.out.println(root.value);
            }
            else
            {
                showLeavesPrivate(root.left);
                showLeavesPrivate(root.right);
            }
        }
    }

    public void showLeaves()
    {
        showLeavesPrivate(root);
    }
}
