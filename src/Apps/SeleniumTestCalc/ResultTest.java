package Apps.SeleniumTestCalc;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.thoughtworks.selenium.SeleneseTestCase.assertEquals;

public class ResultTest
{
    static WebDriver driver;

    @BeforeClass
    public static void setUp()
    {
       // File f = new File("C:\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", f.getAbsolutePath());
        driver = new FirefoxDriver();
        driver.get("file:///D:/Dropbox/!Code_Rudin/JS-HTML/ClassWork/calculator.html");
    }

    @Before
    public void clear()
    {
        driver.navigate().refresh();
    }

    @After
    public  void close()
    {
        driver.close();
    }

    @Test
    public void testResultSum()
    {
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("plus")).click();
        driver.findElement(By.id("btn3")).click();
        driver.findElement(By.id("equal")).click();
        assertEquals("8", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testResultMinus()
    {
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("minus")).click();
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("equal")).click();
        assertEquals("2", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testResultMultiply()
    {
        driver.findElement(By.id("btn3")).click();
        driver.findElement(By.id("multiply")).click();
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("equal")).click();
        assertEquals("6", driver.findElement(By.id("display")).getAttribute("value"));
    }

    @Test
    public void testResultDivide()
    {
        driver.findElement(By.id("btn9")).click();
        driver.findElement(By.id("divide")).click();
        driver.findElement(By.id("btn3")).click();
        driver.findElement(By.id("equal")).click();
        assertEquals("3", driver.findElement(By.id("display")).getAttribute("value"));
    }

}
