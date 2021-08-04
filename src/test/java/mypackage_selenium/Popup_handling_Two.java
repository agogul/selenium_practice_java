package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup_handling_Two {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();




        driver.get("http://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.switchTo().alert().accept();

        String expresult = "You pressed Ok";
        String actresult = driver.findElement(By.id("demo")).getText();

        if(expresult.equals(actresult)){
            System.out.println("test passed");
        }
        else{
            System.out.println("test fail");
        }

        driver.findElement(By.linkText("Alert with Textbox")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        driver.switchTo().alert().sendKeys("gokul is software test engineer");
        driver.switchTo().alert().accept();



    }
}
