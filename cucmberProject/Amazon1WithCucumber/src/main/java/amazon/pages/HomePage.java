package amazon.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private Actions actions;
	private WebDriverWait wait;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	@FindBy(xpath="//div[contains(@class,'autocomplete-results-container')][1]")
	WebElement fullBox;
	@FindBy(xpath="//section[contains(@aria-label,'4 Stars & Up')]")
	 WebElement stars;
	@FindBy(xpath="//div[contains(@class,'s-product-image-container')][1]")
	 WebElement firstBook;
	@FindBy(id="add-to-cart-button")
	WebElement addCart;
	@FindBy(xpath="//span[contains(@class,'a-size-medium-plus a-color-base sw-atc-text a-text-bold')][1]")
	WebElement text;
	@FindBy(linkText="Go to Cart")
	WebElement goToCart;
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedToBuy;
	      
public HomePage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	 actions=new Actions(driver);
	 wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	 
}
public void searchProductName(String item) {
	searchBox.sendKeys(item);
	wait.until(ExpectedConditions.visibilityOfAllElements(fullBox));
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}


	public void fourStars() throws InterruptedException
	{
		Thread.sleep(2000);
		stars.click();
		
	}
	public void firstItem() throws InterruptedException 
	{
		Thread.sleep(2000);
		firstBook.click();
		
	}
	public void addToCart() throws InterruptedException {
		Thread.sleep(2000);
		addCart.click();
	}
	public String getMsg() {
		String message=text.getText();
		return message;
	}
	public void viewCart()  throws InterruptedException{
		Thread.sleep(2000);
	goToCart.click();
	}
	
   public void buyBook()  throws InterruptedException{
		Thread.sleep(2000);
	proceedToBuy.click();
	}
  
  

	
	
}

