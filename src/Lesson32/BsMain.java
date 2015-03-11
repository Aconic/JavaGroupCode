package Lesson32;

/**
 * Date: 11.02.15 * Time: 19:59
 * To change this template use File | Settings | File Templates.
 */
public class BsMain
{
    public static void main(String[] args)
    {
        BsTree tree = new BsTree();
        tree.add(5);
        tree.add(4);
        tree.add(3);
        tree.add(6);
        tree.add(7);
        tree.add(2);
        tree.print();
        System.out.println("size - " + tree.size());
        System.out.println("leaf - " + tree.sizeLeaf());
        System.out.println("Nodes - " + tree.sizeNode());
    }


}
