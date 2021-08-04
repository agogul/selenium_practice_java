package mypackage_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Data_Driven_Test_Apache_Part2 {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("C:\\Users\\GOKUL\\Desktop\\Book1.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sh = wb.getSheet("sheet4");

        int r_cou = sh.getLastRowNum();
        int c_cou = sh.getRow(0).getLastCellNum();

        IntStream r_count = IntStream.range(1,r_cou+1);
        IntStream c_count = IntStream.range(0,c_cou);

        int [] num1 = r_count.toArray();
        int [] num2 = c_count.toArray();

        ArrayList<String> all_data = new ArrayList<>();


        for(int r :num1){

            for (int c : num2){
               XSSFCell data = sh.getRow(r).getCell(c);

                all_data.add(data.getRawValue());
            }
            Data_Driven_Test_Apache_Part2.driver_Auto(all_data.get(0),all_data.get(1),all_data.get(2));
            System.out.println(all_data);
            all_data.clear();
            System.out.println(all_data);
        }
    }

    static void driver_Auto(String amount, String interest, String year){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true++-");
        driver.findElement(By.id("principal")).sendKeys(amount);
        driver.findElement(By.id("interest")).sendKeys(interest);
        driver.findElement(By.id("tenure")).sendKeys(year);
        WebElement year1 = driver.findElement(By.id("tenurePeriod"));
        Select year_option = new Select(year1);
        year_option.selectByVisibleText("year(s)");
        WebElement frequency = driver.findElement(By.id("frequency"));
        Select frequency_option = new Select(frequency);
        frequency_option.selectByVisibleText("Simple Interest");
        driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
        WebElement all_amount = driver.findElement(By.xpath("//span[@id='resp_matval']/strong[1]"));
        System.out.println(all_amount.getText());
        driver.close();
    }
}
