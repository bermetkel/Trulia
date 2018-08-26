package step_defs;

//Medet jindi

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.homePage;
import utilities.Driver;
import utilities.configurationReader;

public class homePageStepDefs {
	
	private WebDriver driver = Driver.getDriver();
	homePage homepage=new homePage();
	
	@Given("^user is on trulia webpage$")
	public void user_is_on_trulia_webpage() {
		driver.get(configurationReader.getProperty("url"));
		assertTrue(driver.getTitle().equals("Trulia: Real Estate Listings, Homes For Sale, Housing Data"));
		
	}

	@When("^user clicks on signIn button$")
	public void user_clicks_on_signIn_button() {
	   homepage.signInButton.click();
	   
	}

	@Then("^registration popup should be displayed$")
	public void registration_popup_should_be_displayed() {
	   assertTrue(homepage.emailLoginBox.isDisplayed());
	   assertTrue(homepage.submitButton.isDisplayed());
	}

	@Then("^user enters valid email$")
	public void user_enters_valid_email() {
	  homepage.emailLoginBox.sendKeys(configurationReader.getProperty("username"));
	  
	  
	}

	@Then("^clicks submit button$")
	public void clicks_submit_button() {
	 homepage.submitButton.click();
	}

	@Then("^password popup should be displayed$")
	public void password_popup_should_be_displayed() {
		
	  assertTrue(homepage.passwordLoginBox.isDisplayed());
	  assertTrue(homepage.passwordSigninButton.isDisplayed());
	}

	@Then("^user enters valid password$")
	public void user_enters_valid_password() {
	 homepage.passwordLoginBox.sendKeys(configurationReader.getProperty("password"));
	 
	}

	@Then("^user clicks submit button$")
	public void user_clicks_submit_button() {
	 homepage.passwordSigninButton.click();   
	}

	
	@Then("^userpage should be loaded and username should be displayed on right upper corner$")
	public void userpage_should_be_loaded_and_username_should_be_displayed_on_right_upper_corner() {
		 assertTrue(homepage.username.isDisplayed());
	}

}
