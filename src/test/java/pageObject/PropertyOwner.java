package pageObject;

import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.ForpropertyownerUi;
//import uiStore.MenuPageUi;

public class PropertyOwner {
	WebDriver driver;
	DriverHelper helper;
	ForpropertyownerUi ui;
	
	public PropertyOwner(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new ForpropertyownerUi();
	}	
	public void clickOnProp() {
		helper.clickOn(ui.ownBy,driver);
		System.out.println("Successfully click on for property own");
	
}
	
}
