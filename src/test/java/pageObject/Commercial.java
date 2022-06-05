package pageObject;

import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.CommercialPageUi;

public class Commercial {

	WebDriver driver;
	DriverHelper helper;
	CommercialPageUi ui;
	
	public Commercial(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new CommercialPageUi();
	}	
	public void clickOnCom() {
		helper.clickOn(ui.Com,driver);
		System.out.println("Successfully click on Buy");
	}
}
