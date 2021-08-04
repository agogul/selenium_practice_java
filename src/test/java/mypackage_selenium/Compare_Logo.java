package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Compare_Logo {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        //BufferedImage expect_logo = ImageIO.read(new File("C://Users/GOKUL/Desktop/Sikuli images/orange1.png"));

        //WebElement web_image = driver.findElement(By.xpath("//img[@src='/webres_6051af48107ce6.31500353/themes/default/images/login/logo.png']"));

        AShot image = new AShot();
        //BufferedImage act_logo = image.takeScreenshot(driver, web_image).getImage();
        BufferedImage image1 = image.takeScreenshot(driver).getImage();
        File file = new File("C://Users//GOKUL//Desktop//study.png");
        ImageIO.write(image1,"png",file);



        //ImageDiffer image_diff = new ImageDiffer();
       // ImageDiff diff = image_diff.makeDiff(expect_logo, act_logo);

       // if(diff.hasDiff()){
            //System.out.println("Images are not same");
        //}
       // else{
       //     System.out.println("Images are same");
        //}
    }
}
