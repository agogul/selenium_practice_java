package element_locatorP;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Element_LocatorC extends Driver_SetUpC {

    public WebElement id;
    public WebElement xpath;
    public WebElement css;
    public WebElement name;
    public WebElement link_text;
    public WebElement tag_name;


    public void elementLocatorM(String locator_name, String element) {
        switch (locator_name) {
            case "id" -> id = getDriver().findElement(By.id(element));
            case "xpath" -> xpath =  getDriver().findElement(By.xpath(element));
            case "css" -> css =  getDriver().findElement(By.cssSelector(element));
            case "name" -> name =  getDriver().findElement(By.name(element));
            case "link_text" -> link_text = getDriver().findElement(By.linkText(element));
            case "tag_name" -> tag_name =  getDriver().findElement(By.tagName(element));

        }
    }
    public String failedShot(String path){
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File image = ss.getScreenshotAs(OutputType.FILE);

        File file = new File(path);
        try {
            FileUtils.copyFile(image,file);
            System.out.println("*******ScreenShotTaken*******");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file.getAbsolutePath();
    }
    public String dateAsFileName(){
        return new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss-").format(new Date());
    }
}
