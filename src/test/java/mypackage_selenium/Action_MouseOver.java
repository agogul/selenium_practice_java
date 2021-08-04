package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_MouseOver {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions m_action = new Actions(driver);

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        Thread.sleep(2000);

        m_action.moveToElement(driver.findElement(By.xpath("//b[text()='Admin']")));
        m_action.moveToElement(driver.findElement(By.id("menu_admin_Job")));
        m_action.moveToElement(driver.findElement(By.id("menu_admin_viewJobTitleList"))).click().build().perform();
        System.out.println(driver.getTitle());
    }
}
