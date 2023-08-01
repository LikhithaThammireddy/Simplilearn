package in.swiggy.testScripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {
	@CucumberOptions(
	features="Features//place_the_order.feature",
	glue="in.swiggy.testScripts"
	)
	public class testRunner extends AbstractTestNGCucumberTests
	{
	
	}
}
