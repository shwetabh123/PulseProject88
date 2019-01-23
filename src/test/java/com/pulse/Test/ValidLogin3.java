package com.pulse.Test;
	import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.pulse.Page.Author;
import com.pulse.Page.HomePage;
import com.pulse.Page.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import generic.BasePage;
import generic.BaseTest;

import generic.Excel;
//import mx4j.log.Log;



//@Listeners(generic.RealGuru99TimeReport.class)


	public class ValidLogin3 extends BaseTest{


		
		
	static int teststepcount=000000;
	
	
	public  Logger APP_LOGS = Logger.getLogger("devpinoyLogger");

	
static	  Excel eLib = new Excel();
	
	public static String url = eLib.getCellValue(path,"PreCon", 1, 0);
	
	  public static String logfiletimestamp;
	    
		  
	public ITestResult result = null;
		
	 static Randomaplphanumber R=new Randomaplphanumber();
	  
	 static String r=  R.Random();
	
	@Test(priority=3)
		public void Companydirectory(Method method) throws Exception
		
		{
		

		 

		
		extentTest = extent.createTest(method.getName());
		
		
		driver.get(url);
		
		

			
				String un=Excel.getCellValue(XLPATH,"ValidLogin",5,0);
				String pw=Excel.getCellValue(XLPATH,"ValidLogin",5,1);
				String accnt=Excel.getCellValue(XLPATH,"ValidLogin",5,2);
	
				String cb=Excel.getCellValue(XLPATH,"Author",1,3);
				
				
			
		
                Logger APP_LOGS = Logger.getLogger(ValidLogin.class);
				

				LoginPage l=new LoginPage(driver);
				

				
				BasePage b=new BasePage(driver);
				

				
				
				APP_LOGS.info("type username");
				
			l.setUserName(un);
				
				
	//			driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
				

	//	        r= BaseTest.getScreenshot(driver, method.getName());

			
	//		APP_LOGS.info("type password");
				 
		
			extentTest.pass( "username is Typed ");
			
  //    	extentTest.log(LogStatus.PASS, "username is Typed ");
				
				
			extentTest.info( "Snapshot below: ");
			
		//		extentTest.log(LogStatus.INFO, "Snapshot below: ");
				
			 r=  BaseTest.getScreenshot(driver, method.getName());
					
		        
		        
				

			//		extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
			
			 extentTest.log(Status.INFO, "Screenshot Path: : " + r, MediaEntityBuilder.createScreenCaptureFromPath(r,"Author").build());
				
			//	extentTest.log(Status.INFO, "Screenshot is :-"+extentTest.addScreenCaptureFromPath(BaseTest.getScreenshot(driver, method.getName())));
				
	
					
			
				APP_LOGS.info("type password");
		
					
				l.setPassword(pw);
				
				Thread.sleep(5000);


					
	extentTest.log(Status.PASS, "password is Typed ");
				
				
			extentTest.log(Status.INFO, "Snapshot below: ");
			
		        r= BaseTest.getScreenshot(driver, method.getName());
					
		    	
				 extentTest.log(Status.INFO, "Screenshot  Path : " + r, MediaEntityBuilder.createScreenCaptureFromPath(r).build());
				
		//		extentTest.log(Status.PASS, "Screenshot is"+extentTest.addScreenCaptureFromPath(r));
				
		//			extentTest.log(LogStatus.PASS, extentTest.addScreenCaptureFromPath(r));
			

			
		 	APP_LOGS.info("click select");
				
				l.clickLogin();
				
				Thread.sleep(5000);
				
				
				
               extentTest.log(Status.PASS, "select is CLICKED ");
                
          	extentTest.log(Status.INFO, "Snapshot below: ");
				
		        r= BaseTest.getScreenshot(driver, method.getName());
					
		    	
				 extentTest.log(Status.INFO, "Screenshot Path : " + r, MediaEntityBuilder.createScreenCaptureFromPath(r).build());
					

					
				 	APP_LOGS.info("click dropdown");
				
				l.dropdowntheaccount(accnt);
				Thread.sleep(5000);
			
				
				 extentTest.log(Status.PASS, "dropdown is CLICKED ");
				 
				extentTest.log(Status.INFO, "Snapshot below: ");
					
			        r= BaseTest.getScreenshot(driver, method.getName());
						
			        
			    	
					 extentTest.log(Status.INFO, "Screenshot  Path : " + r, MediaEntityBuilder.createScreenCaptureFromPath(r).build());
	
					 

						
					 	APP_LOGS.info("click select");
		
				l.clickselect();
				Thread.sleep(5000);
				

				 extentTest.log(Status.PASS, "select is CLICKED ");
				 
				extentTest.log(Status.INFO, "Snapshot below: ");

				r = BaseTest.getScreenshot(driver, method.getName());
				 extentTest.log(Status.INFO, "Screenshot  Path : " + r, MediaEntityBuilder.createScreenCaptureFromPath(r).build());
		
				 
				 //    	extentTest.log(Status.PASS, "Screenshot is"+extentTest.addScreenCaptureFromPath(r));
				

			//			extentTest.log(LogStatus.PASS, extentTest.addScreenCaptureFromPath(r));
				
					//	extent.flush();

	//			r = BaseTest.getScreenshot(driver, method.getName());

		/*	
				HomePage h=new HomePage(driver);
				
				h.clickArrow();
				

//				APP_LOGS.info("click arrrow down");
				
				h.Logout();
				*/
//			APP_LOGS.info("click logout");
		    	

     
		
	  
		
		
		}
	
	
	
	/*@Test(priority=2)
	public void DVSpotlight(Method method) throws Exception
	
	{

	
	extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/"+"AutomationLog_TestRunIdExtentReport.html", false);

	extentTest =extent.startTest(method.getName());

//	extentTest = extent.createTest("functionality1Test1");
		
	
	driver.get(url);
	
	
		
   	 Randomaplphanumber R=new Randomaplphanumber();
		  
  	String r=  R.Random();
		
			String un=Excel.getCellValue(XLPATH,"ValidLogin",6,0);
			String pw=Excel.getCellValue(XLPATH,"ValidLogin",6,1);
			String accnt=Excel.getCellValue(XLPATH,"ValidLogin",6,2);

			String cb=Excel.getCellValue(XLPATH,"Author",1,3);
			
			
		
	
//	Logger APP_LOGS = Logger.getLogger(ValidLogin.class);
			

			LoginPage l=new LoginPage(driver);
			

			
			BasePage b=new BasePage(driver);
			

			
			
	//		APP_LOGS.info("type username");un
			
		l.setUserName(un);
			
			
//			driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
			

//	        r= BaseTest.getScreenshot(driver, method.getName());

		
//		APP_LOGS.info("type password");
			 
			
  	extentTest.log(LogStatus.PASS, "username is Typed ");
			
			
			extentTest.log(LogStatus.INFO, "Snapshot below: ");
			
	        r= BaseTest.getScreenshot(driver, method.getName());
				
				
				extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
		
			
			 
			l.setPassword(pw);
			
			Thread.sleep(5000);

//	        r= BaseTest.getScreenshot(driver, method.getName());
				
	extentTest.log(LogStatus.PASS, "password is Typed ");
			
			
			extentTest.log(LogStatus.INFO, "Snapshot below: ");
	        r= BaseTest.getScreenshot(driver, method.getName());
				
				
				extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
		

		
	//		APP_LOGS.info("click select");
			
			l.clickLogin();
			
			Thread.sleep(5000);
			
			
			
            extentTest.log(LogStatus.PASS, "select is CLICKED ");
            
        	extentTest.log(LogStatus.INFO, "Snapshot below: ");
			
	        r= BaseTest.getScreenshot(driver, method.getName());
				
				
				extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
		
		
			
			
//	        r= BaseTest.getScreenshot(driver, method.getName());
				

	//		APP_LOGS.info("click dropdown ");
			
			
			
			l.dropdowntheaccount(accnt);
			Thread.sleep(5000);
		
			
			 extentTest.log(LogStatus.PASS, "dropdown is CLICKED ");
			 
				extentTest.log(LogStatus.INFO, "Snapshot below: ");
				
		        r= BaseTest.getScreenshot(driver, method.getName());
					
					
					extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
			

				
//		    r= BaseTest.getScreenshot(driver, method.getName());
					

//			APP_LOGS.info("click select");
			
	
			l.clickselect();
			Thread.sleep(5000);
			

			 extentTest.log(LogStatus.PASS, "select is CLICKED ");
			 
				extentTest.log(LogStatus.INFO, "Snapshot below: ");

			r = BaseTest.getScreenshot(driver, method.getName());
					
					
					extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
			
					extent.flush();

//			r = BaseTest.getScreenshot(driver, method.getName());

		
			HomePage h=new HomePage(driver);
			
			h.clickArrow();
			

//			APP_LOGS.info("click arrrow down");
			
			h.Logout();
			
//		APP_LOGS.info("click logout");
	}

*/
		
		}









