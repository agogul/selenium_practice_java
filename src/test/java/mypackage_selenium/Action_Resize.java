package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Resize {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);

        driver.get("https://jqueryui.com/resizable/");

        driver.switchTo().frame(0);

        WebElement win = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));

        act.dragAndDropBy(win,40,40).build().perform();
    }
}
