package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Save_Logo_Element {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement logo_image_element = driver.findElement(By.xpath("//img[@src='/webres_6051af48107ce6.31500353/themes/default/images/login/logo.png']"));

        AShot screen_sh = new AShot();
        Screenshot logo_image = screen_sh.takeScreenshot(driver, logo_image_element);

        ImageIO.write(logo_image.getImage(),"png",new File("C://Users/GOKUL/Desktop/Sikuli images/orange1.png"));

        File f = new File("C://Users/GOKUL/Desktop/Sikuli images/orange1.png");
        if(f.exists())
            System.out.println("file saved");
        else
            System.out.println("file not saved");
    }
}
