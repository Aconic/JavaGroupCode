package Functions;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Task1Test
{
    @Test
    public void testWeek1() {
        Task1 obj = new Task1();
        int n = 1;
        String str = obj.week(n);
        assertEquals("Понедельник", str);
    }

    @Test
    public void testWeek2() {
        Task1 obj = new Task1();
        int n = 2;
        String str = obj.week(n);
        assertEquals("Вторник", str);
    }

    @Test
    public void testWeek3() throws Exception {
        Task1 obj = new Task1();
        int n = 3;
        String str = obj.week(n);
        assertEquals("Среда", str);
    }

    @Test
    public void testWeek4() throws Exception {
        Task1 obj = new Task1();
        int n = 4;
        String str = obj.week(n);
        assertEquals("Четверг", str);
    }
    @Test
    public void testWeek5() throws Exception {
        Task1 obj = new Task1();
        int n = 5;
        String str = obj.week(n);
        assertEquals("Пятница", str);
    }

    @Test
    public void testWeek6() throws Exception {
        Task1 obj = new Task1();
        int n = 6;
        String str = obj.week(n);
        assertEquals("Суббота", str);
    }

    @Test
    public void testWeek7() throws Exception {
        Task1 obj = new Task1();
        int n = 7;
        String str = obj.week(n);
        assertEquals("Воскресенье", str);
    }

    @Test    (expected = IllegalArgumentException.class)
    public void testWeekOut1()  {
        Task1 obj = new Task1();
        String str = obj.week(8);
    }

    @Test   (expected = IllegalArgumentException.class)
    public void testWeekOut2()  {
        Task1 obj = new Task1();
        String str = obj.week(0);
    }

}
