package Conditions;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Task1Test
{
    @Test
    public void testCount_1() throws Exception
    {
     Task1 obj = new Task1();
     int res = obj.count(1,4);
     assertEquals(5,res);
    }
    @Test
    public void testCount_2() throws Exception
    {
        Task1 obj = new Task1();
        int res = obj.count(2,4);
        assertEquals(8,res);
    }
}
