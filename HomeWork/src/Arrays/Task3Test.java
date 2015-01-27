package Arrays;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class Task3Test
{
    @Test
    public void testIndexMinOfArray() throws Exception
    {
        Task3 obj = new Task3();
        int res = obj.IndexMinOfArray();
        assertEquals(2, res);
    }
}
