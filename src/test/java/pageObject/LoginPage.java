package pageObject;

import java.security.PublicKey;

import org.apache.poi.hssf.record.cf.DataBarFormatting;
import org.openqa.selenium.WebDriver;

import reusable.DriverHelper;
import uiStore.LoginpageUi;

public class LoginPage {

	WebDriver driver;
	DriverHelper helper;
	LoginpageUi ui;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new LoginpageUi();
		
	
	}
	public void SendContNo(String Data) throws InterruptedException {
		helper.sendKey(ui.login, driver,Data);
	}
}
