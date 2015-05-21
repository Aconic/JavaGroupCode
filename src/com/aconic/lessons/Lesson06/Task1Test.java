package com.aconic.lessons.Lesson06;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task1Test
{
    @Test
    public void testShowAr1() throws Exception
    {
       int [] mas = {1,2};
        int [] exp = {1,0};
       assertArrayEquals(exp,mas);
    }

    @Test
    public void testShowAr_zero() throws Exception
    {
        int [] mas = {0};
        int [] exp = {0};
        assertArrayEquals(exp,mas);
    }
    @Test
    public void testShowAr_null() throws Exception
    {
        int [] mas = null;
        int [] exp = null;
        assertArrayEquals(exp,mas);
    }


}
