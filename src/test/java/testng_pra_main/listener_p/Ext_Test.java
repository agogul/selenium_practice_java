package testng_pra_main.listener_p;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import element_locatorP.BaseClass;
import org.testng.annotations.Listeners;

@Listeners(Listener_Interface_Imp.class)
public class Ext_Test extends BaseClass {
    ExtentSparkReporter sparkReporter;
    ExtentReports extentReports;


    public void report_Gen(){
        sparkReporter = new ExtentSparkReporter("C:\\Users\\GOKUL\\IdeaProjects\\selenium_practice_java\\src\\test\\report\\extent_report"+obj.dateAsFileName()+".html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
        sparkReporter.config().setDocumentTitle("eBanking Automation");
        sparkReporter.config().setReportName("Functional Test");
        sparkReporter.config().setTheme(Theme.DARK);
        extentReports.setSystemInfo("Hostname","LocalHost");
        extentReports.setSystemInfo("OS","Windows10");
        extentReports.setSystemInfo("Tester Name","Gokul");
        extentReports.setSystemInfo("Browser","Chrome");
    }
    public void endReport(){
        extentReports.flush();
    }
}
