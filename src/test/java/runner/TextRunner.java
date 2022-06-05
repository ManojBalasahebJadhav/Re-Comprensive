package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="Features",
		glue={"stepDefinitions"},
		monochrome=true,
		plugin= {
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"html:test-output/cucumber_html_report"
				}
		)
		
public class TextRunner
{
	
}