package Arrays;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**

 */
public class Task4Test {
    @Test
    public void testIndexMaxOfArray() throws Exception {
        Task4 obj = new Task4();
        int res = obj.IndexMaxOfArray();
        assertEquals(4,res);
    }
}
