package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_RightClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions m_action = new Actions(driver);

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

//        WebElement act = driver.findElement(By.xpath("//span[contains(@class,'context-menu-one btn')]"));
//        m_action.contextClick(act).build().perform();

        m_action.contextClick(driver.findElement(By.xpath("//span[contains(@class,'context-menu-one btn')]"))).build().perform();
        driver.findElement(By.xpath("/html/body/ul/li[5]")).click();
        String data = driver.switchTo().alert().getText();
        System.out.println(data);
        driver.switchTo().alert().accept();

    }
}
