package com.aconic.lessons.Lesson06;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class Task2Test
{
    @Test
    public void testArrUn() throws Exception
    {
        int [] st1 = {1,3,4};
        int [] st2= {5,6};
        int [] res = {1,3,4,5,6};
        int [] exp = {1,3,4,5,6};
        assertArrayEquals(res, exp);
    }
    @Test    (expected = NullPointerException.class)
    public void testArrUn_null() throws Exception
    {
        int [] ar1 = {1,2};
        Task2.arrUn(ar1,null);
    }

    @Test
    public void testArrUn_null2() throws Exception
    {
        int [] sum = Task2.arrUn(null,null);
        int [] exp = {};
        assertArrayEquals(exp,sum);
    }

    @Test
    public void testArrUn_null3() throws Exception
    {
        int [] ar2 = {1,2};
        int [] res = Task2.arrUn(null,ar2);
        int [] exp = {1,2};
    }

    @Test
    public void testArrUn_zero() throws Exception
    {
        int [] ar1 = {0};
        int [] ar2 = {0};
        int [] sum =Task2.arrUn(ar1,ar2);
        int [] res = {0,0};
        assertArrayEquals(sum,res);
    }

}
