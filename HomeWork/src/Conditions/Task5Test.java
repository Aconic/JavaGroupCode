package Conditions;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Task5Test
{
    @Test
    public void testRating1() throws Exception
    {
       String res = Task5.rating(0);
       assertEquals ("F", res);
    }

    @Test
    public void testRating2() throws Exception
    {
        String res = Task5.rating(55);
        assertEquals ("D", res);
    }

    @Test
    public void testRating3() throws Exception
    {
        String res = Task5.rating(85);
        assertEquals ("B", res);
    }
    @Test
    public void testRating4() throws Exception
    {
        String res = Task5.rating(99);
        assertEquals ("A", res);
    }

}
