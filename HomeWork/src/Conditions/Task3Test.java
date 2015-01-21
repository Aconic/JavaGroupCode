package Conditions;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Task3Test
{
    @Test
    public void testSum_0() throws Exception
    {
        Task3 obj = new Task3();
        int exp = obj.Sum(0,0,0);
        assertEquals ( 0,exp);
    }
    @Test
    public void testSum_1() throws Exception
    {
        Task3 obj = new Task3();
        int exp = obj.Sum(-2,4,5);
        assertEquals ( 9,exp);
    }
    @Test
    public void testSum_2() throws Exception
    {
        Task3 obj = new Task3();
        int exp = obj.Sum(-2,4,-5);
        assertEquals ( 4,exp);
    }
    @Test
    public void testSum_3() throws Exception
    {
        Task3 obj = new Task3();
        int exp = obj.Sum(-2,-4,-5);
        assertEquals ( 0,exp);
    }

}
