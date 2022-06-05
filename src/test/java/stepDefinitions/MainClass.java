package stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.AvoidBrokerPage;
import pageObject.Commercial;
import pageObject.EnquiryPage;
import pageObject.HomePage;
import pageObject.MenuPage;
import pageObject.MyBookingPage;
import pageObject.PaintAndCleanPage;
import pageObject.PayRent;
import pageObject.PostFreePage;
import pageObject.PropertyOwner;
import pageObject.RentalPage;
import uitility.BaseClass;
import uitility.BrowserFactory;
import uitility.Config;
import uitility.ExcelData;

public class MainClass extends BaseClass
{	
	public ExcelData excel;
	public Config read;
	@Given("user on website")
	public void user_on_website() throws InterruptedException
	{
		excel=new ExcelData();
		
		read=new Config();
		
		driver=BrowserFactory.startApplication(driver,read.getBrowser(),read.getUrl(),read.getDriver());
		System.out.println(driver.getTitle());
	}
	
	@When("click on Avoidbroker")
	public void click_on_Avoidbroker()
	{
		AvoidBrokerPage avoid = new AvoidBrokerPage(driver);
		avoid.clickOnAvoid();
	}
	
	@Then("close the page")
	public void close_the_page() {
		BrowserFactory.quitBroswer(driver);
	}
	
	@When("click on Commercial")
	public void click_on_Commercial() {
		Commercial Com = new Commercial(driver);
		Com.clickOnCom();
	}
	
	@When("click on Enquiry")
	public void click_on_Enquiry() {
		EnquiryPage Enquiry = new EnquiryPage(driver);
		Enquiry.clickOnEnquiry();
	}
	@When("click on menu")
	public void click_on_menu() {
		MenuPage menu = new MenuPage(driver);
		menu.clickOnmenu();
	}
	@When("click on MyBooking")
	public void click_on_MyBooking() throws InterruptedException {
		MyBookingPage book = new MyBookingPage(driver);
		book.clickOnBook();
		Thread.sleep(3000);
		book.clickOnClose();
	}
	@When("click on Paintclean")
	public void click_on_Paintclean() throws InterruptedException{
		PaintAndCleanPage Pay = new PaintAndCleanPage(driver);
		Pay.clickOnpaint();
        Pay.clickonClose();
	}
	
	@When("click on PayRent")
	public void click_on_PayRent() throws InterruptedException {
		PayRent Pay = new PayRent(driver);
		Pay.clickOnPay();
		Thread.sleep(3000);
	}
	@When("click on PostFree")
	public void click_on_PostFree() throws InterruptedException {
		PostFreePage Pay = new PostFreePage(driver);
		Pay.clickOnPost();
		Thread.sleep(3000);
	}
	@When("click on PropertyOwn")
	public void click_on_PropertyOwn() throws InterruptedException {
		PropertyOwner Pay = new PropertyOwner(driver);
		Pay.clickOnProp();
		Thread.sleep(3000);
	}
	@When("click on Rental")
	public void click_on_Rental() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.clickOnRental();
	
		RentalPage rental=new RentalPage(driver);
		rental.ClickOn();
		
		Thread.sleep(3000);
	}
}