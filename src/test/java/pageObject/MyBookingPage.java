package pageObject;

import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.MenuPageUi;
import uiStore.MyBookingPageUi;

public class MyBookingPage {
	WebDriver driver;
	DriverHelper helper;
	MyBookingPageUi ui;
	
	public MyBookingPage(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new MyBookingPageUi();
	}	
	public void clickOnBook() {
		helper.clickOn(ui.book,driver);
		System.out.println("Successfully click on Book");
	}
	public void clickOnClose() {
		// TODO Auto-generated method stub
		helper.clickOn(ui.close,driver);
		System.out.println("Successfully click on close");
	}
	
}
