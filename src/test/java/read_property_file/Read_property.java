package read_property_file;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_property {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        File file = new File("C:\\Users\\GOKUL\\IdeaProjects\\selenium_practice_java\\src\\test\\java\\read_property_file\\readdata.properties");
        FileInputStream stream_file = new FileInputStream(file);
        Properties file_prop = new Properties();
        file_prop.load(stream_file);

        driver.findElement(By.id("txtUsername")).sendKeys(file_prop.getProperty("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(file_prop.getProperty("password"));
        driver.findElement(By.id("btnLogin")).click();
    }
}
