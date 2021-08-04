package testng_pra_main.listener_p;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.*;


public class Listener_TestNG extends Ext_Test {
    @BeforeMethod
    public void LocalDriver() {
        obj.browser_Name("chrome");
    }
    @BeforeSuite
    public void LocalDriver3() {
        System.out.println("*****BeforeTest*****");
    }


    @Test
    public void login_test_Two(){
        obj.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        obj.getDriver().findElement(By.id("txtUsername")).sendKeys("Admin1");
        obj.getDriver().findElement(By.id("txtPassword")).sendKeys("admin123");
        obj.getDriver().findElement(By.id("btnLogin")).click();
        WebElement element = obj.getDriver().findElement(By.id("spanMessage"));
        if (element.isDisplayed()) {
            Assert.fail();
        }
        else {
            Assert.assertTrue(true);
        }

    }
    @Test
    public void login_test_Tw() {
        obj.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        obj.getDriver().findElement(By.id("txtUsername")).sendKeys("Admin1");
        obj.getDriver().findElement(By.id("txtPassword")).sendKeys("admin123");
        obj.getDriver().findElement(By.id("btnLogin")).click();
        WebElement element = obj.getDriver().findElement(By.id("spanMessage"));
        if (element.isDisplayed()) {
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
    }
    @AfterMethod
    public void LocalDriver1() {
        obj.getDriver().close();
    }


}
