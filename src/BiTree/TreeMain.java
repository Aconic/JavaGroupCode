package BiTree;


public class TreeMain
{
    public static void main(String[] args)
    {
        TreeList treeList = new TreeList();
        int[] ar = {5, 4, 3, 6, 7, 2,5};
        treeList.init(ar);

        treeList.showTree();
        System.out.println("Размер - " + treeList.size());
        System.out.println("Кол-во листьев - " + treeList.countLeaves());
    }
}
