package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Sikuli_Practice {
    public static void main(String[] args) throws InterruptedException, FindFailed {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);

        driver.get("http://demo.automationtesting.in/Register.html");

        act.moveToElement(driver.findElement(By.id("imagesrc"))).click().build().perform();

        Thread.sleep(5000);


        Screen s = new Screen();

        Pattern file_input_box = new Pattern("C:\\Users\\GOKUL\\Desktop\\Sikuli images\\Filetextbox.PNG");
        Pattern file_open = new Pattern("C:\\Users\\GOKUL\\Desktop\\Sikuli images\\Openbutton.PNG");
        Thread.sleep(5000);

        s.wait(file_input_box,20);
        s.type(file_input_box,"C:\\Users\\GOKUL\\Desktop\\Sikuli images\\input.JFIF");
        s.click(file_open);



    }
}
