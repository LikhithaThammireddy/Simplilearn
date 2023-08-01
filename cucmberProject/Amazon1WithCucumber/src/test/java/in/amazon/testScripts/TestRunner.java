package in.amazon.testScripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {
	@CucumberOptions(
	features="Features//buy_book.feature",
	glue="in.amazon.testScripts"
	)
	public class testRunner extends AbstractTestNGCucumberTests
	{
	
	}
}
