package com.aconic.lessons.Lesson07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task3Test
{
    @Test
    public void testDigCount_0() throws Exception
    {
        int res = Task3.digCount_2(0);
        assertEquals(1, res);
    }

    @Test
    public void testDigCount_1() throws Exception
    {
             int res = Task3.digCount_2(1234);
        assertEquals(4, res);
    }

    @Test
    public void testDigCount_2() throws Exception
    {
        int res = Task3.digCount_2(1);
        assertEquals(1, res);
    }

    @Test
    public void testDigCount_3() throws Exception
    {
        int res = Task3.digCount_2(23331);
        assertEquals(5, res);
    }
}
