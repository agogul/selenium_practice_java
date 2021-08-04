package mypackage_selenium;

import element_locatorP.Element_LocatorC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New_Pra extends Element_LocatorC {
    @BeforeMethod
    public void set_uppp(){
        browser_Name("chrome");
    }
    @Test
    void login_test_Two(){
        //test = extentReporter.createTest("login_test_Two");
        getDriver().get("https://opensource-demo.orangehrmlive.com/");
        getDriver().findElement(By.id("txtUsername")).sendKeys("Admin1");
        getDriver().findElement(By.id("txtPassword")).sendKeys("admin123");
        getDriver().findElement(By.id("btnLogin")).click();
        WebElement element = getDriver().findElement(By.id("spanMessage"));
        if (element.isDisplayed()) {
            Assert.fail();
        }
        else {
            Assert.assertTrue(true);
        }

    }
}
