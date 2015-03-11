package Apps.BiTree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class ETreeListTest
{
    TreeList xx;

    @Before
    public void setUp() throws Exception
    {
        xx = new TreeList();
    }

    @Test
    public void testAdd_1()
    {
        int [] tArr = {10};
        int val = 999;
        int [] exp = {10,999};
        xx.init(tArr);
        xx.add(val);
        assertArrayEquals(exp, xx.toArray());
    }

    @Test
    public void testAdd_2()
    {
       int [] tArr = {10,22};
       int val = 999;
       int [] exp = {10,22,999};
       xx.init(tArr);
       xx.add(val);
       assertArrayEquals(exp, xx.toArray());
    }

    @Test
    public void testAdd_many()
    {
        int [] tArr = {10,22,5,13};
        int val = 999;
        int [] exp = {10,22,5,13,999};
        xx.init(tArr);
        xx.add(val);
        assertArrayEquals(exp, xx.toArray());
    }



    @Test
    public void testSize()
    {

    }

    @Test
    public void testCountLeaves()
    {

    }
}
