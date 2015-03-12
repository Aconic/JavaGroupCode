package Lesson36;


public class MyIteratorMain
{

 public static void main(String[]args)
 {
//     int[] arr = {2,15,6,7,28,9};
//     LList1 linkedList = new LList1();
//     linkedList.init(arr);

     TreeList treeList = new TreeList();
     int[] ar = {50, 40, 33, 66, 77, 20,5, 108};
     treeList.init(ar);


    /*
     for(int i:linkedList)
 {
     System.out.print(i + " ");
 }
      */
     for(int i:treeList)
     {
         System.out.print(i + " ");
     }

 }
}



