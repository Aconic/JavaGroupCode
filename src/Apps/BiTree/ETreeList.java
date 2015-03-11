package Apps.BiTree;


public interface ETreeList
{
    public void init(int [] ar);
    public void add(int value);
    public int size();
    public int countLeaves();
    public  int [] toArray();


    public void showLeaves();

    public void showTree();

}
