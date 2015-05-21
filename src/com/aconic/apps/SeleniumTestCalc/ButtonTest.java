package com.aconic.apps.SeleniumTestCalc;

import org.junit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static com.thoughtworks.selenium.SeleneseTestCase.assertEquals;

public class ButtonTest
{
    static WebDriver driver;

    @BeforeClass
    public static void setUp()
    {
        File f = new File("C:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", f.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get("file:///D:/Dropbox/!Code_Rudin/JS-HTML/ClassWork/calculator.html");
    }

    @Before
    public void clear()
    {
        driver.navigate().refresh();
    }

    @AfterClass
    public static void close()
    {
        driver.close();
    }

    @Test
    public void testBtn1()
    {
        driver.findElement(By.id("btn1")).click();
        assertEquals("1", driver.findElement(By.id("display")).getAttribute("value"));
        driver.navigate().refresh();
    }

    @Test
    public void testBtn2()
    {
        driver.findElement(By.id("btn2")).click();
        assertEquals("2", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtn3()
    {
        driver.findElement(By.id("btn3")).click();
        assertEquals("3", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtn4()
    {
        driver.findElement(By.id("btn4")).click();
        assertEquals("4", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtn5()
    {
        driver.findElement(By.id("btn5")).click();
        assertEquals("5", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtn6()
    {
        driver.findElement(By.id("btn6")).click();
        assertEquals("6", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtn7()
    {
        driver.findElement(By.id("btn7")).click();
        assertEquals("7", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtn8()
    {
        driver.findElement(By.id("btn8")).click();
        assertEquals("8", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtn9()
    {
        driver.findElement(By.id("btn9")).click();
        assertEquals("9", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtn0()
    {
        driver.findElement(By.id("btn0")).click();
        assertEquals("0", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtnPlus()
    {
        driver.findElement(By.id("plus")).click();
        assertEquals("", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtnMinus()
    {
        driver.findElement(By.id("plus")).click();
        assertEquals("", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtnMultiply()
    {
        driver.findElement(By.id("plus")).click();
        assertEquals("", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testBtnDivide()
    {
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("plus")).click();
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("equal")).click();
        assertEquals("7", driver.findElement(By.id("display")).getAttribute("value"));
    }


}
