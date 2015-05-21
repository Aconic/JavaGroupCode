package com.aconic.lessons.Lesson2;
        // юнит-тест калькулятора
import static junit.framework.Assert.assertEquals;

/**

 */
public class Calc1Test
{
    @org.junit.Test
    public void testCalcSum() throws Exception {
        int res = Calc1.calc(10, "+", 5);
         assertEquals(15, res);
    }
    @org.junit.Test
    public void testCalcSubstraction() throws Exception {
        int res = Calc1.calc(10, "-", 5);
        assertEquals(5, res);
    }
    @org.junit.Test
    public void testCalcMultiply() throws Exception {
        int res = Calc1.calc(10, "*", 5);
        assertEquals(50, res);
    }
    @org.junit.Test
    public void testCalcDivide() throws Exception {
        int res = Calc1.calc(10, "/", 5);
        assertEquals(2, res);
    }

}
