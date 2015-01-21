package Loops;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Task4Test
{
    @Test
      public void testFactor1()
{
    int res = Task4.Factor(3);
    assertEquals(6,res);
}

    @Test
      public void testFactor2()
{
    int res = Task4.Factor(0);
    assertEquals(1,res);
}
    @Test    (expected = IllegalArgumentException.class)
    public void testFactor3() throws Exception
    {
        int res = Task4.Factor(-2);

    }

}
