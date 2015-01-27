package Conditions;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Task4Test
{
    @Test
    public void testMaximum_1() throws Exception
    {
        Task4 obj = new Task4();
        int exp = obj.Maximum(1,4,5);
        assertEquals(23,exp);
    }
    @Test
    public void testMaximum_2() throws Exception
    {
        Task4 obj = new Task4();
        int exp = obj.Maximum(4,1,5);
        assertEquals(23,exp);
    }
}
