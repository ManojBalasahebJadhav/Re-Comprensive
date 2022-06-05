package pageObject;

import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.EnquiryPageUi;

public class EnquiryPage {

	WebDriver driver;
	DriverHelper helper;
	EnquiryPageUi ui;
	
	public EnquiryPage(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new EnquiryPageUi();
	}	
	public void clickOnEnquiry() {
		helper.clickOn(ui.Enquiry,driver);
		System.out.println("Successfully click on Enquiry");
	}
}
