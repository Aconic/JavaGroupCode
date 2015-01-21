package CalcApp;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: RudinA
 * Date: 10.11.14
 * Time: 17:32
 * To change this template use File | Settings | File Templates.
 */
public class CalcFuncTest
{
    @Test
    public void testCalc() throws Exception
    {
       int res = CalcFunc.calc(1,2,"+");
        assertEquals(3,res);
    }
}
