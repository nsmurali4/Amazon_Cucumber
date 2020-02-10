package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPage {

	WebDriver driver;	
	
	
	@Given("^User launch chrome browser and start the application$")
	public void user_launch_chrome_browser_and_start_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lap\\eclipse-workspace\\Amazon_Cucumber\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}

	@When("^User entered valid \"(.*)\" and valid \"(.*)\"$")
	public void user_entered_valid_username_and_valid_password(String username, String password) throws Throwable {	 
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

	@Then("^User entered into the home page successfully$")
	public void user_entered_into_the_home_page_successfully() throws Throwable {
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", title);
	}
	
	@Then("^User entered \"([^\"]*)\" in the search box and clicks the search button$")
	public void user_entered_in_the_search_box_and_clicks_the_search_button(String productname) throws Throwable {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(productname);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^User selected the first product in the list$")
	public void user_selected_the_first_product_in_the_list() throws Throwable {
		driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']/img[@data-image-index='0']")).click();
	}

	@Then("^User clicked Add to Cart button$")
	public void user_clicked_Add_to_Cart_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}

	@Then("^User verified the product added in to cart$")
	public void user_verified_the_product_added_in_to_cart() throws Throwable {			
		String cart = driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
		System.out.println(cart);
		Assert.assertEquals("1", cart);	   
	}

	@Then("^User clicked Proceed to checkout button$")
	public void user_clicked_Proceed_to_checkout_button() throws Throwable {
		driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
	}
	
}
