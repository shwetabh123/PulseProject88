
/**
 * @author aswani.kumar.avilala
 */
package generic;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReportListener implements ITestListener {
	
	
 protected  WebDriver driver;
/* protected  ExtentReports reports;
 protected  ExtentTest test;*/
 
 
	public  static ExtentReports extent;
	public  static ExtentTest extentTest; 

 
 
 
 Logger APP_LOGS = Logger.getLogger("ExtentReportListener");
 
 
 public static String logfiletimestamp;
 Date d = new Date();
 
 public void onTestStart(ITestResult result) {
	 
	 

	  PropertyConfigurator.configure("Log4j.properties");
  System.out.println("on test start");
	
	extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/"+"AutomationLog_TestRunIdExtentReport.html", false);

  
  extentTest = extent.startTest(result.getMethod().getMethodName());
  

	
  APP_LOGS.info( result.getMethod().getMethodName() + "  test is started");
  extentTest.log(LogStatus.INFO, result.getMethod().getMethodName() + " test is started");
 
 
 }
 
 
 
 public void onTestSuccess(ITestResult result) 
 
 {
  System.out.println("on test success");
  
	extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/"+"AutomationLog_TestRunIdExtentReport.html", false);

	  
	  extentTest = extent.startTest(result.getMethod().getMethodName());
	  

	  
	  
  extentTest.log(LogStatus.PASS, result.getMethod().getMethodName() + "  test is passed");
  
  APP_LOGS.info( result.getMethod().getMethodName() +  "  test is passed");
  

  
 }
 
 

 
 public void onTestFailure(ITestResult result)
 
 
 {
  System.out.println("on test failure");
  
	extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/"+"AutomationLog_TestRunIdExtentReport.html", false);

	  
	  extentTest = extent.startTest(result.getMethod().getMethodName());
	  

  
  APP_LOGS.info( result.getMethod().getMethodName() + "  test is failed");
 
  extentTest.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed");
  
  
  TakesScreenshot ts = (TakesScreenshot) driver;
  File src = ts.getScreenshotAs(OutputType.FILE);
  try {
   FileUtils.copyFile(src, new File("C:\\Users\\ssrivastava4\\workspace\\PulseProject8\\screenshots\\"+result.getMethod().getMethodName() + ".png"));
   
   String file = extentTest.addScreenCapture("C:\\Users\\ssrivastava4\\workspace\\PulseProject8\\screenshots\\"+result.getMethod().getMethodName() + ".png");
   
   extentTest.log(LogStatus.FAIL, result.getMethod().getMethodName() + "  test is failed", file);
   
   
   extentTest.log(LogStatus.FAIL, result.getMethod().getMethodName() + "  test is failed", result.getThrowable().getMessage());
  
  
  
  } catch (IOException e) {
   e.printStackTrace();
  }
  
  
  
 }
 
 
 
 
 
 public void onTestSkipped(ITestResult result) {
  System.out.println("on test skipped");
  extentTest.log(LogStatus.SKIP, result.getMethod().getMethodName() + "  test is skipped");
 }
 
 
 
 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
  System.out.println("on test sucess within percentage");
 }
 
 
 public void onStart(ITestContext context) {
	 
	 
  System.out.println("on start");
 // driver = new ChromeDriver(); // Set the drivers path in environment variables to avoid code(System.setProperty())
  extent = new ExtentReports(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date()) + "reports.html");
 }
 
 
 
 public void onFinish(ITestContext context) {
  System.out.println("on finish");
  //driver.close();
  //reports.endTest(test);
  extent.flush();
 }
 
 
}