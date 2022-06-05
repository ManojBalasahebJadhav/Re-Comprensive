package pageObject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;
import reusable.DriverHelper;
import uiStore.LoginpageUi;
import uiStore.RentalPageUi;

public class RentalPage {

	WebDriver driver;
	DriverHelper helper;
	RentalPageUi ui;
	
	public RentalPage(WebDriver driver) {
		this.driver=driver;
		helper=new DriverHelper();
		ui=new RentalPageUi();
	}
	public void ClickOn() throws InterruptedException {
		String mainWindow = driver.getWindowHandle();
		Set<String> all= driver.getWindowHandles();
		Iterator<String> it=all.iterator();
		while (it.hasNext()) {
			
			String child=it.next();
			if(!mainWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				Thread.sleep(3000);
				helper.clickOn(ui.pune, driver);
				
			}
		}
		driver.switchTo().window(mainWindow);
	}
	
}
