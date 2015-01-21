package Arrays;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Date: 05.11.14 * Time: 21:38
 * To change this template use File | Settings | File Templates.
 */
public class Task6Test
{
    @Test
    public void testArrayReverse_0() throws Exception
    {
        Task6 obj = new Task6();
        int [] mas = {0};
        obj.ArrayReverse(mas);
        int [] exp = {0};
        assertArrayEquals(mas, exp);
    }

    @Test
    public void testArrayReverse_1() throws Exception
    {
        Task6 obj = new Task6();
        int [] mas = {1,2};
        obj.ArrayReverse(mas);
        int [] exp = {2,1};
        assertArrayEquals(mas, exp);
    }
}
