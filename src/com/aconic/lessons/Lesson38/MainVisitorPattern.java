package com.aconic.lessons.Lesson38;


public class MainVisitorPattern
{
    public static void main(String[] args)
    {
        TreeList treeList = new TreeList();
        int[] ar = {5, 4, 3, 56, 17, 2, 99};
        treeList.init(ar);

        treeList.showTree();
        System.out.println("Размер - " + treeList.size());
        System.out.println("Листьев - " + treeList.countLeaves());
        System.out.println("Узлов - " + treeList.countNodes());
    }
}

