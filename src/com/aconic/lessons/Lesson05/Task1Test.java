package com.aconic.lessons.Lesson05;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 29.10.14
 * Time: 19:04
 * To change this template use File | Settings | File Templates.
 */
public class Task1Test {

    @Test
    public void testWeek1() {

        int n = 1;
        String str = Task1.week(n);
        assertEquals("Понедельник", str);
    }

    @Test
    public void testWeek2() {

        int n = 2;
        String str = Task1.week(n);
        assertEquals("Вторник", str);
    }

    @Test
    public void testWeek3() throws Exception {

        int n = 3;
        String str = Task1.week(n);
        assertEquals("Среда", str);
    }

    @Test
    public void testWeek4() throws Exception {

        int n = 4;
        String str = Task1.week(n);
        assertEquals("Четверг", str);
    }
    @Test
    public void testWeek5() throws Exception {

        int n = 5;
        String str = Task1.week(n);
        assertEquals("Пятница", str);
    }

    @Test
    public void testWeek6() throws Exception {

        int n = 6;
        String str = Task1.week(n);
        assertEquals("Суббота", str);
    }

    @Test
    public void testWeek7() throws Exception {

        int n = 7;
        String str = Task1.week(n);
        assertEquals("Воскресенье", str);
    }

    @Test    (expected = IllegalArgumentException.class)
    public void testWeekOut1()  {

        int n = 8;
        String str = Task1.week(n);
    }
    @Test   (expected = IllegalArgumentException.class)
    public void testWeekOut2()  {

        int n = 0;
        String str = Task1.week(n);

    }

}
