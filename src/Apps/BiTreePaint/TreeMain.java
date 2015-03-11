package Apps.BiTreePaint;

public class TreeMain
{
    public static void main(String[] args)
    {
        new TreeFrame();
        BsTree tree = new BsTree();
        tree.add(5);
        tree.add(4);
        tree.add(3);
        tree.add(6);
        tree.add(7);
        tree.add(2);
    }
}
