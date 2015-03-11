package Apps.SeleniumTestCalc;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static com.thoughtworks.selenium.SeleneseTestCase.assertEquals;

@RunWith(value = Parameterized.class)
public class TestParamJUnit
{
        static WebDriver driver;
         public TestParamJUnit(int i)
        {
           switch (i){
               case 1:
                   File f = new File("C:\\chromedriver.exe");
                   System.setProperty("webdriver.chrome.driver", f.getAbsolutePath());
                   driver = new ChromeDriver();
                   driver.get("file:///D:/Dropbox/!Code_Rudin/JS-HTML/ClassWork/calculator.html");
                   break;
               case 2:
                   driver =  new FirefoxDriver();
                   driver.get("file:///D:/Dropbox/!Code_Rudin/JS-HTML/ClassWork/calculator.html");
                   break;
               default:
                   break;
           }
        }

        @Parameterized.Parameters
        public static List<Object[]> data()
        {
            return Arrays.asList(new Object[][]{{1},{2}} );
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
