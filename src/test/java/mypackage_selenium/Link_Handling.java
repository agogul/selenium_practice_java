package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Link_Handling {
    public static void main(String[] args) throws  IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoqa.com/broken");

        List<WebElement> all_data = driver.findElements(By.tagName("a"));

        for(WebElement link: all_data){
            String url = link.getAttribute("href");
            if(url==null)
                continue;

            URL link_test = new URL(url);


            HttpURLConnection http_test = (HttpURLConnection) link_test.openConnection();

            http_test.connect();
            System.out.println(http_test.getErrorStream());

            int code = http_test.getResponseCode();
            if (code<300){
                System.out.println(url+"link is good");
            }
            else if(code>400) {
                System.out.println(url+"link is broken");
            }

        }
    }
}
