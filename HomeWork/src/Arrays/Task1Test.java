package Arrays;

import static junit.framework.Assert.assertEquals;

public class Task1Test
{

    @org.junit.Test
    public void testMaxOfArray() throws Exception
    {
        int[] ar = {1, 2};
        Task1 obj = new Task1();
        int res = obj.MaxOfArray(ar);
        assertEquals(2, res);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testMaxOfArray_e() throws Exception
    {
        int[] ar = {};
        Task1 obj = new Task1();
        int res = obj.MaxOfArray(ar);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testMaxOfArray_null()
    {
        int ar[] = null;
        Task1 obj = new Task1();
        int res = obj.MaxOfArray(ar);
    }

    @org.junit.Test
    public void testMaxOfArray_3() throws Exception
    {
        int[] ar = {3,5,1};
        Task1 obj = new Task1();
        int res = obj.MaxOfArray(ar);
        assertEquals(5, res);
    }
}
