package in.amazon.testScripts;

import org.openqa.selenium.chrome.ChromeDriver;

import amazon.pages.HomePage;
import amazon.pages.SignIn;


public class Driver extends Tools{
	protected static HomePage homepage;
	protected static SignIn signIn;
	
	
	public static void init() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		homepage=new HomePage(driver);
		signIn=new SignIn(driver);
		
}
		
	}
	


