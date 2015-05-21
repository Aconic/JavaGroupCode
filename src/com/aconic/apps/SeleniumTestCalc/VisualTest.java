package com.aconic.apps.SeleniumTestCalc;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class VisualTest
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
    public void btn1VisualTest()
    {
       assertFalse(driver.findElements(By.id("btn1")).isEmpty());        //1 -й вариант проверки наличия
    }
    @Test
    public void btn2VisualTest()
    {
        assertTrue(driver.findElements(By.id("btn2")).size()!=0);       //2 -й вариант проверки наличия
    }

    @Test
    public void btn3VisualTest()
    {
        assertTrue(driver.findElements(By.id("btn3")).size()!=0);
    }

    @Test
    public void btn4VisualTest()
    {
        assertTrue(driver.findElements(By.id("btn4")).size()!=0);
    }
    @Test
    public void btn5VisualTest()
    {
        assertTrue(driver.findElements(By.id("btn5")).size()!=0);
    }
    @Test
    public void btn6VisualTest()
    {
        assertTrue(driver.findElements(By.id("btn6")).size()!=0);
    }
    @Test
    public void btn7VisualTest()
    {
        assertTrue(driver.findElements(By.id("btn7")).size()!=0);
    }

    @Test
    public void btn8VisualTest()
    {
        assertTrue(driver.findElements(By.id("btn8")).size()!=0);
    }
    @Test
    public void btn9VisualTest()
    {
        assertTrue(driver.findElements(By.id("btn9")).size()!=0);
    }
    @Test
    public void btn0VisualTest()
    {
        assertTrue(driver.findElements(By.id("btn0")).size()!=0);
    }


}
