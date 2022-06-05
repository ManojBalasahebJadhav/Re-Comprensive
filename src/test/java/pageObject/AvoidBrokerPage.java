package pageObject;

import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.AvoidBrokerPageUi;


public class AvoidBrokerPage {

	WebDriver driver;
	DriverHelper helper;
	AvoidBrokerPageUi ui;
	
	

	public AvoidBrokerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
	//public void AvoidBrokerPage(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new AvoidBrokerPageUi();
	}	
	public void clickOnAvoid() {
		helper.clickOn(ui.avoid,driver);
		System.out.println("Successfully click on Avoid");
	}
	public void clickOnClose() {
		// TODO Auto-generated method stub
		helper.clickOn(ui.avoid,driver);
		System.out.println("Successfully click on close");
	}
}
