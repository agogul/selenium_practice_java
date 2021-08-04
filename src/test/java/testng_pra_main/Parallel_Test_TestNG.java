package testng_pra_main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parallel_Test_TestNG {
    WebDriver driver;

    @BeforeMethod
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    void login_Test() throws InterruptedException {

        Thread.sleep(5000);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        try{
            WebElement data = driver.findElement(By.id("spanMessage"));
            if(data.isDisplayed()){
                Assert.fail();
            }
        } catch (Exception e) {
            Assert.assertTrue(true);
            e.printStackTrace();
        }

    }
    @Test
    void check_title(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }

}
