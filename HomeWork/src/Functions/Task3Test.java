package Functions;

import org.junit.Test;


import static junit.framework.Assert.assertEquals;

public class Task3Test
{
    @Test
    public void testStringToNum_0()
    {
        int res = Task3.stringToNum("ноль");
        assertEquals(0, res);
    }

    @Test
    public void testStringToNum_1()
    {
        int res = Task3.stringToNum("один");
        assertEquals(1, res);
    }

    @Test
    public void testStringToNum_2()
    {
        int res = Task3.stringToNum("два");
        assertEquals(2, res);
    }

    @Test
    public void testStringToNum_7()
    {
        int res = Task3.stringToNum("семь");
        assertEquals(7, res);
    }

    @Test
    public void testStringToNum_12()
    {
        int res = Task3.stringToNum("двенадцать");
        assertEquals(12, res);
    }

    @Test
    public void testStringToNum_53()
    {
        int res = Task3.stringToNum("пятьдесят три");
        assertEquals(53, res);
    }

    @Test
    public void testStringToNum_99()
    {
        int res = Task3.stringToNum("девяносто девять");
        assertEquals(99, res);
    }

    @Test
    public void testStringToNum_101()
    {
        int res = Task3.stringToNum("сто один");
        assertEquals(101, res);
    }

    @Test
    public void testStringToNum_102()
    {
        int res = Task3.stringToNum("сто два");
        assertEquals(102, res);
    }

    @Test
    public void testStringToNum_333()
    {
        int res = Task3.stringToNum("триста тридцать три");
        assertEquals(333, res);
    }

    @Test
    public void testStringToNum_697()
    {
        int res = Task3.stringToNum("шестьсот девяносто семь");
        assertEquals(697, res);
    }

    @Test
    public void testStringToNum_999()
    {
        int res = Task3.stringToNum("девятьсот девяносто девять");
        assertEquals(999, res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringToNum_null()
    {
        int res = Task3.stringToNum("");
    }
}
