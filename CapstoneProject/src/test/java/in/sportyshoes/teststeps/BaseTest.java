package in.sportyshoes.teststeps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		//open the driver
		driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//navigate to application
		driver.get("http://localhost:9010");
	}
	@AfterTest
	//close the browser
	public void closeBrowser() {
		driver.quit();
	}
	

}
