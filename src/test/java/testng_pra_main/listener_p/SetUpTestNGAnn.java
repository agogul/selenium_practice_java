//package testng_pra_main.listener_p;
//
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import element_locatorP.BaseClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//
//public class SetUpTestNGAnn extends BaseClass {
//
//    public ExtentHtmlReporter htmlReporter;
//    public ExtentReports extentReports;
//    public ExtentTest extentTest;
//
//    @BeforeTest
//    public void extentReportGen(){
//
//        htmlReporter = new ExtentHtmlReporter("C:\\Users\\GOKUL\\IdeaProjects\\selenium_practice_java\\src\\test\\report\\extent_report"+obj.dateAsFileName()+".html");
//        htmlReporter.config().setDocumentTitle("eBanking Automation report");
//        htmlReporter.config().setReportName("Functional Test");
//        htmlReporter.config().setTheme(Theme.DARK);
//        extentReports = new ExtentReports();
//        extentReports.attachReporter(htmlReporter);
//        extentReports.setSystemInfo("Hostname","LocalHost");
//        extentReports.setSystemInfo("OS","Windows10");
//        extentReports.setSystemInfo("Tester Name","Gokul");
//        extentReports.setSystemInfo("Browser","Chrome");
//    }
//    @AfterTest
//    public void endReport(){
//        extentReports.flush();
//    }
//
//}
