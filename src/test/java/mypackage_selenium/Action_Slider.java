package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Slider {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);

        driver.get("https://jqueryui.com/slider/");

        driver.switchTo().frame(0);

        WebElement slide = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all')]"));

        act.dragAndDropBy(slide,50,0).build().perform();

    }
}
