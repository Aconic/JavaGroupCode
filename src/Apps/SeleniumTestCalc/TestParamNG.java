package Apps.SeleniumTestCalc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class TestParamNG
{

     static WebDriver driver;

        public TestParamNG(int i)
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

    @Parameters
        public static List<Object[]> data()
        {
            return Arrays.asList(new Object[][]{{1}, {2}});
        }

    @BeforeTest
    public void clear()
    {
        driver.navigate().refresh();
    }

    @AfterTest
    public  void close()
    {
        driver.close();
    }


    @Parameters
    @Test
    public void testResultSum()
    {
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("plus")).click();
        driver.findElement(By.id("btn3")).click();
        driver.findElement(By.id("equal")).click();
        assertEquals("8", driver.findElement(By.id("display")).getAttribute("value"));
    }

}
