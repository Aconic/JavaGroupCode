package Functions;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Task2Test
{

    @Test
    public void testNumString0() throws Exception
    {
        String res = Task2.numString(0);
        assertEquals("ноль", res);
    }

    @Test
    public void testNumString1() throws Exception
    {
        String res = Task2.numString(1);
        assertEquals("один", res);
    }

    @Test
    public void testNumString2() throws Exception
    {
        String res = Task2.numString(2);
        assertEquals("два", res);
    }
    @Test
    public void testNumString9() throws Exception
    {
        String res = Task2.numString(9);
        assertEquals("девять", res);
    }


    @Test
    public void testNumString11() throws Exception
    {
          String res = Task2.numString(11);
        assertEquals("одиннадцать", res);
    }

    @Test
    public void testNumString20() throws Exception
    {
        String res = Task2.numString(20);
        assertEquals("двадцать ", res);
    }

    @Test
    public void testNumString38() throws Exception
    {
        String res = Task2.numString(38);
        assertEquals("тридцать восемь", res);
    }
    @Test
    public void testNumString89() throws Exception
    {
        String res = Task2.numString(89);
        assertEquals("восемьдесят девять", res);
    }

    @Test
    public void testNumString101() throws Exception
    {
        String res = Task2.numString(101);
        assertEquals("сто один", res);
    }
    @Test
    public void testNumString100() throws Exception
    {
        String res = Task2.numString(100);
        assertEquals("сто ", res);
    }
    @Test
    public void testNumString111() throws Exception
    {
        String res = Task2.numString(111);
        assertEquals("сто одиннадцать", res);
    }
    @Test
    public void testNumString120() throws Exception
    {
        String res = Task2.numString(120);
        assertEquals("сто двадцать ", res);
    }
    @Test
    public void testNumString199() throws Exception
    {
        String res = Task2.numString(199);
        assertEquals("сто девяносто девять", res);
    }
    @Test
    public void testNumString222() throws Exception
    {
        String res = Task2.numString(222);
        assertEquals("двести двадцать два", res);
    }

    @Test
    public void testNumString387() throws Exception
    {
        String res = Task2.numString(387);
        assertEquals("триста восемьдесят семь", res);
    }
    @Test
    public void testNumString500() throws Exception
    {
        String res = Task2.numString(500);
        assertEquals("пятьсот ", res);
    }
    @Test
    public void testNumString555() throws Exception
    {
        String res = Task2.numString(555);
        assertEquals("пятьсот пятьдесят пять", res);
    }

    @Test
    public void testNumString909() throws Exception
    {
        String res = Task2.numString(909);
        assertEquals("девятьсот девять", res);
    }

    @Test
    public void testNumString890() throws Exception
    {
        String res = Task2.numString(890);
        assertEquals("восемьсот девяносто ", res);
    }


    @Test
    public void testNumString999() throws Exception
    {
        String res = Task2.numString(999);
        assertEquals("девятьсот девяносто девять", res);
    }
}
