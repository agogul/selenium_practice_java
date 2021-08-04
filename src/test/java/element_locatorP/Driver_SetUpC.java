package element_locatorP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Driver_SetUpC {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void browser_Name(String browser_name){
        if (browser_name.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            setDriver(new ChromeDriver());
        }
        else if (browser_name.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            setDriver(new FirefoxDriver());
        }
    }
}
