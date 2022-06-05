package pageObject;

import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.MenuPageUi;
import uiStore.PaintAndCleanPageUi;

public class PaintAndCleanPage {

	WebDriver driver;
	DriverHelper helper;
	PaintAndCleanPageUi ui;
	
	public PaintAndCleanPage(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new PaintAndCleanPageUi();
	}	
	public void clickOnpaint() {
		helper.clickOn(ui.pain,driver);
		System.out.println("Successfully click on pent");
	
}
	public void clickonClose() {
		// TODO Auto-generated method stub
		helper.clickOn(ui.pain,driver);
		System.out.println("Successfully click on close");
	}
}
