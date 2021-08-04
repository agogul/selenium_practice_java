package mypackage_selenium;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BarCode_Reader_Zxing {
    public static void main(String[] args) throws IOException, NotFoundException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement element = driver.findElement(By.xpath("//img[@src='https://3.bp.blogspot.com/-xaeByLfXiFk/XCxZ33hrgKI/AAAAAAAAPPI/5d4O-mf27lEQKtSiiBjx3UgtxSV0yJUpwCLcBGAs/s1600/barcode.gif']"));
        String el_url = element.getAttribute("src");
        URL url = new URL(el_url);
        System.out.println(url);

        BufferedImage buf_image = ImageIO.read(url);
        BufferedImageLuminanceSource buff_luminus_source = new BufferedImageLuminanceSource(buf_image);
        BinaryBitmap binarybitmap = new BinaryBitmap(new HybridBinarizer(buff_luminus_source));
        Result result = new MultiFormatReader().decode(binarybitmap);
        System.out.println(result.getText());
    }
}
