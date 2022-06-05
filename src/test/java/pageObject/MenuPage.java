package pageObject;

import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.MenuPageUi;

public class MenuPage {


	WebDriver driver;
	DriverHelper helper;
	MenuPageUi ui;
	
	public MenuPage(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new MenuPageUi();
	}	
	public void clickOnmenu() {
		helper.clickOn(ui.menu,driver);
		System.out.println("Successfully click on menu");
	
}
}
