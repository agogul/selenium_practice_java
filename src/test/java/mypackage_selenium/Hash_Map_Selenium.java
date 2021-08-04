package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class Hash_Map_Selenium {
    public static void main(String[] args) throws InterruptedException {
        HashMap<Integer, String> data = new HashMap<>();
        data.put(1, "gokul@9842856908");
        data.put(2, "admin@Admin");
        data.put(3, "Admin@admin123");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        for(Integer i : data.keySet()) {
            String[] user_pass = data.get(i).split("@");

            WebElement username = driver.findElement(By.id("txtUsername"));
            WebElement password = driver.findElement(By.id("txtPassword"));
            username.sendKeys(user_pass[0]);
            password.sendKeys(user_pass[1]);
            driver.findElement(By.id("btnLogin")).click();
            try {
                driver.findElement(By.id("spanMessage"));
                System.out.println("WRONG USERNAME OR PASSSWORD"+"  "+user_pass[0]+" "+user_pass[1]);
            } catch (Exception e) {
                System.out.println("CORRECT USERNAME AND PASSSWORD"+"  "+user_pass[0]+" "+user_pass[1]);
            }

        }
    }
}
