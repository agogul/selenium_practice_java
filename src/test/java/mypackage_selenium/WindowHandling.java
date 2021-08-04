package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;


public class WindowHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
//        HashSet<String> All_win = new HashSet<>(driver.getWindowHandles());
//        System.out.println(All_win);
        ArrayList<String> all_win1 = new ArrayList<>(driver.getWindowHandles());
        System.out.println(all_win1);
        System.out.println(driver.getWindowHandles().getClass());
//        Set<String> parent_window = driver.getWindowHandles();
//        ArrayList<String> all_win = new ArrayList<>(parent_window.stream().toList());
//        System.out.println(all_win);
//        for(String id : all_win){
//            String all_title = driver.switchTo().window(id).getTitle();
//            System.out.println(id+"  "+all_title);
//        }
        driver.switchTo().window(all_win1.get(0));
        driver.close();

    }
}
