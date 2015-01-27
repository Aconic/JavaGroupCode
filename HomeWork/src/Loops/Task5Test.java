package Loops;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Task5Test
{
    @Test
    public void testSum1() throws Exception
    {
        int sum = Task5.Sum(0);
        assertEquals(0, sum);
    }

    @Test
    public void testSum2() throws Exception
    {
        int sum = Task5.Sum(99999);
        assertEquals(45, sum);
    }
}
