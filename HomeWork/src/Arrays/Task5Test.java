package Arrays;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**

 */
public class Task5Test {
    @org.junit.Test
     public void testArrIndexSum1() throws Exception {
        Task5 obj = new Task5();
        int [] mas = {2,3,5,6};
        int res = obj.ArrIndexSum(mas);
        assertEquals(9,res);
    }

    @org.junit.Test
    public void testArrIndexSum2() throws Exception {
        Task5 obj = new Task5();
        int [] mas = {3};
        int res = obj.ArrIndexSum(mas);
        assertEquals(0,res);
    }
    @org.junit.Test
    public void testArrIndexSum3() throws Exception {
        Task5 obj = new Task5();
        int [] mas = {-88, -2, -1};
        int res = obj.ArrIndexSum(mas);
        assertEquals(-1,res);
    }
}
