package Loops;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Date: 01.11.14 * Time: 22:30
 */
public class Task2Test
{
    @Test
    public void testMain1()
    {
        int res = Task2.DigitCheck(3);
        assertEquals(0, res);
    }
    @Test
    public void testMain2()
    {
        int res = Task2.DigitCheck(4);
        assertEquals(1, res);
    }
    @Test  (expected = IllegalArgumentException.class)
    public void testMain3()
    {
        int res = Task2.DigitCheck(0);

    }
    @Test
    public void testMain25()
    {
        int res = Task2.DigitCheck(25);
        assertEquals(0, res);
    }
}
