package testng_pra_main.listener_p;





import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;

import lombok.SneakyThrows;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listener_Interface_Imp extends Ext_Test implements ITestListener {



    public void onTestStart(ITestResult result) {

        System.out.println("*******test started ****** "+result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("********test passed********  "+result.isSuccess());

    }

    @SneakyThrows
    public void onTestFailure(ITestResult result) {
        String image = obj.failedShot("C:\\Users\\GOKUL\\Desktop\\" + result.getName() + obj.dateAsFileName() + ".png");
        ExtentTest extentTest = extentReports.createTest(result.getName());
        extentTest.addScreenCaptureFromPath(image);
        extentTest.log(Status.FAIL,result.getThrowable());

        //extentTest.log(Status.FAIL,MediaEntityBuilder.createScreenCaptureFromPath(obj.failedShot(image)).build());
        /*BufferedImage data = ImageIO.read(new File(image));
        extentTest.addScreenCaptureFromPath(String.valueOf(data));*/
        //extentTest.fail("fail", MediaEntityBuilder.createScreenCaptureFromPath(image).build());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("******test skipped*******  "+result.isSuccess());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        report_Gen();
        System.out.println("*******test started  "+context.getName());

    }

    public void onFinish(ITestContext context) {

        endReport();
        System.out.println("*******test finished  "+context.getName());
    }
}
