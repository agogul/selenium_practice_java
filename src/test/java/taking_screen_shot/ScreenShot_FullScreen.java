package taking_screen_shot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class ScreenShot_FullScreen {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        TakesScreenshot ss = (TakesScreenshot) driver;
        driver.get("https://opensource-demo.orangehrmlive.com/");
        File image = ss.getScreenshotAs(OutputType.FILE);

        FileInputStream st_file = new FileInputStream(image);
        FileOutputStream img_out =new FileOutputStream("C:\\Users\\GOKUL\\Desktop\\orhrm1.png");

        int data;
        while((data = st_file.read())!=-1){
            img_out.write(data);
        }


        //taking screenshot on specific element
        WebElement element = driver.findElement(By.xpath("//img[@src='/webres_6051af48107ce6.31500353/themes/default/images/login/logo.png']"));
        File image1 = element.getScreenshotAs(OutputType.FILE);

        FileInputStream in_image = new FileInputStream(image1);
        FileOutputStream out_image = new FileOutputStream("C:\\Users\\GOKUL\\Desktop\\logoorhrm1.png");

        int data1;
        while((data1 = in_image.read())!=-1){
            out_image.write(data1);
        }
    }
}
