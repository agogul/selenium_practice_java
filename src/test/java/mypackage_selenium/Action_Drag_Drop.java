package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Action_Drag_Drop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        Actions act = new Actions(driver);

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        act.dragAndDrop(driver.findElement(By.id("box3")), driver.findElement(By.xpath("//div[text()='United States']"))).build().perform();
        act.dragAndDrop(driver.findElement(By.id("box7")), driver.findElement(By.xpath("//div[text()='Spain']"))).build().perform();
        act.dragAndDrop(driver.findElement(By.id("box6")), driver.findElement(By.xpath("//div[text()='Italy']"))).build().perform();
        act.dragAndDrop(driver.findElement(By.id("box5")), driver.findElement(By.xpath("//div[text()='South Korea']"))).build().perform();
        act.dragAndDrop(driver.findElement(By.id("box4")), driver.findElement(By.xpath("//div[text()='Denmark']"))).build().perform();
        act.dragAndDrop(driver.findElement(By.id("box2")), driver.findElement(By.xpath("//div[text()='Sweden']"))).build().perform();
        act.dragAndDrop(driver.findElement(By.id("box1")), driver.findElement(By.xpath("//div[text()='Norway']"))).build().perform();


        //we can do this also with click and hold(source).move to element(destination).release.build.perform


    }
}

