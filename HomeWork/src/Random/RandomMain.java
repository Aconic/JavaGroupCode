package Random;

/**
  Случайные числа
 */
public class RandomMain
{

    public static void main(String[] args)
    {
        TaskAll obj = new TaskAll();
        System.out.println("№1) ");
        int [] arr1  = obj.randomDig(1);
        obj.randomArrayPrint(arr1);
        System.out.println("");
        System.out.println("№2) ");
        int [] arr2  = obj.randomDig(10);
        obj.randomArrayPrint(arr2);
        System.out.println("");
        System.out.println("№3) ");
        int [] arr3  = obj.randomDig(0,10,10);
        obj.randomArrayPrint(arr3);
        System.out.println("");
        System.out.println("№4) ");
        int [] arr4  = obj.randomDig(20,50,10);
        obj.randomArrayPrint(arr4);
        System.out.println("");
        System.out.println("№5) ");
        int [] arr5  = obj.randomDig(-10,10,10);
        obj.randomArrayPrint(arr5);
        System.out.println("");
        System.out.println("№6) ");
        int []arr6 = obj.randomDig(-10,35);
        obj.randomArrayPrint(arr6);
    }
}


