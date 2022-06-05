package uitility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pageObject.HomePage;
import pageObject.LoginPage;

public class BaseClass {
	public WebDriver driver;
	//public ExtentReportListener re;
	public ExcelData excel;
	public Config read;
	//public Logger log;
	public ExtentTest logger;
	public ExtentReports report;
    public ExtentHtmlReporter extent;
	
	 
	@BeforeSuite
	public void setUpSuit() {
		 Reporter.log("Setting up report and test is getting ready",true);
		 excel=new ExcelData();
		extent=new ExtentHtmlReporter(new File("./Reports/"+ScreenShots.getcurrentDateTime()+".html"));
		 report=new ExtentReports();
		 Reporter.log("Setting done -Test can be started",true);
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException, IOException {
		
		
		 report.attachReporter(extent);
		excel=new ExcelData();
		
		read=new Config();
		
		driver=BrowserFactory.startApplication(driver,read.getBrowser(),read.getUrl(),read.getDriver());
		System.out.println(driver.getTitle());
		//HomePage home=new HomePage(driver);
		//home.clickOnLogin();
	
	}
	
	    // @Test
	/*     public void Home () throws InterruptedException {
	    	 HomePage home=new HomePage(driver);
	 		home.clickOnLogin();
	 	
	 		
	 		LoginPage login=new LoginPage(driver);
	 		login.SendContNo(String.valueOf(excel.getNumberData("Sheet1", 0, 0)));
			Thread.sleep(3000);// TODO Auto-generated method stub
			}
 */
		
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBroswer(driver);
	}
	
	@AfterMethod
	public void tearDownM(ITestResult result) throws IOException {
		
		Reporter.log("Test is about to end",true);
		if(result.getStatus()==ITestResult.FAILURE)
		{
			ScreenShots.takeScreenShot(driver);
			logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(ScreenShots.takeScreenShot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			ScreenShots.takeScreenShot(driver);
			logger.pass("Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(ScreenShots.takeScreenShot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			
			logger.skip("Test Skipped");
		}
	report.flush();
		Reporter.log("Test completed >>>Report generated",true);
	}
	

}
