package BiTree;


public class TreeMain
{
    public static void main(String[] args)
    {
        TreeList treeList  =new TreeList();
        int []ar = {33,15,22};
        treeList.init(ar);
       treeList.add(999);
        treeList.showTree();
        treeList.showLeaves();
      //  System.out.println(treeList.size());

    }
}
