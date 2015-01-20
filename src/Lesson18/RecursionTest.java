package Lesson18;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Date: 14.12.14 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 */
public class RecursionTest
{
 ///////////Factorial
       @Test
        public void testFactorial() throws Exception
        {
            int n = 4;
            int res = Recursion.factorial(n);
            assertEquals(24,res);
        }
        @Test
        public void testFactorial_1() throws Exception
        {
            int n = 1;
            int res = Recursion.factorial(n);
            assertEquals(1,res);
        }
        @Test
        public void testFactorial_3() throws Exception
        {
            int n = 3;
            int res = Recursion.factorial(n);
            assertEquals(6,res);
        }

    /////Recursion Fact
    @Test
    public void testRecFacrorial() throws Exception
    {
        int n = 3;
        int res = Recursion.recFactorial(n);
        assertEquals(6,res);
    }
    @Test
    public void testRecFacrorial_2() throws Exception
    {
        int n = 4;
        int res = Recursion.recFactorial(n);
        assertEquals(24,res);
    }

////Sumnumber
    @Test
    public void testSumNumber() throws Exception
    {
       int n = 123;
        int res = Recursion.sumNumber(n);
       assertEquals(6,res);
    }

    public void testSumNumber_1() throws Exception
    {
        int n = 3023;
        int res = Recursion.sumNumber(n);
        assertEquals(8,res);
    }
 ///Recursion sum
    @Test
    public void testRecSumNumber_1() throws Exception
    {
        int n = 3023;
        int res = Recursion.recSumNumber(n);
        assertEquals(8,res);
    }

    public void testRecSumNumber_2() throws Exception
    {
        int n = 123;
        int res = Recursion.recSumNumber(n);
        assertEquals(6,res);
    }

}
