package Conditions;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**

 */
public class Task2Test {
    @Test
    public void testCoord1() {
        Task2 obj = new Task2();
        int quart = obj.coord(12, 34);
        assertEquals(1, quart);
    }

    @Test
    public void testCoord2()
    {
        Task2 obj = new Task2();
        int quart = obj.coord(12, -34);
        assertEquals(2, quart);
    }
    @Test
    public void testCoord3()
    {
        Task2 obj = new Task2();
        int quart = obj.coord(-12, -34);
        assertEquals(3, quart);
    }
    @Test
    public void testCoord4()
    {
        Task2 obj = new Task2();
        int quart = obj.coord(-12, 34);
        assertEquals(4, quart);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCoord5()
    {
        Task2 obj = new Task2();
        int quart = obj.coord(0, 0);

    }
}
