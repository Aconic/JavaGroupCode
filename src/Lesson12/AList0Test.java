package Lesson12;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AList0Test
{
    //======================================
    // max
    //======================================

    @Test(expected = IllegalArgumentException.class)
    public void testMax_0()
    {
        int[] zz = {};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.maxOfArray();
    }

    @Test
    public void testMax_1()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.maxOfArray();
        assertEquals(10, res);
    }

    @Test
    public void testMax_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.maxOfArray();
        assertEquals(20, res);
    }

    @Test
    public void testMax_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.maxOfArray();
        assertEquals(99, res);
    }

    //======================================
    // min
    //======================================
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMin_null()
    {
        int[] zz = null;
        AList0 xx = new AList0();
        xx.init(zz);
        xx.minOfArray();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMin_0()
    {
        int[] zz = {};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.minOfArray();
    }

    @Test
    public void testMin_1()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.minOfArray();
        assertEquals(10, res);
    }

    @Test
    public void testMin_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.minOfArray();
        assertEquals(10, res);
    }

    @Test
    public void testMin_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.minOfArray();
        assertEquals(10, res);
    }


    //======================================
    // indexOfMax
    //======================================
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMaxIndex_null()
    {
        int[] zz = null;
        AList0 xx = new AList0();
        xx.init(zz);
        xx.indexOfMax();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMaxIndex_0()
    {
        int[] zz = {};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.indexOfMax();
    }

    @Test
    public void testMaxIndex_1()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.indexOfMax();
        assertEquals(0, res);
    }

    @Test
    public void testMaxIndex_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.indexOfMax();
        assertEquals(1, res);
    }

    @Test
    public void testMaxIndex_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.indexOfMax();
        assertEquals(5, res);
    }

    //======================================
    // indexOfMin
    //======================================
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMinIndex_null()
    {
        int[] zz = null;
        AList0 xx = new AList0();
        xx.init(zz);
        xx.indexOfMin();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMinIndex_0()
    {
        int[] zz = {};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.indexOfMin();
    }

    @Test
    public void estMinIndex_1()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.indexOfMin();
        assertEquals(0, res);
    }

    @Test
    public void estMinIndex_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.indexOfMin();
        assertEquals(0, res);
    }

    @Test
    public void estMinIndex_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.indexOfMin();
        assertEquals(0, res);
    }

    //======================================
    //reverse
    //======================================
    @Test
    public void testReverse_null()
    {
        int[] zz = null;
        AList0 xx = new AList0();
        xx.init(zz);
        int[] res = xx.toArray();
        int[] expected = {};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testReverse_0()
    {
        int[] zz = {};
        AList0 xx = new AList0();
        xx.init(zz);
        int[] res = xx.toArray();
        int[] expected = {};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testReverse_1()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.reverse();
        int[] res = xx.toArray();
        int[] expected = {10};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testReverse_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.reverse();
        int[] res = xx.toArray();
        int[] expected = {20, 10};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testReverse_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.reverse();
        int[] res = xx.toArray();
        int[] expected = {32, 99, 24, 11, 77, 20, 10};
        assertArrayEquals(expected, res);
    }

    //======================================
    //sort1
    //======================================
    @Test
    public void testSort1_null()
    {
        int[] zz = null;
        AList0 xx = new AList0();
        xx.init(zz);
        int[] res = xx.toArray();
        int[] expected = {};
        assertArrayEquals(expected, res);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSort1_0()
    {
        int[] zz = {};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.BubbleSort();
        int[] res = xx.toArray();
        int[] expected = {};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testSort1_1()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.BubbleSort();
        int[] res = xx.toArray();
        int[] expected = {10};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testSort1_2()
    {
        int[] zz = {20, 10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.BubbleSort();
        int[] res = xx.toArray();
        int[] expected = {10, 20};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testSort1_many()
    {
        int[] zz = {20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.BubbleSort();
        int[] res = xx.toArray();
        int[] expected = {11, 20, 24, 32, 77, 99};
        assertArrayEquals(expected, res);
    }


//======================================
//Add to End
//======================================


    @Test
    public void testAdd_2()
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
//Apps.AlphaVersions.Delete End
//======================================
    @Test(expected = NullPointerException.class)
    public void testDel_0()
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

    //======================================
    // addStart
    //======================================
    @Test
    public void testAddStart_0()
    {
        int[] zz = {};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.addStart(5);
        int[] res = xx.toArray();
        int[] expected = {5};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testAddStart_1()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.addStart(5);
        int[] res = xx.toArray();
        int[] expected = {5, 10};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testAddStart_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.addStart(5);
        int[] res = xx.toArray();
        int[] expected = {5, 10, 20};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testAddStart_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.addStart(5);
        int[] res = xx.toArray();
        int[] expected = {5, 10, 20, 77, 11, 24, 99, 32};
        assertArrayEquals(expected, res);
    }

    //======================================
    // delStart
    //======================================
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDelStart_null()
    {
        int[] zz = {};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delStart();
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testDelStart_0()
    {
        int[] zz = {};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delStart();
    }

    @Test
    public void testDelStart_1()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delStart();
        int[] res = xx.toArray();
        int[] expected = {};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testDelStart_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delStart();
        int[] res = xx.toArray();
        int[] expected = {20};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testDelStart_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delStart();
        int[] res = xx.toArray();
        int[] expected = {20, 77, 11, 24, 99, 32};
        assertArrayEquals(expected, res);
    }
    //======================================
    // addPos
    //======================================

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddPos_25()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.addPos(25, 5);
    }

    @Test
    public void testAddPos_1()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.addPos(0, 5);
        int[] res = xx.toArray();
        int[] expected = {5, 10};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testAddPos_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.addPos(1, 5);
        int[] res = xx.toArray();
        int[] expected = {10, 5, 20};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testAddPos_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.addPos(1, 5);
        int[] res = xx.toArray();
        int[] expected = {10, 5, 20, 77, 11, 24, 99, 32};
        assertArrayEquals(expected, res);
    }


    //======================================
    // delPos
    //======================================

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDelPos_25()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delPos(7);
    }

    @Test
    public void testDelPos_0()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delPos(0);
        int[] res = xx.toArray();
        int[] expected = {};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testDelPos_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delPos(1);
        int[] res = xx.toArray();
        int[] expected = {10};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testDelPos_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.delPos(2);
        int[] res = xx.toArray();
        int[] expected = {10, 20, 11, 24, 99, 32};
        assertArrayEquals(expected, res);
    }
    //======================================
    // set
    //======================================

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetPos_out()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.set(2, 44);
    }

    @Test
    public void testSetPos_1()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.set(0, 44);
        int[] res = xx.toArray();
        int[] expected = {44};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testSetPos_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.set(0, 44);
        int[] res = xx.toArray();
        int[] expected = {44, 20};
        assertArrayEquals(expected, res);
    }

    @Test
    public void testSetPos_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        xx.set(0, 44);
        int[] res = xx.toArray();
        int[] expected = {44, 20, 77, 11, 24, 99, 32};
        assertArrayEquals(expected, res);
    }

    //======================================
    // get
    //======================================

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetPos_out()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        int res = xx.get(0);
        int expected = 10;
        assertEquals(expected, res);
    }

    @Test
    public void testGetPos_0()
    {
        int[] zz = {10};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.get(0);
        int expected = 10;
        assertEquals(expected, res);

    }

    @Test
    public void testGetPos_2()
    {
        int[] zz = {10, 20};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.get(0);
        int expected = 10;
        assertEquals(expected, res);
    }

    @Test
    public void testGetPos_many()
    {
        int[] zz = {10, 20, 77, 11, 24, 99, 32};
        AList0 xx = new AList0();
        xx.init(zz);
        int res = xx.get(0);
        int expected = 10;
        assertEquals(expected, res);
    }
}


