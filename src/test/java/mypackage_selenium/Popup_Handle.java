package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Handle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //this is one method for normal switch
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.findElement(By.name("alert")).click();
        driver.switchTo().alert().accept();

        //send automatic username / pass to alert window

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        String data = driver.findElement(By.tagName("p")).getText();
        System.out.println(data);

    }
}
