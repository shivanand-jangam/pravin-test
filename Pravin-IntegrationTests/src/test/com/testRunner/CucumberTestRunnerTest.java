package com.testRunner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BrowserFactory;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
features = ".\\src\\test\\resources\\features", 
glue = "com.stepdefination", 
tags = "@Testpravin",
plugin = {"pretty",
		"html:target/cucumber-reports/cucumber-pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class CucumberTestRunnerTest<CucumberFeatureWrapper> {
	private TestNGCucumberRunner testNGCucumberRunner;
	private BrowserFactory browserFactory;
	
	@BeforeClass
	public void beforeClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		browserFactory = new BrowserFactory();
	}
	
	@BeforeMethod
	public void setup() {
		browserFactory.openBrowser();
	}

	@Test(dataProvider = "scenarios", description = "Scenario Name: ")
	public void runScenario(PickleWrapper pickleEvent,
			CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runScenario(pickleEvent.getPickle());
	}
	
	@AfterMethod
	public void tearDown() {
		browserFactory.closeBrowser();
	}
	
	@DataProvider
	public Object[][] scenarios() {
		return testNGCucumberRunner.provideScenarios();
	}
	
}
