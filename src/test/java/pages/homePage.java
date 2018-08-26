package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;



public class homePage {
	
	private WebDriver driver;
	
	public homePage(){
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[@class='baz btn btnSml btnDefault signinButton menu-personalized__signinButton___1CxD']")
	public WebElement signInButton;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailLoginBox;
	
	@FindBy(xpath="//button[.='Submit']")
	public WebElement submitButton;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement passwordLoginBox;
	
	@FindBy(xpath="//button[@class='btn btnPrimary btnFullWidth']")
	public WebElement passwordSigninButton;
	
	@FindBy(xpath="//span[.='Medet.nurkulov']")
	public WebElement username;

}
