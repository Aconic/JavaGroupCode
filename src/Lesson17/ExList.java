package Lesson17;

public interface ExList
{
    public void setArray(int[] a);
    public void init(int[] a);
    public int size();
    public void clear();
    public void addStart(int val);
    public void addEnd(int val);
    public void addPos(int pos, int val);
    public void delStart();
    public void delEnd();
    public void delPos(int pos);

  public int maxOfArray();
    public int minOfArray();
    public int indexOfMin();
    public int indexOfMax();
    public void reverse();
    public void bubbleSort();
    public int[] toArray();
    public int[] getArray();
    public void set(int pos, int val);
    public int get(int pos);
}
