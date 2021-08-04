package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
        WebElement data=driver.findElement(By.id("small-searchterms"));
        WebElement data1=driver.findElement(By.id("small-searchterms"));
        System.out.println(data.isDisplayed());
        System.out.println(data1.isEnabled());
        WebElement radio1=driver.findElement(By.id("gender-male"));
        radio1.click();
        System.out.println(radio1.isSelected());
        String text_data = radio1.getText();
        System.out.println(text_data);



    }
}
