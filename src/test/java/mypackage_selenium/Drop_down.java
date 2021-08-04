package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import java.util.Collections;

class Drop_down {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

         WebElement drop_menu= driver.findElement(By.id("RESULT_RadioButton-9"));
         Select all_option = new Select(drop_menu);


        //ArrayList<WebElement> list = new ArrayList<>(all_option.getOptions());
        ArrayList<String> org_list = new ArrayList<>();
        for(WebElement data:all_option.getOptions()){
            org_list.add(data.getText());
            System.out.println(data.getText());
        }
        all_option.selectByVisibleText("Morning");

        System.out.println(org_list);
        Collections.sort(org_list);
        System.out.println(org_list);
    }
}
