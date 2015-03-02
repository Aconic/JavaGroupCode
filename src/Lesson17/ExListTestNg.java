package Lesson17;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExListTestNg
{

        ExList xx = new LList2();

        //======================================
        // max
        //======================================
        @Test
        public void testMax_1()
        {
            int[] zz = {10};
            xx.init(zz);
            int res = xx.maxOfArray();
            Assert.assertEquals(res,10);
        }

        @Test
        public void testMax_2()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            int res = xx.maxOfArray();
            Assert.assertEquals(res, 20);
        }

        @Test
        public void testMax_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            int res = xx.maxOfArray();
            Assert.assertEquals(res, 99);
        }

        //======================================
        // min
        //======================================
        @Test
        public void testMin_1()
        {
            int[] zz = {10};
            xx.init(zz);
            int res = xx.minOfArray();
            Assert.assertEquals(res, 10);
        }

        @Test
        public void testMin_2()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            int res = xx.minOfArray();
            Assert.assertEquals(res, 10);
        }

        @Test
        public void testMin_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            int res = xx.minOfArray();
            Assert.assertEquals(res, 10);
        }

        //======================================
        // indexOfMax
        //======================================
        @Test
        public void testMaxIndex_1()
        {
            int[] zz = {10};
            xx.init(zz);
            int res = xx.indexOfMax();
            Assert.assertEquals(res, 0);
        }

        @Test
        public void testMaxIndex_2()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            int res = xx.indexOfMax();
            Assert.assertEquals(res, 1);
        }

        @Test
        public void testMaxIndex_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            int res = xx.indexOfMax();
            Assert.assertEquals(res,5);
        }

        //======================================
        // indexOfMin
        //======================================
        @Test
        public void testMinIndex_null()
        {
            int[] zz = null;
            xx.init(zz);
            xx.indexOfMin();
        }

        @Test
        public void estMinIndex_1()
        {
            int[] zz = {10};
            xx.init(zz);
            int res = xx.indexOfMin();
            Assert.assertEquals(res,0);
        }

        @Test
        public void estMinIndex_2()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            int res = xx.indexOfMin();
            Assert.assertEquals(res,0);
        }

        @Test
        public void estMinIndex_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            int res = xx.indexOfMin();
            Assert.assertEquals(res,0);
        }

        //======================================
        //reverse
        //======================================
        @Test
        public void testReverse_null()

        {
            int[] zz = null;
            xx.init(zz);
            xx.toArray();
        }

        @Test
        public void testReverse_1()
        {
            int[] zz = {10};
            xx.init(zz);
            xx.reverse();
            int[] res = xx.toArray();
            int[] expected = {10};
            Assert.assertEquals(res,expected);
        }

        @Test
        public void testReverse_2()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            xx.reverse();
            int[] res = xx.toArray();
            int[] expected = {20, 10};
            Assert.assertEquals(res,expected);
        }

        @Test
        public void testReverse_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            xx.reverse();
            int[] res = xx.toArray();
            int[] expected = {32, 99, 24, 11, 77, 20, 10};
            Assert.assertEquals(res,expected);
        }

        //======================================
        //sort1
        //======================================
        @Test
        public void testSort1_null()
        {
            int[] zz = null;
            xx.init(zz);
            xx.toArray();
        }

    /*@Apps.Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSort1_0()
    {
        int[] zz = {};
        xx.init(zz);
        xx.bubbleSort();
        int[] res = xx.toArray();
        int[] expected = {};
        assertArrayEquals(expected, res);
    }        */

        @Test
        public void testSort1_1()
        {

            int[] zz = {10};
            xx.init(zz);
            xx.bubbleSort();
            int[] res = xx.toArray();
            int[] expected = {10};
            Assert.assertEquals(res,expected);
        }

        @Test
        public void testSort1_2()
        {
            int[] zz = {20, 10};
            xx.init(zz);
            xx.bubbleSort();
            int[] res = xx.toArray();
            int[] expected = {10, 20};
            Assert.assertEquals(res,expected);
        }

        @Test
        public void testSort1_many()
        {
            int[] zz = {20, 77, 11, 24, 99, 32};
            xx.init(zz);
            xx.bubbleSort();
            int[] res = xx.toArray();
            int[] expected = {11, 20, 24, 32, 77, 99};
            Assert.assertEquals(res,expected);
        }

//======================================
//Add to End
//======================================

        @Test
        public void testAdd_2()
        {
            int[] zz = {10, 20, 32};
            xx.init(zz);
            xx.addEnd(5);
            int[] res = xx.toArray();
            int[] expected = {10, 20, 32, 5};
            Assert.assertEquals(res,expected);
        }

        @Test
        public void testAdd2_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            xx.addEnd(5);
            int[] res = xx.toArray();
            int[] expected = {10, 20, 77, 11, 24, 99, 32, 5};
            Assert.assertEquals(res,expected);
        }

        //======================================
//Delete End
//======================================
  /*  @Apps.Test(expected = NullPointerException.class)
    public void testDel_0()
    {
        int[] zz = {};

        xx.init(zz);
        xx.delEnd();
    } */

        @Test
        public void testDel2()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            xx.delEnd();
            int[] res = xx.toArray();
            int[] expected = {10, 20, 77, 11, 24, 99};
            Assert.assertEquals(res,expected);
        }

        @Test
        public void testDel2_many()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            xx.delEnd();
            int[] res = xx.toArray();
            int[] expected = {10};
            Assert.assertEquals(res,expected);
        }

        //======================================
        // addStart
        //======================================
   /* @Apps.Test
    public void testAddStart_0()
    {
        int[] zz = {};
        xx.init(zz);
        xx.addStart(5);
        int[] res = xx.toArray();
        int[] expected = {5};
        assertArrayEquals(expected, res);
    }*/

        @Test
        public void testAddStart_1()
        {
            int[] zz = {10};
            xx.init(zz);
            xx.addStart(5);
            int[] res = xx.toArray();
            int[] expected = {5, 10};
            Assert.assertEquals(res,expected);
        }

        @Test
        public void testAddStart_2()
        {
            int[] zz = {11, 21};
            xx.init(zz);
            xx.addStart(5);
            int[] res = xx.toArray();
            int[] exp = {5, 11, 21};
            Assert.assertEquals(res, exp);
        }

        @Test
        public void testAddStart_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            xx.addStart(5);
            int[] res = xx.toArray();
            int[] expected = {5, 10, 20, 77, 11, 24, 99, 32};
            Assert.assertEquals(res, expected);
        }

        //======================================
        // delStart
        //======================================


        @Test
        public void testDelStart_2()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            xx.delStart();
            int[] res = xx.toArray();
            int[] expected = {20};
            Assert.assertEquals(res, expected);
        }

        @Test
        public void testDelStart_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            xx.delStart();
            int[] res = xx.toArray();
            int[] expected = {20, 77, 11, 24, 99, 32};
            Assert.assertEquals(res, expected);
        }
        //======================================
        // addPos
        //======================================


        @Test
        public void testAddPos_1()
        {
            int[] zz = {10};
            xx.init(zz);
            xx.addPos(0, 5);
            int[] res = xx.toArray();
            int[] expected = {5, 10};
            Assert.assertEquals(res, expected);
        }

        @Test
        public void testAddPos_2()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            xx.addPos(1, 5);
            int[] res = xx.toArray();
            int[] expected = {10, 5, 20};
            Assert.assertEquals(res, expected);
        }

        @Test
        public void testAddPos_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            xx.addPos(1, 5);
            int[] res = xx.toArray();
            int[] exp = {10, 5, 20, 77, 11, 24, 99, 32};
            Assert.assertEquals(exp, res);
        }

        //======================================
        // delPos
        //======================================

        @Test
        public void testDelPos_2()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            xx.delPos(1);
            int[] res = xx.toArray();
            int[] expected = {10};
            Assert.assertEquals(res, expected);
        }

        @Test
        public void testDelPos_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            xx.delPos(2);
            int[] res = xx.toArray();
            int[] expected = {10, 20, 11, 24, 99, 32};
            Assert.assertEquals(res, expected);
        }
        //======================================
        // set
        //======================================

        @Test
        public void testSetPos_1()
        {
            int[] zz = {10};
            xx.init(zz);
            xx.set(0, 44);
            int[] res = xx.toArray();
            int[] expected = {44};
            Assert.assertEquals(res, expected);
        }

        @Test
        public void testSetPos_2()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            xx.set(0, 44);
            int[] res = xx.toArray();
            int[] expected = {44, 20};
            Assert.assertEquals(res, expected);
        }

        @Test
        public void testSetPos_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            xx.set(0, 44);
            int[] res = xx.toArray();
            int[] expected = {44, 20, 77, 11, 24, 99, 32};
            Assert.assertEquals(res, expected);
        }

        //======================================
        // get
        //======================================

        @Test
        public void testGetPos_0()
        {
            int[] zz = {10};
            xx.init(zz);
            int res = xx.get(0);
            int expected = 10;
            Assert.assertEquals(res, expected);
        }

        @Test
        public void testGetPos_2()
        {
            int[] zz = {10, 20};
            xx.init(zz);
            int res = xx.get(0);
            int expected = 10;
            Assert.assertEquals(res, expected);
        }

        @Test
        public void testGetPos_many()
        {
            int[] zz = {10, 20, 77, 11, 24, 99, 32};
            xx.init(zz);
            int res = xx.get(0);
            int expected = 10;
            Assert.assertEquals(res, expected);
        }
    }





