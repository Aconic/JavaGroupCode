package Lesson38;

/**
 * Бинарное дерево - pattern VISITOR
 */
public class TreeList
{
    private Node root = null;
    int[] ar;
    int index = 0;

 /////////////////Visitor Pattern реализация///////////////////////
    public void visit(Node p, Visitor v)
    {
        if (p == null)
        {
            return;
        }
        visit(p.left, v);
        v.action(p);
        visit(p.right, v);
    }
    ///////// SIZE

    private class VSize implements Visitor
    {
        int count = 0;
           @Override
        public void action(Node p)
        {
            count++;
        }
    }

    public int size()
    {
        return sizePrivate(root);
    }

    private int sizePrivate(Node node)
    {
        VSize v = new VSize();
        visit(node, v);
        return v.count;
    }

    //////  LEAVES COUNT
    private class VLeaves implements Visitor
    {
        int count = 0;
        @Override
        public void action(Node p)
        {
            if (p.left == null && p.right == null)
            {
            count++;
            }
        }
    }

    public int countLeaves()
    {
        return (countLeavesPrivate(root));
    }

    private int countLeavesPrivate(Node node)     //кол-во листьев
    {
       VLeaves v = new VLeaves();
       visit(node, v);
       return v.count;
    }

    //////  NODES COUNT
    public int countNodes()
    {
        return (countNodesPrivate(root));
    }

    private class VNodes implements Visitor
    {
        int count = 0;
        @Override
        public void action(Node p)
        {
            if (p.left != null || p.right != null)
            {
                count++;
            }
        }
    }

    private int countNodesPrivate(Node node)     //кол-во листьев
    {
        VNodes v = new VNodes();
        visit(node, v);
        return v.count;
    }

    //////////////////////////////////////
    public class Node
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
        root = null;
    }


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


    public void add(int value)
    {
        addPrivate(root, value);
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


    public void showLeaves()
    {
        showLeavesPrivate(root);
    }


}

