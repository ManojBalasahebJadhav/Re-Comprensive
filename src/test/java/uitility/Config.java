package uitility;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
static Properties config;
	
	public Config() {
		config=new Properties();
		FileInputStream fis;
	    try {
			fis=new FileInputStream("./Configuration/Confi.properties");
			config.load(fis);
		} 
	    catch (Exception e) {
			System.out.println("File is not found >>>"+e.getMessage());
		}
	}
	
	public String getDriver() {
		String chromeDriverPath=config.getProperty("ChromeDriver");
		if(chromeDriverPath!=null) {
			return chromeDriverPath;
		}
		else {
			throw new RuntimeException("Chrome driver not specified");
		}
	}
	
	public String getUrl() {
		String url=config.getProperty("url");
		if(url !=null) {
			return url;
		}
		else {
			throw new RuntimeException("URL not specified");
		}
	}
	
	public String getExtentReportPath() {
		String extentReportPath=config.getProperty("ExtentReportPath");
		if(extentReportPath !=null) {
			return extentReportPath;
		}
		else {
			throw new RuntimeException("extentReportPath not specified");
		}
	}

	public String getBrowser() {
		String browser=config.getProperty("browserName");
		if(browser !=null) {
			System.out.println(browser);
			return browser;
		}
		else {
			throw new RuntimeException("browser not specified");
		}
	}


}
