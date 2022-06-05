package pageObject;

import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.MenuPageUi;
import uiStore.PayRentUi;

public class PayRent {
	WebDriver driver;
	DriverHelper helper;
	PayRentUi ui;
	
	public PayRent(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new PayRentUi();
	}	
	public void clickOnPay() {
		helper.clickOn(ui.Pay,driver);
		System.out.println("Successfully click on payRentPage");
	
}
	}

