package taking_screen_shot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screen_Shot_With_NewMeth {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://opensource-demo.orangehrmlive.com/");
        TakesScreenshot ss = (TakesScreenshot) driver;
        File image = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(image, new File("C:\\Users\\GOKUL\\Desktop\\neworhrm.png"));
    }
}
