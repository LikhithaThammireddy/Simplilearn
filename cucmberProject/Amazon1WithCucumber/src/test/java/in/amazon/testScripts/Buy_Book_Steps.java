package in.amazon.testScripts;
import java.util.ArrayList;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Buy_Book_Steps extends Driver {
	@Given("a user is in home page of amazon")
	public void a_user_is_in_home_page_of_amazon() {
		
	}

	@When("Type {string} in the search box and then select 3rd option from the drop-down")
	public void type_in_the_search_box_and_then_select_3rd_option_from_the_drop_down(String string) {
		
		homepage.searchProductName("physics books");
	}

	@When("select fourstars & up rating")
	public void select_fourstars_up_rating() throws InterruptedException {
		homepage.fourStars();
	}

	@When("select  first book")
	public void select_first_book() throws InterruptedException {
		homepage.firstItem();
	}

	@When("Click {string} button")
	public void click_button(String string) throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		homepage.addToCart();
	}

	@When("Verify the text - {string} is displayed")
	public void verify_the_text_is_displayed(String string) {
		String exceptedErrmsg = "Added to Cart";
		String actualErrmsg = homepage.getMsg();
		Assert.assertEquals(exceptedErrmsg, actualErrmsg);
	}

	@When("click on Go to cart")
	public void click_on_go_to_cart() throws InterruptedException {
		homepage.viewCart();
	}

	@When("Click on {string} button")
	public void click_on_button(String string) throws InterruptedException {
		homepage.buyBook();
	}

	@Then("Verify user is on the Sign in page he able to purchase the book successfully")
	public void verify_user_is_on_the_sign_in_page_he_able_to_purchase_the_book_successfully() {

		String expectedText = "Sign in";
		String actualText = signIn.getSignInText();
		Assert.assertEquals(actualText, expectedText);

	}

}
