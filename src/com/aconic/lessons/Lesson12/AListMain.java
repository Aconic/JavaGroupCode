package com.aconic.lessons.Lesson12;

import java.util.Arrays;


public class AListMain
{
    public static void main(String[] args)
    {
        int[] zz = {8, 20, 77, 11, 24, 99, 32};
        System.out.print(Arrays.toString(zz));
        AList2 xx = new AList2();
        xx.init(zz);   //передача начального неизмененного массива
        System.out.println();
        System.out.println("Max of array: " + xx.maxOfArray());
        System.out.println("Min of array: " + xx.minOfArray());
        System.out.println("Index of max: " + xx.indexOfMax());
        System.out.println("Index of min: " + xx.indexOfMin());
        xx.reverse();  //реверс
        System.out.println("Reversed array: " + xx.toString());   //вывод в строку реверсного массива
        xx.init(zz);  //передача начального неизмененного массива
        xx.bubbleSort();
        System.out.println("Sorted array: " + xx.toString());  //вывод сортированного массива
        xx.init(zz);      //передача начального неизмененного массива
        xx.addEnd(55);
        System.out.println("Added element to end: " + xx.toString());
        xx.init(zz);     //передача начального неизмененного массива



        xx.addStart(15);
        System.out.println("Added start element: " + xx.toString());

        xx.init(zz);    //передача начального неизмененного массива
        xx.delEnd();
        System.out.println("Deleted last element: " + xx.toString());

        xx.init(zz);    //передача начального неизмененного массива
        xx.addPos(1, 4);
        System.out.println("Added  element 4 on pos [1]: " + xx.toString());

        xx.init(zz);    //передача начального неизмененного массива
        xx.delPos(2);
        System.out.println("Deleted element on pos [2]: " + xx.toString());

        xx.init(zz);    //передача начального неизмененного массива
        xx.set(0, 44);
        System.out.println("Array element set: " + xx.toString());
        xx.setArray(zz);    //передача начального неизмененного массива
        System.out.println("Array element get: " + xx.get(0));
        xx.clear();
    }
}
