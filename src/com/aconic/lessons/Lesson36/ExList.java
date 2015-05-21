package com.aconic.lessons.Lesson36;

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
    public void sort();
    public int minIndex();
    public int maxIndex();
    public int max();
    public int min();
    public void reverse();
    public int[] toArray();
    public int[] getArray();
    public void set(int pos, int val);
    public int get(int pos);
}
