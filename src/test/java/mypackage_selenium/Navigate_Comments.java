package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//back,forward,refresh,navigate.to
public class Navigate_Comments {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.get("https://www.snapdeal.com/");
        driver.navigate().to("https://www.facebook.com/");

        /*There is no different between grt and navigate.to method
        * because navigate.to is build top of the get method*/

        driver.navigate().back();//amazon
        driver.navigate().forward();//snapdeal

        driver.navigate().refresh();//refresh or reload page
        //

    }
}
