package pageObject;

import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.HomePageUi;


public class HomePage {

			// TODO Auto-generated method stub
			
			WebDriver driver;
			DriverHelper helper;
			HomePageUi ui;
			
			public HomePage(WebDriver driver) {
				this.driver=driver;
				helper=new DriverHelper();
				ui=new HomePageUi();
			}
			
			
			public void clickOnRental() {
				helper.clickOn(ui.rental,driver);
				System.out.println("Successfully click on rental");
			}

			
			public void clickOnLogin() {
				helper.clickOn(ui.login,driver);
				System.out.println("Successfully click on login");
			}

	

}
