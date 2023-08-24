package in.sportyshoes.teststeps;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import in.sportyShoes.pages.AddProductToCartPage;
import in.sportyShoes.pages.LandingPage;
import in.sportyShoes.pages.LoginPage;
import in.sportyShoes.pages.PlaceOrderPage;
import in.sportyShoes.pages.RegisterPage;

public class Sportyshoes extends BaseTest
{

     @Test
	public void buyShoes() throws InterruptedException {
	LandingPage landingPage=new LandingPage(driver);
	landingPage.clickNewUserRegister();
	
	
	RegisterPage registerPage= new RegisterPage(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
    registerPage.enterName("LikhithaThammireddy");
	registerPage.enterEmail("likhitha@gmail.com");
	registerPage.enterPassword("Likhi@123");
    registerPage.clickRegisterButton();
    registerPage.clickLogout();
	
	LoginPage loginPage=new LoginPage(driver);
	loginPage.enterEmail("likhitha@gmail.com");
	loginPage.enterPassword("Likhi@123");
	loginPage.clickLogin();
	
	AddProductToCartPage addProductToCartPage=new AddProductToCartPage(driver);
	Thread.sleep(2000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,1000)", "");
	addProductToCartPage.oneItemAdded();
	addProductToCartPage.clickHome();
	
	PlaceOrderPage  placeOrderPage=new PlaceOrderPage(driver);
	placeOrderPage.clickCart();
    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("window.scrollBy(0,400)", "");
    placeOrderPage.clickOnPlaceOrder();
	
	String exceptedErrmsg="Success!";
    String actualErrmsg=placeOrderPage.verifyText();
    Assert.assertEquals(exceptedErrmsg,actualErrmsg);
}
}

