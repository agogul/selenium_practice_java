package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("ChromiumDevToolsLocator")).click();

        driver.switchTo().defaultContent();

        System.out.println(driver.getTitle());
    }
}

