package pageObject;

import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.PayRentUi;
import uiStore.PostFreeUi;

public class PostFreePage {
	WebDriver driver;
	DriverHelper helper;
	PostFreeUi ui;
	
	public PostFreePage(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new PostFreeUi();
	}	
	public void clickOnPost() {
		helper.clickOn(ui.Pay,driver);
		System.out.println("Successfully click on PostFreePage");
	
	}
}
