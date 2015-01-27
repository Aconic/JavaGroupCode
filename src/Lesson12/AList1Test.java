package Lesson12;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AList1Test
{
    @Test
    public void testInit() throws Exception
    {
        int[] zz = {10, 20, 32};
        AList2 xx = new AList2();
        int exp = zz.length;
        assertEquals(3,exp);
    }

    @Test
    public void testSize() throws Exception
    {
        int[] zz = {10, 20, 32};
        int exp = 3;
        AList2 xx = new AList2();
        xx.init(zz);
        int res = xx.size();
        assertEquals(exp,res);
    }

    @Test
    public void testToArray() throws Exception
    {



    }

    @Test
    public void testAddEnd() throws Exception
    {
        int[] zz = {10, 20, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.addEnd(5);
        int[] res = xx.toArray();
        int[] expected = {10, 20, 32, 5};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testAdd2_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.addEnd(5);
        int[] res = xx.toArray();
        int[] expected = {10, 20, 77, 11, 24, 99, 32, 5};
        assertArrayEquals(expected, res);
    }

    //======================================
//Delete End
//======================================
    @Test(expected = NullPointerException.class)
    public void testDelEnd() throws Exception
    {
        int[] zz = {};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delEnd();
    }

    @Test
    public void testDel2()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delEnd();
        int[] res = xx.toArray();
        int[] expected = {10, 20, 77, 11, 24, 99};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testDel2_many()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delEnd();
        int[] res = xx.toArray();
        int[] expected = {10};
        assertArrayEquals(expected, res);
    }

}

