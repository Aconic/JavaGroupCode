package Loops;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Date: 01.11.14 * Time: 23:06
 * To change this template use File | Settings | File Templates.
 */
public class Task6Test
{
    @Test
    public void testNumReverse1() throws Exception
    {
      int rev = Task6.NumReverse(2134);
        assertEquals(4312, rev);
    }
    @Test
    public void testNumReverse2() throws Exception
    {
        int rev = Task6.NumReverse(1);
        assertEquals(1, rev);
    }
    @Test      (expected = IllegalArgumentException.class)
    public void testNumReverse3() throws Exception
    {
        int rev = Task6.NumReverse(-2345);

    }
}
